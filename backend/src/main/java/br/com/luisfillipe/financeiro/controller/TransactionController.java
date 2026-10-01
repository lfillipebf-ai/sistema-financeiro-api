package br.com.luisfillipe.financeiro.controller;
import br.com.luisfillipe.financeiro.model.*;
import br.com.luisfillipe.financeiro.repository.*;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
@RestController @RequestMapping("/api/transactions")
public class TransactionController {
 private final TransactionRepository transactions; private final CategoryRepository categories; private final AccountRepository accounts;
 public TransactionController(TransactionRepository t,CategoryRepository c,AccountRepository a){transactions=t;categories=c;accounts=a;}
 @GetMapping public List<TransactionEntity> all(){return transactions.findAll();}
 @GetMapping("/period") public List<TransactionEntity> period(@RequestParam LocalDate start,@RequestParam LocalDate end){return transactions.findByDateBetween(start,end);}
 @GetMapping("/balance") public BigDecimal balance(){
  return transactions.findAll().stream().map(t->t.getType()==TransactionType.INCOME?t.getAmount():t.getAmount().negate()).reduce(BigDecimal.ZERO,BigDecimal::add);
 }
 @PostMapping public TransactionEntity create(@RequestBody TransactionRequest req){
  TransactionEntity t=new TransactionEntity(); t.setDescription(req.description()); t.setAmount(req.amount()); t.setDate(req.date()); t.setType(req.type());
  t.setCategory(categories.findById(req.categoryId()).orElseThrow()); t.setAccount(accounts.findById(req.accountId()).orElseThrow());
  return transactions.save(t);
 }
 public record TransactionRequest(String description,BigDecimal amount,LocalDate date,TransactionType type,Long categoryId,Long accountId){}
}

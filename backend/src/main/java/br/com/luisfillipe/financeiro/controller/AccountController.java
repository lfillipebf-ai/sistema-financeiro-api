package br.com.luisfillipe.financeiro.controller;
import br.com.luisfillipe.financeiro.model.Account;
import br.com.luisfillipe.financeiro.repository.AccountRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/accounts")
public class AccountController {
 private final AccountRepository repo;
 public AccountController(AccountRepository repo){this.repo=repo;}
 @GetMapping public List<Account> all(){return repo.findAll();}
 @PostMapping public Account create(@Valid @RequestBody Account a){return repo.save(a);}
}

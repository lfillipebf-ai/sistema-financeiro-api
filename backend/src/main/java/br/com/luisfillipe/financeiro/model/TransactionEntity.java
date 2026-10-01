package br.com.luisfillipe.financeiro.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity @Table(name="transactions")
public class TransactionEntity {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String description;
 @Positive private BigDecimal amount;
 private LocalDate date;
 @Enumerated(EnumType.STRING) private TransactionType type;
 @ManyToOne(optional=false) private Category category;
 @ManyToOne(optional=false) private Account account;
 public TransactionEntity(){}
 public Long getId(){return id;} public String getDescription(){return description;} public void setDescription(String v){description=v;}
 public BigDecimal getAmount(){return amount;} public void setAmount(BigDecimal v){amount=v;}
 public LocalDate getDate(){return date;} public void setDate(LocalDate v){date=v;}
 public TransactionType getType(){return type;} public void setType(TransactionType v){type=v;}
 public Category getCategory(){return category;} public void setCategory(Category v){category=v;}
 public Account getAccount(){return account;} public void setAccount(Account v){account=v;}
}

package br.com.luisfillipe.financeiro.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
@Entity @Table(name="accounts")
public class Account {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String name;
 @PositiveOrZero private BigDecimal initialBalance=BigDecimal.ZERO;
 public Account(){}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public BigDecimal getInitialBalance(){return initialBalance;} public void setInitialBalance(BigDecimal v){initialBalance=v;}
}

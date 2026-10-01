package br.com.luisfillipe.financeiro.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity @Table(name="categories")
public class Category {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String name;
 public Category(){}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
}

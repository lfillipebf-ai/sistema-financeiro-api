package br.com.luisfillipe.financeiro.controller;
import br.com.luisfillipe.financeiro.model.Category;
import br.com.luisfillipe.financeiro.repository.CategoryRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/categories")
public class CategoryController {
 private final CategoryRepository repo;
 public CategoryController(CategoryRepository repo){this.repo=repo;}
 @GetMapping public List<Category> all(){return repo.findAll();}
 @PostMapping public Category create(@Valid @RequestBody Category c){return repo.save(c);}
}

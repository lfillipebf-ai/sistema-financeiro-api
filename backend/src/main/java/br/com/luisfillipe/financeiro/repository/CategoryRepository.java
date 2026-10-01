package br.com.luisfillipe.financeiro.repository;
import br.com.luisfillipe.financeiro.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository extends JpaRepository<Category,Long>{}

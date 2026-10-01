package br.com.luisfillipe.financeiro.repository;
import br.com.luisfillipe.financeiro.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AccountRepository extends JpaRepository<Account,Long>{}

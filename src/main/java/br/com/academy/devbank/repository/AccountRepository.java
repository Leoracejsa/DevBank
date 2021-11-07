package br.com.academy.devbank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.academy.devbank.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query(value = "SELECT * FROM ACCOUNT where numberAccount = ? " , nativeQuery = true)
	Optional<Account>findByNumberAccount(@Param("numberAccount") Integer numberAccount);
}

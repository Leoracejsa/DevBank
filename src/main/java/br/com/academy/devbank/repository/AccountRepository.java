package br.com.academy.devbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.academy.devbank.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}

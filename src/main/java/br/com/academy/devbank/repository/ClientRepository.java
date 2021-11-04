package br.com.academy.devbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.academy.devbank.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}

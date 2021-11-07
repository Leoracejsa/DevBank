package br.com.academy.devbank.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import br.com.academy.devbank.entity.Transactions;
import br.com.academy.devbank.repository.TransactionRepository;

@Service
public class TransactionService {
	
	
	TransactionRepository transactionRepository;

	
	public List<Transactions> findAll() {
		return transactionRepository.findAll();
	}

	
	public Transactions insert(Transactions body) {
		return transactionRepository.save(body);
	}

	
	public Transactions findById(Integer id) {
		return transactionRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Transação numero" + id + "não encontrada"));
		
		
	}


}

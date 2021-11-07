package br.com.academy.devbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academy.devbank.entity.Transactions;
import br.com.academy.devbank.service.TransactionService;

@RestController
@RequestMapping(value = "/historyTransactions")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionsService;
	
	@GetMapping(value = "/findAll")
	public ResponseEntity<List<Transactions>> findAll(){
		return ResponseEntity.ok().body(transactionsService.findAll());
	}
	
	@GetMapping(value = "/findById")
	public ResponseEntity<Transactions> findById(@PathVariable Integer id){
		return ResponseEntity.ok().body(transactionsService.findById(id));
	}

}

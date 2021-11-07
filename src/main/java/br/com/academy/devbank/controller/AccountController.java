package br.com.academy.devbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academy.devbank.DTO.TransferInAccountsDTO;
import br.com.academy.devbank.entity.Account;
import br.com.academy.devbank.service.AccountService;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

	@Autowired
	private AccountService accountService;


	@GetMapping(value = "/{id}")
	public ResponseEntity<Account> getContaId(@PathVariable Integer id){
		return ResponseEntity.ok().body(accountService.findById(id));		
	}

	@GetMapping(value = "/findAll")
	public ResponseEntity<List<Account>>findAll(){
		return ResponseEntity.ok().body(accountService.findAll());
	}	

	@PostMapping(value = "/transferAccounts")
	public ResponseEntity<TransferInAccountsDTO> transferInAccounts (@RequestBody TransferInAccountsDTO transfer){		
		return ResponseEntity.ok().body(accountService.transfer(transfer));
	}

	@GetMapping(value = "/numberAccount/{id}")
	public Account findByNumberAccount(@PathVariable Integer numberAccount) {
		return accountService.findByNumberAccount(numberAccount);
	}
	
}

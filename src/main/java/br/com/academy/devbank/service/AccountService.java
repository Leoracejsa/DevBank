package br.com.academy.devbank.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.devbank.DTO.TransferInAccountsDTO;
import br.com.academy.devbank.entity.Account;
import br.com.academy.devbank.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;

	
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	
	public Account insert(Account body) {
		return accountRepository.save(body);
	}

	
	public Account findById(Integer id) {	
		return accountRepository.findById(id).orElseThrow(() -> 
		new EntityNotFoundException("Conta id numero " + id + "não encontrada")
				) ;
	}

	public Account findByNumberAccount(Integer numberAccount) {
		return accountRepository.findByNumberAccount(numberAccount)
				.orElseThrow(() -> new EntityNotFoundException("Numero de conta não Existe " + numberAccount));
	}
	
	public TransferInAccountsDTO transfer(TransferInAccountsDTO transfer) {
		Account origem = findByNumberAccount(transfer.getNumberAccountOrigin());
		Account destiny = findByNumberAccount(transfer.getNumberAccountOriginRecipient());	
		
		origem.setAccountBalance(origem.getAccountBalance().subtract(transfer.getTransferValue()));		
		destiny.setAccountBalance(destiny.getAccountBalance().add(transfer.getTransferValue()));		
		updateValue(origem);
		updateValue(destiny);
		TransferInAccountsDTO tranferSucess = new TransferInAccountsDTO();
		tranferSucess.setNumberAccountOrigin(origem.getNumberAccount());
		tranferSucess.setNumberAccountOrigin(destiny.getNumberAccount());
		tranferSucess.setTransferValue(tranferSucess.getTransferValue());
		tranferSucess.setMessage("Tranferencia Realizada Com Sucesso");		
		return tranferSucess; 
	}	
	

	public Account updateValue(Account account) {
		return accountRepository.save(account);
	}

}
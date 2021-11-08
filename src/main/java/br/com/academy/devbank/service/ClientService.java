package br.com.academy.devbank.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.devbank.entity.Client;
import br.com.academy.devbank.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	
	public Client insert(Client body) {
		return clientRepository.save(body);
	}

	
	public Client findById(Integer id) {
		return clientRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Customer Not Found" + id));
	}


}

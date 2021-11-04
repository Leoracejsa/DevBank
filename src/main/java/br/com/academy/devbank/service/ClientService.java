package br.com.academy.devbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.devbank.entity.Client;
import br.com.academy.devbank.repository.ClientRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	
	public Client insert(Client body) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Optional<Client> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Client update(Integer id, Client body) throws ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

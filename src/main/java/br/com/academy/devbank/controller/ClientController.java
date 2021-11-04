package br.com.academy.devbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academy.devbank.entity.Client;
import br.com.academy.devbank.service.ClientService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping(value = "/insert")
	public ResponseEntity<Client> insert(Client body) throws ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping(value = "/findAllClient")
	public ResponseEntity<List<Client>> listAll() {
		return ResponseEntity.ok().body(clientService.findAll()); 
	}

	@GetMapping(value = "findById/{id}")
	public ResponseEntity<Optional<Client>> findbyId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Client> update(Integer id, Client body) throws ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

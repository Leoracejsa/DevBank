package br.com.academy.devbank.DTO;

import br.com.academy.devbank.entity.Client;
import lombok.Data;

@Data
public class ClientDTO {
	
	private Integer idClient;
	
	private String name;
	
	private String cpf;
	
	private String password;

	public ClientDTO(Client cliente) {

	}
	

}

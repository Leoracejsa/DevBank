package br.com.academy.devbank.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {


	private static final long serialVersionUID = -1710581238814904218L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDCLIENT")
	private Integer idClient;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "MAIL")
	private String mail;

	@Column(name = "PASSWORD")
	private String password;
	
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Account> account;

}

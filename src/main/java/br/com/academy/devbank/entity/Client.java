package br.com.academy.devbank.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@OneToMany(targetEntity = Account.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "IDCLIENT", referencedColumnName = "IDCLIENT")
	private List<Account> account;

}

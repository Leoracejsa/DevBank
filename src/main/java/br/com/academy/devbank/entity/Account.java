package br.com.academy.devbank.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {
	private static final long serialVersionUID = -6283392013950645824L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDACCOUNT")
	private Integer idAccount;

	@Column(name = "NUMBERACCOUNT")
	private Integer numberAccount;

	@Enumerated(EnumType.STRING)
	@Column(name = "TYPEACCOUNT")
	private TypeAccount typeAccount;

	@Column(name = "ACCOUNTBALANCE")
	private BigDecimal accountBalance;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "IDCLIENT")
	private Client client;

	@OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
	private List<Transactions> transactions;
	

	public Account() {
		super();
	}
	

	public Account(Integer idAccount, Integer numberAccount, TypeAccount typeAccount, BigDecimal accountBalance,
			Client client, List<Transactions> transactions) {
		super();
		this.idAccount = idAccount;
		this.numberAccount = numberAccount;
		this.typeAccount = typeAccount;
		this.accountBalance = accountBalance;
		this.client = client;
		this.transactions = transactions;
	}



	public Integer getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}

	public Integer getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(Integer numberAccount) {
		this.numberAccount = numberAccount;
	}

	public TypeAccount getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(TypeAccount typeAccount) {
		this.typeAccount = typeAccount;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}


	

}


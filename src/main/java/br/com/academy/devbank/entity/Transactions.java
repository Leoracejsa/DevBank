package br.com.academy.devbank.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TRANSACTIONS")
public class Transactions implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDTRANSACTION")
	private Integer idTransaction;

	@Column(name = "DESCRIBLE")
	private String describle;
	
	@Column(name = "VALUETRANSACTION")
	private BigDecimal valueTransaction;

	@Column(name = "DATETRANSACTION")
	@CreationTimestamp
	private LocalDateTime dateTransaction;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "IDACCOUNT")
	private Account account;
	
}

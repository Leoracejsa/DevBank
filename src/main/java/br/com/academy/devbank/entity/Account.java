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
import org.hibernate.Transaction;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}

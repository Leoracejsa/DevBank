package br.com.academy.devbank.DTO;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class TransferInAccountsDTO {
	
	private Integer numberAccountOrigin;

	private Integer numberAccountOriginRecipient;

	private BigDecimal transferValue;

	private String message;
	
	

	public TransferInAccountsDTO() {
		super();
	}
	
	

	public TransferInAccountsDTO(Integer numberAccountOrigin, Integer numberAccountOriginRecipient,
			BigDecimal transferValue, String message) {
		super();
		this.numberAccountOrigin = numberAccountOrigin;
		this.numberAccountOriginRecipient = numberAccountOriginRecipient;
		this.transferValue = transferValue;
		this.message = message;
	}



	public Integer getNumberAccountOrigin() {
		return numberAccountOrigin;
	}

	public void setNumberAccountOrigin(Integer numberAccountOrigin) {
		this.numberAccountOrigin = numberAccountOrigin;
	}

	public Integer getNumberAccountOriginRecipient() {
		return numberAccountOriginRecipient;
	}

	public void setNumberAccountOriginRecipient(Integer numberAccountOriginRecipient) {
		this.numberAccountOriginRecipient = numberAccountOriginRecipient;
	}

	public BigDecimal getTransferValue() {
		return transferValue;
	}

	public void setTransferValue(BigDecimal transferValue) {
		this.transferValue = transferValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

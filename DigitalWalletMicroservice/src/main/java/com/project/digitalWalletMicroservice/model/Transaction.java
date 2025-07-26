package com.project.digitalWalletMicroservice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Transaction_Details")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long transactionId;
	@Column
	@NotNull
	private long walletId;
	@Column
	@NotNull
	private BigDecimal amount;
	
	@Column
	@NotNull
	private String transactionType;
	
	@Column
	private LocalDateTime timestamp;
	@Column
	@NotNull
	private String status;

}

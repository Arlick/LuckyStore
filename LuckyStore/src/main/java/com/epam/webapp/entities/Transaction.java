package com.epam.webapp.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Transaction {
	private int idTrans;
	private int idUser;
	private BigDecimal transAmount;
	private Timestamp creatAt;
	private String status;

	public Transaction() {

	}

	public Transaction(int idTrans, int idUser, BigDecimal transAmount, Timestamp creatAt, String status) {
		this.idTrans = idTrans;
		this.idUser = idUser;
		this.transAmount = transAmount;
		this.creatAt = creatAt;
		this.status = status;
	}

	public int getIdTrans() {
		return idTrans;
	}

	public void setIdTrans(int idTrans) {
		this.idTrans = idTrans;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public BigDecimal getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(BigDecimal transAmount) {
		this.transAmount = transAmount;
	}

	public Timestamp getCreatAt() {
		return creatAt;
	}

	public void setCreatAt(Timestamp creatAt) {
		this.creatAt = creatAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

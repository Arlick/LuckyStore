package com.epam.webapp.entities;

import java.math.BigDecimal;

public class Order {
	private int idOrder;
	private int idTransaction;
	private int idProduct;
	private int quantity;
	private BigDecimal amount;

	public Order() {

	}

	public Order(int idOrder, int idTransaction, int idProduct, int quantity, BigDecimal amount) {
		this.idOrder = idOrder;
		this.idTransaction = idTransaction;
		this.idProduct = idProduct;
		this.quantity = quantity;
		this.amount = amount;
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public int getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}

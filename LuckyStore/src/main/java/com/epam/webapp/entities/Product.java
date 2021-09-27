package com.epam.webapp.entities;

import java.math.BigDecimal;

public class Product {
	private int idProduct;
	private String name;
	private BigDecimal price;
	private String category;
	private String image;

	public Product() {

	}

	public Product(int idProduct, String name, BigDecimal price, String category, String image) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.price = price;
		this.category = category;
		this.image = image;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}

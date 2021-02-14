package com.oauth2lab.info;

public class BookPriceInfo {
	private Integer bookId;
	private double price;
	private double offer;
	private String bookname;

	public BookPriceInfo(Integer bookId, double price, double offer,String bookname) {
		this.bookId = bookId;
		this.price = price;
		this.offer = offer;
		this.bookname = bookname;
	}


	public Integer getBookId() {
		return bookId;
	}


	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getOffer() {
		return offer;
	}


	public void setOffer(double offer) {
		this.offer = offer;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	@Override
	public String toString() {
		return bookId + ", " + price + ", " + offer+" ,"+bookname;
	} 


}

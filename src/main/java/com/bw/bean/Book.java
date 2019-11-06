package com.bw.bean;

public class Book {
	private Integer id;
	private String name;
	private String type;
	private String bookname;
	private int price;
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", type=" + type + ", bookname=" + bookname + ", price=" + price
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

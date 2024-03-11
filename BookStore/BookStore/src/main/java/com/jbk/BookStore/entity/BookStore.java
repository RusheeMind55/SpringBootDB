package com.jbk.BookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookStore {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int Book_id;
	String Name;
	int price;
	
	public BookStore() {
		
		
	}
	public BookStore(int book_id, String name, int price) {
		super();
		Book_id = book_id;
		Name = name;
		this.price = price;
	}
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookStore [Book_id=" + Book_id + ", Name=" + Name + ", price=" + price + "]";
	}
	

}

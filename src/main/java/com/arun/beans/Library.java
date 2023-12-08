package com.arun.beans;

public class Library 
{
	private Book book;
	
	public Library()
	{
		System.out.println("Libraray Object is Created");
	}

	@Override
	public String toString() {
		return "Library [book=" + book + "]";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Library(Book book) {
		super();
		this.book = book;
	}
	
	public boolean selection()
	{
		return book.bookSelected();
	}
	

}

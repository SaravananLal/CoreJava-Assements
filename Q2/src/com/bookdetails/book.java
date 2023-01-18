package com.bookdetails;

public class book {

	String bookname;
	Author author;
	public book(String bookname, Author author, String pages, int cost, int booknumber) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.pages = pages;
		this.cost = cost;
		this.booknumber = booknumber;
	}
	String pages;
	int cost;
	int booknumber;
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}
}

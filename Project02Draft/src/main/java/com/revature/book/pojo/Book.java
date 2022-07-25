package com.revature.book.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity

@NamedQuery (name= "getBookByISBN" , query= "FROM Book b where ISBN=:b_ISBN")
@NamedQuery (name= "removeBookByISBN" , query= "delete FROM Book b where ISBN=:b_ISBN")
public class Book {
	@Column(name= "Book_Title")
	private String Title;
	
	@Column(name= "Subect_Type")
	private String Subject;
	
	@Column(name= "Author_Name")
	private String Author;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ISBN;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public Book() {
		super();
	}
	public Book(String title, String subject, String author, int iSBN) {
		super();
		Title = title;
		Subject = subject;
		Author = author;
		ISBN = iSBN;
	}
	public Book(String title, String subject, String author) {
		super();
		Title = title;
		Subject = subject;
		Author = author;
	}
	@Override
	public String toString() {
		return "Book [Title=" + Title + ", Subject=" + Subject + ", Author=" + Author + ", ISBN=" + ISBN + "]";
	}

}

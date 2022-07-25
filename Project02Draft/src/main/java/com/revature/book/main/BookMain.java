package com.revature.book.main;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.book.pojo.Book;
import com.revature.book.util.HibernateUtil;
//logs works, they wont show in console but in a folder
public class BookMain {
	public static void main(String[] args) {
		Session session= HibernateUtil.getSessionFactory().openSession();
//		Book b = new Book("One-Piece","Fantasy" ,"Young-Shonen");
//		Transaction tx = session.beginTransaction();
//		session.save(b); // saves object to table
//		tx.commit(); //commits
//		
//		Query bookQuery = session.getNamedQuery("getBookByISBN");
//		bookQuery.setParameter("b_ISBN", 5); //b is the object, 5 is the value within persisting in database
//		List<Book> bookList = bookQuery.getResultList();
//		for(Book b : bookList) System.out.println(b);
		
		//List<Book> bookList = (List<Book>) session.getNamedQuery("getBookByISBN");
		
		 List<Book> bookList=(List<Book>) session.createQuery("from Book b").list();
	    
		    for(Book b: bookList) {
		        System.out.println(b.getISBN() +" - "+b.getTitle());
//		         Logger log = LogManager.getLogger(Book.class);
//		         //log.info("Success");
//		         //log.error("NOT Success");
//		    //log.info(b.getAuthor()); //this will log info
//		    log.error(b.getSubject());
		    }System.out.println("---------------------------------------------");
//		    Logger log2 = LogManager.getLogger(Book.class);
		    //log2.info("Success");
		    //log2.error("1");
		    //log2.trace("trace level");
		    
	}

}

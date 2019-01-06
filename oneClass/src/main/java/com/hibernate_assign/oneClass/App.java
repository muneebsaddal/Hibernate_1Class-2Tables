package com.hibernate_assign.oneClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class App {
	
	public static void main(String[] args) {
		Configuration cg = new Configuration().configure().addAnnotatedClass(Customer.class);
		SessionFactory sessionFactory = cg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
//		insertData(session);
//		showData(session);
//		deleteById(session);
//		updateById(session);
		updateQuery(session);
		selectQuery(session);
		deleteQuery(session);
		
		session.close();
		sessionFactory.close();
	}
	
	public static void insertData(Session session) {
		Customer customer = new Customer();
		customer.setCustomerAddress("H no 123, Street abc, City blank");
		customer.setCreditScore(4);
		customer.setRewardPoints(3);
		customer.setCustomerId(2);
		customer.setCustomerName("b");
		Transaction trans = session.beginTransaction();
		session.save(customer);
		trans.commit();
	}
	
	private static void showData(Session session) {
		Transaction trans = session.beginTransaction();
	    CriteriaBuilder builder = session.getCriteriaBuilder();
	    CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
	    criteria.from(Customer.class);
	    List<Customer> result = session.createQuery(criteria).getResultList();
	    for(Customer i:result) {
	    	System.out.println(i.toString());
	    }
	    trans.commit();
	    session.close();
	}
	
	public static void deleteById(Session session) {		
		Customer id = new Customer();
		id.setCustomerId(1);
		Transaction trans = session.beginTransaction();
		session.delete(id);
		trans.commit();
	}
	
	public static void updateById(Session session) {
		Customer id = (Customer) session.load(Customer.class, new Integer(0));
        id.setCustomerName("some one");
        Transaction trans = session.beginTransaction();
        session.update(id);
		trans.commit();
	}
	
	
	public static void selectQuery(Session session) {
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("from Customer where customerId= :id ");
		query.setParameter("id", 1);
		List list = query.list();
		for(Object i:list) {
	    	System.out.println(i.toString());
	    }
		trans.commit();
	}
	
	public static void updateQuery(Session session) {
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("update Customer set customerName = :customerName" + " where customerId= :customerId");
		query.setParameter("customerName", "abc");
		query.setParameter("customerId", 1);
		int result = query.executeUpdate();
		if(result > 0)
			System.out.println("Updated!");
		trans.commit();
	}
	public static void deleteQuery(Session session) {
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("delete Customer where customerId= :customerId");
		query.setParameter("customerId", 2);
		int result = query.executeUpdate();
		if(result > 0)
			System.out.println("Deleted!");
		trans.commit();
	}
	
	/*** Insert query only support insert from another table. As we are using table which are not similar 
	 * insert query will not work. Instead updateById() and insertData() can be used
	 ***/
}
package com.csi.jpa;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
	
public static void main(String[] args) {
	Session session= factory.openSession();
	Transaction transaction = session.beginTransaction();
	Address a1 = new Address();
	a1.setAddressId(121);
	a1.setAddressStreet("FC");
	a1.setAddressCity("PUNE");
	a1.setAddressState("MH");
	a1.setAddressCountry("INDIA");
	a1.setAddressPincode(422605);
	session.save(a1);
	Address a2 = new Address();
	a2.setAddressId(123);
	 a2.setAddressStreet("ABC");
	 a2.setAddressCity("PUNE");
	 a2.setAddressState("MH");
	 a2.setAddressCountry("INDIA");
	 a2.setAddressPincode(422605);
	session.save(a2);
	List<Address>addressesList= new LinkedList<Address>();
	
	addressesList.add(a1);
	addressesList.add(a2);
	Employee e1 = new Employee();
	e1.setEmpId(125);
	e1.setEmpName("KD");
	e1.setEmpSalary(55000.00);
	e1.setAddressses(addressesList);
	session.save(e1);
	
	Employee e2 = new Employee();
	e2.setEmpId(125);
	e2.setEmpName("KD");
	e2.setEmpSalary(55000.00);
	e2.setAddressses(addressesList);
	session.save(e2);
	transaction.commit();
	}
}

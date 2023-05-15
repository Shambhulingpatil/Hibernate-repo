package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Entityclass;

public class AllMethods {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	Entityclass d=new Entityclass();
	public void add(String name,String address,long number) {
		d.setName(name);
		d.setAddress(address);
		d.setNumber(number);
		
		t.begin();
		m.persist(d);
		t.commit();
		System.out.println("-----Added-----");
		
	}
	public void update(int id,String newName) {
		Entityclass d=m.find(Entityclass.class, id);
		
		d.setName(newName);
		t.begin();
		m.merge(d);
		t.commit();
		System.out.println("----Updated-----");
	}
	public void fetch(int id) {
		Entityclass d=m.find(Entityclass.class, id);
				System.out.println(d.getId());
		System.out.println(d.getName());
		System.out.println(d.getAddress());
		System.out.println(d.getNumber());
	}
	public void remove(int id) {
		Entityclass d=m.find(Entityclass.class, id);
		t.begin();
		m.remove(d);
		t.commit();
		System.out.println("----Removed----");
	}

}

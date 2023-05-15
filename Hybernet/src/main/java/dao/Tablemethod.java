package dao;

import java.io.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;
import dto.Entityclass;
import dto.Table1;

public class Tablemethod {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
  public void update(int id,String newName) {
		Table1 d=m.find(Table1.class, id);
		
		d.setName(newName);
		t.begin();
		m.merge(d);
		t.commit();
		System.out.println("----Updated-----");
	}
  public void remove(int id) {
		Table1 d=m.find(Table1.class, id);
		t.begin();
		m.remove(d);
		t.commit();
		System.out.println("----Removed----");
	}
  public void fetchVideo(int id,String newpath) throws Exception {
	  Table1  d=m.find(Table1.class, id);
	
		System.out.println(d.getId());
		System.out.println(d.getName());
		System.out.println("enter the path");
		FileOutputStream f=new FileOutputStream(newpath);
		f.write(d.getVideo());
		System.out.println("---Fetched---");
	  
  }
  public void fetch(int id,String key) {
		Table1 d=m.find(Table1.class, id);
				System.out.println(d.getId());
		System.out.println(d.getName());
//		System.out.println(d.getAddress());
		System.out.println(AES.decrypt(d.getAddress(),key));
		System.out.println(d.getPhonenumber());
		System.out.println(d.getiTime());
		System.out.println(d.getuTime());
		System.out.println("----Fetched All-----");
	}
  public void fetchAll() {
	  Query q=m.createQuery("select a from JEHA9 a");
	  List<Table1> l=q.getResultList();
	 
	  for(Table1 f:l) {
		  System.out.println(f.getId());
		  System.out.println(f.getName());
	  }
	  System.out.println("------fetched name and id----");
  }

public void add(String name, String address, String key,long phonenumber,String path) throws Exception {
	Table1 d=new Table1();
	d.setName(name);
	  d.setAddress(AES.encrypt(address,key));
	  d.setPhonenumber(phonenumber);
	  FileInputStream f=new FileInputStream(path);
	  System.out.println("enter the video path");
	  byte[] b = new byte[f.available()];
		f.read(b);
		d.setVideo(b);
	  
	  t.begin();
	  m.persist(d);
	  t.commit();
	  System.out.println("----Added-----");	
}
  
}

package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Jdbcmocktable;

public class Jdbcmockmethods {
	
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		public void add(String name, byte[] selfie, long aadharno, String address,String jdbc_mock_rating) {
			Jdbcmocktable j=new Jdbcmocktable();
			j.setName(name);
			j.setSelfie(selfie);
			j.setAddress(AES.encrypt(address,"777"));
			j.setAadharno(aadharno);
			j.setJdbc_mock_rating(jdbc_mock_rating);
			t.begin();
			m.persist(j);
			t.commit();
			System.out.println("added....");

		}
		public void fetch(long aadharno) throws Exception {
			Jdbcmocktable j = m.find(Jdbcmocktable.class, aadharno);
			Scanner sc = new Scanner(System.in);
			System.out.println(j.getAadharno());
			System.out.println(j.getName());
			System.out.println(j.getJdbc_mock_rating());
			System.out.println(AES.decrypt(j.getAddress(), "777"));
			System.out.print("Enter the saving path :");
			System.out.println(j.getSelfie());
			FileOutputStream f1 = new FileOutputStream(sc.nextLine());
			f1.write(j.getSelfie());
			System.out.println("fetched all...");
		}
		public void remove(Object aadharno) {
			Jdbcmocktable  j = m.find(Jdbcmocktable.class, aadharno);

			t.begin();
			m.remove(j);
			t.commit();
			System.out.println("removed");
		}

		public void fetch2(Object aadharno) {
			Jdbcmocktable j = m.find(Jdbcmocktable.class, aadharno);
			Scanner sc = new Scanner(System.in);
			System.out.println(j.getAadharno());
			System.out.println(j.getName());
			System.out.println(j.getJdbc_mock_rating());
			System.out.println("  fetched...");
			
		}
		public void delete(Object aadharno){
			Query q=m.createQuery("delete from jdbc");
			t.begin();
			q.executeUpdate();
			t.commit();
		}

	}


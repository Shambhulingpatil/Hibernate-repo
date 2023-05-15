package image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Driver {
	
		public static void main(String[] args) throws Exception {
			EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
			EntityManager m = e.createEntityManager();
			EntityTransaction t = m.getTransaction();

			Scanner sc = new Scanner(System.in);
			Image1 i = new Image1();
			System.out.println("enter the name");
			i.setName(sc.next());
			System.out.println("enter the path");
			FileInputStream f = new FileInputStream(sc.next());
			byte[] b = new byte[f.available()];
			f.read(b);
			i.setImage(b);
			t.begin();
			m.persist(i);
			t.commit();

		}

	}




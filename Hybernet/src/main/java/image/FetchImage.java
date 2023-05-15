package image;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchImage {
		public static void main(String[] args) throws Exception {
			EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
			EntityManager m=e.createEntityManager();
			EntityTransaction t=m.getTransaction();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the id");
			Image1 i=m.find(Image1.class,sc.nextInt());
			System.out.println(i.getId());
			System.out.println(i.getName());
			//System.out.println(i.getImage());
			System.out.println("enter the path");
			FileOutputStream f=new FileOutputStream(sc.next());
			f.write(i.getImage());
		}

	}




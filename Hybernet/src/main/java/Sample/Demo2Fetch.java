package Sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo2Fetch {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Demo d=m.find(Demo.class, 345);
		if(d!=null) {
			System.out.println(d.getId());
			System.out.println(d.getName());
			System.out.println(d.getSal());
		}else {
			System.out.println("Data not found");
		}
		
				
	}

}

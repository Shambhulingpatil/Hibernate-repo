package Sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo4Remove {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Demo d=m.find(Demo.class, 123);
		if (d!=null) {
			t.begin();
			m.remove(d);
			t.commit();
			
		}else {
			System.out.println("Data not found");
		}
	}

}

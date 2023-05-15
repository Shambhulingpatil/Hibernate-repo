package Sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo3Update {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Demo d=m.find(Demo.class,345 );
		if(d!=null) {
			t.begin();
			d.setName("Shambhu");
			m.merge(d);
			t.commit();
		}else {
			System.out.println("Data not found");
		}
	}

}

package Sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatedObjectCountDriver {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		UpdatedObjectCount d=new UpdatedObjectCount();
		d.setId(1);
		d.setName("Sss");
		
		t.begin();
		m.persist(d);
		t.commit();
	}

}

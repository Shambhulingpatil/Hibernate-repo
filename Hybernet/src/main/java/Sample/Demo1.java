package Sample;

import javax.persistence.*;


public class Demo1 {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Demo d=new Demo();
		d.setId(345);
		d.setName("Sham");
		d.setSal(45000);
		
		t.begin();
		m.persist(d);
		t.commit();
		
				
	}
}

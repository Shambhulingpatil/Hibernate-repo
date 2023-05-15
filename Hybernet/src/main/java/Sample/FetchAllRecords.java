package Sample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllRecords {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
//		Query q=m.createQuery("select a from UpdatedObjectCount a");
//		List<UpdatedObjectCount> l=q.getResultList();
//		for(UpdatedObjectCount f:l) {
//			System.out.println("   -------------  ");
//			System.out.println(f.getId());
//			System.out.println(f.getName());
//			System.out.println(f.getCount());
//			System.out.println(f.getItime());
//			System.out.println(f.getuTime());
//		}
		
//		
		Query q=m.createNamedQuery("delete from UpdatedObjectCount");
		t.begin();
		q.executeUpdate();
		t.commit();
//		NOTE: HQL is a case sensitive
	}

}

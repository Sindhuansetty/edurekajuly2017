package co.edureka;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); //Parse hibernate.cfg.xml file
			//config.configure(somename.xml); //Parse somename.xml file
			
			factory = config.buildSessionFactory();
			session = factory.openSession();
		
			transaction = session.beginTransaction();
		
			Certificate c1 = new Certificate();
			c1.setName("AWS");
			
			Certificate c2 = new Certificate();
			c2.setName("OCJP");
			
			Certificate c3 = new Certificate();
			c3.setName("CCNA");
			
			List<Certificate> list = new ArrayList<>();
			list.add(c1); //0
			list.add(c2); //1
			//list.add(c3); //2
			
			Manager mgr = new Manager();
			mgr.setName("Jennie");
			mgr.setEmail("jennie@example.com");
			mgr.setCertiList(list);
			
			session.save(mgr);
			
			transaction.commit();
			
			System.out.println("Transaction Finished....");
			
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}
		
	

	}

}

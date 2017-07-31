package co.edureka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class OneTonOneClient {

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
			
			Employee e1 = new Employee();
			e1.setName("John Watson");
			e1.setSalary(30000);
			
			Address a1 = new Address();
			a1.setAdrsLine("Ejipura Road");
			a1.setCity("Bengaluru");
			a1.setState("Karnataka");
			a1.setZipCode(520001);
			
			// HAS-A Relation
			e1.setAddress(a1);
			a1.setEmployee(e1);
			
			
			session.save(e1); // We are only saving e1, a1 shall be saved automatically. (cascade -> all)
			
			transaction.commit();
			
			System.out.println("Transaction Finished....");
			
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}
		
		

	}

}

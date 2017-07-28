package co.edureka;

import java.util.List;

import javax.sound.midi.Synthesizer;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Client {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRoll(1);
		s1.setName("John");
		s1.setAge(20);
		s1.setStd(12);
		s1.setAddress("Redwood Shores");
		
		//System.out.println(s1);
		Student s2 = new Student(0,"Jack",10,"Some Address",15);
		Student s3 = new Student(0,"Joe",10,"Eastern Shores",15);
		
		// Persist the Object in Table
		// Write Hibernate Code (Link the jar files Hibernate and Type4 Driver)
		
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
			
			// Insert the data into table
			//session.save(s1); 
			//session.save(s2);
			//session.save(s3);
			
			// Retrieve Data from Table
			//Student s = (Student) session.get(Student.class, 3);
			//System.out.println(s);
			
			// Update the data
			//s.setName("Joe Watson");
			//s.setStd(12);
			//session.update(s);
			
			// Delete the data
			//session.delete(s);
			
			// Retrieve All operation
			//String hql = "From Student";
			//String hql = "From Student where age > 18";
			//List<Student> stuList = session.createQuery(hql).list();
			
			// Retrieve All with Criteria API	
			/*Criteria criteria = session.createCriteria(Student.class);
			criteria.add(Restrictions.ge("age", 18));
			List<Student> stuList = criteria.list();
			
			for(Student s : stuList){
				System.out.println(s);
				System.out.println("-----------------------------------");
			}*/
			
			//session.createSQLQuery(); // Write any RAW SQL Query here
			
			// error
			//Student s = (Student)session.get(Student.class, "John");
			//System.out.println(s);
			
			transaction.commit();
			
			System.out.println("Transanction Done...");
			
		} catch (Exception e) {
			System.out.println("Some Exception : "+e);
		}finally {
			session.close();
			factory.close();
		}
		

	}

}

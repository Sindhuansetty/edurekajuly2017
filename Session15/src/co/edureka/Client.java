package co.edureka;

import java.util.List;

import javax.sound.midi.Synthesizer;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Client {

	public static void main(String[] args) {
		
		/*Student s1 = new Student();
		s1.setRoll(1);
		s1.setName("John");
		s1.setAge(20);
		s1.setStd(12);
		s1.setAddress("Redwood Shores");
		
		//System.out.println(s1);
		Student s2 = new Student(0,"Jack",10,"Some Address",15);
		Student s3 = new Student(0,"Joe",10,"Eastern Shores",15);*/
		
		// Persist the Object in Table
		// Write Hibernate Code (Link the jar files Hibernate and Type4 Driver)
		
		Configuration config = null;
		//AnnotationConfiguration config = null;
		
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); //Parse hibernate.cfg.xml file
			//config.configure(somename.xml); //Parse somename.xml file
			
			//config = new AnnotationConfiguration();
			//config.configure();
			
			factory = config.buildSessionFactory();// 1 SF can have multiple sessions.
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
			
			/*for(int i=1;i<=100;i++){
				Student s = new Student(0, "Student "+i, i, "Address "+i, i);
				session.save(s);
			}*/
			
			/*User u1 = new User(0,"john@example.com","password123");
			User u2 = new User(0,"jennie@example.com","jennie@123");
			
			session.save(u1);
			session.save(u2);*/
			
			// Retrieve Data from Table
			Student s1 = (Student) session.get(Student.class, 3);
			Student s2 = (Student) session.get(Student.class, 10);
			
			Student s3 = (Student) session.get(Student.class, 3);
			Student s4 = (Student) session.get(Student.class, 10);
			Student s5 = (Student) session.get(Student.class, 10);
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println(s5);
			
			
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

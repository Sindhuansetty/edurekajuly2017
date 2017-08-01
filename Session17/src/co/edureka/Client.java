package co.edureka;

import java.security.AllPermission;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {

		// Traditional Way
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setName("John");
		e1.setEmail("john@example.com");
		e1.setAge(20);
		e1.setAddress("Redwood Shores");
		
		System.out.println("e1 details: "+e1);
		
		// Spring Way
		//1. IOC Container - BeanFactory
		//Resource resource = new ClassPathResource("employeebean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		/*Employee emp2 = (Employee)factory.getBean("e2");
		Employee emp3 = factory.getBean("e3",Employee.class);
		
		//emp2.setName("Jennie Watson");
		
		System.out.println("emp2 details: "+emp2);
		System.out.println("emp3 details: "+emp3);*/
		
		//2. IOC Container - ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		//Employee emp2 = (Employee)context.getBean("e2");
		//Employee emp3 = context.getBean("e2",Employee.class);
		
		//System.out.println("emp2 details: "+emp2);
		//System.out.println("emp3 details: "+emp3);
		
		// IOC -> Usage
		// 1. Hibernate
		// 2. Android
		
//		Father f = context.getBean("fRef",Father.class);
//		Child c = context.getBean("cRef",Child.class);
//		
//		System.out.println("Father Details: "+f);
//		System.out.println("-------------------------");
//		System.out.println("Child Details: ");
//		System.out.println("FName: "+c.getFname());
//		System.out.println("LName: "+c.getLname());
//		System.out.println("Money: "+c.getMoney());
//		System.out.println("Vehicles: "+c.getVehicles());
//		System.out.println("Adress: "+c.getHomeAddress());
		
		Student s = context.getBean("sRef",Student.class);
		System.out.println(s);
			
		// Downcasting
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); // Close the Context
	}

}

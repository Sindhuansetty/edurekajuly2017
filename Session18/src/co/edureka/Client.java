package co.edureka;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// ProxyFactoryBean -> API to be configured in XML File
		
		
		Resource resource = new ClassPathResource("userbean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		User user = factory.getBean("userProxyBean",User.class);
		user.registerUser(2,"Bengaluru");
		
	}

}

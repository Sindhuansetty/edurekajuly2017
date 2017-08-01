package co.edureka;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object beanRef, String benaName) throws BeansException {
		
		System.out.println("==postProcessAfterInitialization==");
		return beanRef;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanRef, String beanName) throws BeansException {
		System.out.println("==postProcessBeforeInitialization==");
		
		Employee e = (Employee)beanRef;
		if(e.getName().contains("Jennie")){
			e.setName("Kim");
			System.out.println("Name Written: "+e.getName());
		}else{
			System.out.println("Name Not Written: "+e.getName());
		}
		
		return beanRef;
	}

}

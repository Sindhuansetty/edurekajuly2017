package co.edureka;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objArr, Object obj) throws Throwable {
		
		System.out.println("MethodBeforeAdvice Executed..");
		System.out.println("User Registration On: "+new Date());
		
		System.out.println("Method: "+method);
		
		System.out.println("Array:");
		for(Object o : objArr){
			System.out.println(o);
		}
		
		System.out.println("Object is: "+obj);
		
	}

}

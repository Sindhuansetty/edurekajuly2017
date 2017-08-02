package co.edureka;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object obj1, Method method, Object[] objArr, Object obj2) throws Throwable {
		
		System.out.println("AfterReturningAdvice Executed..");
		System.out.println("User Registered On: "+new Date());
		
		System.out.println("Method: "+method);
		
		System.out.println("Array:");
		for(Object o : objArr){
			System.out.println(o);
		}
		
		System.out.println("Object1 is: "+obj1); // null
		System.out.println("Object2 is: "+obj2); // reference to the object is here....
		
	}

}

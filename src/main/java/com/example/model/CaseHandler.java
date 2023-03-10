package com.example.model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.springframework.beans.BeanWrapperImpl;

public class CaseHandler {

	public  static Object handleCase(Object obj) throws IllegalArgumentException, IllegalAccessException {
		
		Field [] fields = obj.getClass().getDeclaredFields();
		for(Field field: fields) {
			field.setAccessible(true);
		CaseSenitive c = field.getAnnotation(CaseSenitive.class);
		if(c!=null) {
			c.case_sensitive();
			field.set(obj, c.case_sensitive().equals("lower")?field.get(obj).toString().toLowerCase():field.get(obj).toString().toUpperCase());
		}
		
		}
		return obj;
      
       }
	}
	
	


//if(c.getClass().isAnnotationPresent(CaseSenitive.class)) {
//	System.out.println("true");
//}else {
//	System.out.println("flase");
//}

package com.sapdb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) 
public @interface Column {
	
	String name() default "";
	
	//String type() default "";
	
	Class type() default String.class; 


}

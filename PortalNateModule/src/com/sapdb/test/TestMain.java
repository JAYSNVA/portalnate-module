package com.sapdb.test;

import java.lang.reflect.Field;

import com.sapdb.annotation.Column;

public class TestMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		TestEntity testEntity = new TestEntity();
		testEntity.name = "YAHYA";
		save(testEntity,TestEntity.class);

	}
	
	@SuppressWarnings("unchecked")
	public static <T> T  save(Object object, T clazz) throws IllegalArgumentException, IllegalAccessException{
	
		for (Field f: object.getClass().getDeclaredFields()) {
			f.setAccessible(true);
		    Column column = f.getAnnotation(Column.class);
		    if (column.type().isAssignableFrom(String.class)) {
				System.out.println("String");
			}
		    if (column.type().isAssignableFrom(Integer.class)) {
				System.out.println("Integer");
			}
		    if (column != null)
		        System.out.println(column.name() + " : " + f.get(object) + " / " + column.type());
			}
		System.out.println("Bitti");
		return null;
		
		
		
	}

}

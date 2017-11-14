package com.sapdb.test;

import com.sapdb.annotation.Column;
import com.sapdb.annotation.Entity;

@Entity(name="TBL_TESTENTITY")
public class TestEntity {
	
	@Column(name="NAME", type=String.class)
	public String name;
	
	@Column(name="AGE", type=Integer.class)
	public String age;

}

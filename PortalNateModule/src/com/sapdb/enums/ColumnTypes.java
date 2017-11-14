package com.sapdb.enums;

public enum ColumnTypes {
	
	STRING("String"),INTEGER("Integer");
	
	private String type;
	
	private ColumnTypes(String type) {
		this.type = type;
	}
	
	public String type() {
        return type;
    }

}

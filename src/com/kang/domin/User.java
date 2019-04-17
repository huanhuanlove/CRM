package com.kang.domin;

public class User {
	
	private int id;
	
	private String code;
	
	private String name;
	
	private String password;
	
	private String state;

	public User() {
		
	}

	public User(int id, String code, String name, String password, String state) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.password = password;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}

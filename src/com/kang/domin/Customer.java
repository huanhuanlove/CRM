package com.kang.domin;

public class Customer {
	
	private Integer id;
	
	private String name;
	
	private String source;
	
	private String industry;
	
	private String level;
	
	private String phone;
	
	private String mobile;

	public Customer() {
		
	}

	public Customer(Integer id, String name, String source, String industry, String level, String phone,
			String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.industry = industry;
		this.level = level;
		this.phone = phone;
		this.mobile = mobile;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}

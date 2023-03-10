package com.example.model;

public class Cat {
    
	int no;
	
	@CaseSenitive (case_sensitive = "lower")
	String fname;

	@CaseSenitive(case_sensitive = "upper")
	String mname;
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		Cat cat = new Cat();
		cat.setFname("RISHi");
		cat.setMname("rishitha");
		cat =(Cat) CaseHandler.handleCase(cat);
		System.out.println(cat.getFname());
		System.out.println(cat.getMname());
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
}

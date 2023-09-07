package com.tnsif.singleinheritance;

public class Student extends Citizen {
	private int rollNo;
	private String collegeName;
	
	public Student(String name, String aadharNo, String address, long phno) {
		super();
	}
	
	public Student(String name, String aadharNo, String address, long phno,int rollNo, String collegeName ) {
		super(name, aadharNo, address, phno);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getRollNo()=" + getRollNo()
				+ ", getCollegeName()=" + getCollegeName() + ", getName()=" + getName() + ", getAadharNo()="
				+ getAadharNo() + ", getAddress()=" + getAddress() + ", getphno()=" + getphno() + "]";
	}
	

}


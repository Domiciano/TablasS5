package model;

public class Student {

	private String name;
	private int natID;
	private String code;
	
	
	
	public Student(String name, int natID, String code) {
		this.name = name;
		this.natID = natID;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNatID() {
		return natID;
	}
	public void setNatID(int natID) {
		this.natID = natID;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}

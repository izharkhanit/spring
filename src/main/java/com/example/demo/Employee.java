package com.example.demo;

//@XmlRootElement
public class Employee{
	private int EmpID;
	private String Name;
	public Employee(){
		
	}
	public Employee(int EmpID,String Name){
		super();
		this.EmpID = EmpID;
		this.Name = Name;
	}
	public int getEmpID(){
		return EmpID;
	}
	public void setEmpID(int EmpID){
		this.EmpID = EmpID;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name = Name;
	}
}
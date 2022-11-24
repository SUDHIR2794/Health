package org.stu;

public class Student {
	
public void studentId() {
	//business logic;
	System.out.println("s001");
}
public void studentName() {
	//business logic;
	System.out.println("sudhir kumar");
}
public void studentDept() {
	//business logic;
	System.out.println("mechanical");


	
}
//main method
public static void main (String [] args) {
	//obj creation
	Student c = new Student();
	
	//method call
	c.studentId();
	c.studentName();
	c.studentDept();
	
	
	
	
}
}

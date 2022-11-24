package org.staff;
//import package name.classname;
import org.col.College;
import org.stu.Student;

public class Staff {
	//method creation
	private void staffId() {
		System.out.println("s002");
	}
	private void staffName() {
		System.out.println("saravanan");
	}
	private void staffDept() {
		System.out.println("civil");
	}
	
	   //main method
	public static void main (String [] args) {
	   //obj creation
		Staff a = new Staff ();
		Student c = new Student();
		College b = new College();
		
	  //method call
	a.staffId();
	a.staffName();
	a.staffDept();
	b.collegeName();
	c.studentId();
	c.studentName();
	c.studentDept();
	
		
		}	

}

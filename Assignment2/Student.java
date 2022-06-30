package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		String StudName="Yajiv";
		System.out.println("Student Name is :"+StudName);
	}
	public void studentDept()
	{
		String StudDept="CSE";
		System.out.println("Student Department is :" + StudDept);
	}

	public void studentId()
	{
		String StudID="AU768";
		System.out.println("Student ID is :"+StudID);
	}
	
	public static void main(String[] args) 
	{
		Student mulInher=new Student();
		mulInher.collegeCode();
		mulInher.collegeName();
		mulInher.collegeRank();
		mulInher.deptName();
		mulInher.studentName();
		mulInher.studentDept();
		mulInher.studentId();
	}
}

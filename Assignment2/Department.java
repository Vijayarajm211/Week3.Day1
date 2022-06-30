package org.department;

import org.college.College;

public class Department extends College
{
	public void deptName()
	{
		String dptName="CSE";
		System.out.println("Department Name is :"+ dptName);
	}
	public static void main(String[] args) 
	{
		Department deptobj=new Department();
		deptobj.collegeName();
		deptobj.collegeCode();
		deptobj.collegeRank();
		deptobj.deptName();
	}

}

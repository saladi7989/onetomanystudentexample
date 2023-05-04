package com.srinu;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.srinu.pojo.Department;
import com.srinu.pojo.Student;

public class FetchDataWithOneToMany {

	public static void main(String[] args) {
	
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ss=sf.openSession();
		
		Department department =(Department) ss.get(Department.class, 101);
		
		Set listData=department.getStudent();
		Iterator it =listData.iterator();
		while(it.hasNext()){
			Student std=(Student) it.next();
			System.out.println(std.getStudentid());
			System.out.println(std.getStudentname());
			System.out.println(std.getStudentaddress());
			
			
		}
		System.out.println("OrgName="+department.getDepartmentname());
		ss.close();
		sf.close();

	}

}

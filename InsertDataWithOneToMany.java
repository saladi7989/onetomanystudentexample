package com.srinu;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.srinu.pojo.Department;
import com.srinu.pojo.Student;

public class InsertDataWithOneToMany {

	public static void main(String[] args) {
		
		Set student =new HashSet<>();
		
		Department dep=new Department();
		dep.setDeparmentid(101);
		dep.setDepartmentname("MSCS");
		
		Student st=new Student();
		st.setStudentid(11);
		st.setStudentname("sreenu");
		st.setStudentaddress("pothavaram");
		
		Student st1=new Student();
		st1.setStudentid(12);
		st1.setStudentname("khasim");
		st1.setStudentaddress("darsi");
		
		Student st2=new Student();
		st2.setStudentid(13);
		st2.setStudentname("eeswar");
		st2.setStudentaddress("darsi");
		
		student.add(st);
		student.add(st1);
		student.add(st2);
		
		dep.setStudent(student);
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		ss.save(dep);
		tx.commit();
		

	}

}

package com.srinu;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.srinu.pojo.Department;
import com.srinu.pojo.Student;

public class RemoveChildParentClientFromOnetoMany {

	public static void main(String[] args) {
	    
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ss=sf.openSession();
		
		Department dep=(Department) ss.get(Department.class, 101);
		
		Set setstu=dep.getStudent();
		
		Student st=(Student) ss.get(Student.class, 12);
		Transaction tx=ss.beginTransaction();
		setstu.remove(st);
		tx.commit();
		ss.close();

	}

}

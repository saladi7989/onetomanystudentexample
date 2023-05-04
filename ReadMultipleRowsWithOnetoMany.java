package com.srinu;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.srinu.pojo.Department;
import com.srinu.pojo.Student;

public class ReadMultipleRowsWithOnetoMany {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ss=sf.openSession();
		
		Query query=ss.createQuery("* from department d");
		
		List listresult=query.list();
		Iterator it=listresult.iterator();
		while(it.hasNext()) {
			Department dep =(Department) it.next();
			System.out.println(dep.getDepartmentname());
			System.out.println(dep.getDeparmentid());
			Set set=dep.getStudent();
		
			Iterator it2=listresult.iterator();
			while(it.hasNext()) {
			Student st =(Student) it.next();
				System.out.println(st.getStudentid());
				System.out.println(st.getStudentname());
				System.out.println(st.getStudentaddress());
		}

	}

	}
}

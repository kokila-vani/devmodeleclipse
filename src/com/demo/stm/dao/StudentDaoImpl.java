package com.demo.stm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.stm.model.Sandhiya;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory factory;

	@Override
	public void createStudent(Sandhiya s1) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(s1);
	}

	@Override
	public List<Sandhiya> getStudents() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Sandhiya");
		List<Sandhiya> students = query.list();
		return students;
	}

	@Override
	public Sandhiya getStudent(String id) {
		Session session = factory.getCurrentSession();
		Sandhiya s1 =session.get(Sandhiya.class,Integer.parseInt(id));
		return s1;
	}

	@Override
	public void deleteStudent(Sandhiya s1) {
		Session session = factory.getCurrentSession();
		session.delete(s1);
	}
	

}

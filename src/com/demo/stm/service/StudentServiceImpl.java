package com.demo.stm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.stm.dao.StudentDao;
import com.demo.stm.model.Sandhiya;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao;
	
	@Override
	@Transactional
	public void createStudent(Sandhiya s1) {
			dao.createStudent(s1);
	}

	@Override
	@Transactional
	public List<Sandhiya> getStudents() {
		return dao.getStudents();
	}

	@Override
	@Transactional
	public Sandhiya getStudent(String id) {
		return dao.getStudent(id);
	}

	@Override
	@Transactional
	public void deleteUser(Sandhiya s1) {
		dao.deleteStudent(s1);
	}

}

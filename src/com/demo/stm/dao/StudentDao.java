package com.demo.stm.dao;

import java.util.List;

import com.demo.stm.model.Sandhiya;

public interface StudentDao {

	void createStudent(Sandhiya s1);

	List<Sandhiya> getStudents();

	Sandhiya getStudent(String id);

	void deleteStudent(Sandhiya s1);

}

package com.demo.stm.service;

import java.util.List;

import com.demo.stm.model.Sandhiya;

public interface StudentService {

	void createStudent(Sandhiya s1);

	List<Sandhiya> getStudents();

	Sandhiya getStudent(String id);

	void deleteUser(Sandhiya s1);

}

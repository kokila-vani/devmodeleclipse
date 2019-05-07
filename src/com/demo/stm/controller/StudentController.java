package com.demo.stm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.stm.model.Sandhiya;
import com.demo.stm.service.StudentService;

@Controller
public class StudentController {

@Autowired
StudentService service;

@Autowired
HttpServletRequest request;
	
@RequestMapping("/")
//@ResponseBody
public String summa(Model theModel) {
	theModel.addAttribute("stu",new Sandhiya());
	return "home";
}

//@PostMapping("/insertUser")
//public String insertUser(@RequestParam("firstName") String fir,@RequestParam("age") String age) {
//	Sandhiya s1 = new Sandhiya();
//	s1.setFirstName(fir);
//	s1.setAge(age);
//	service.createStudent(s1);
//	return "success";
//}

@PostMapping("/insertUser")//@GetMapping("")
public String insertUser(@ModelAttribute("stu") Sandhiya s1,Model theModel) {
	service.createStudent(s1);
	List<Sandhiya> students = service.getStudents();
	theModel.addAttribute("students",students);
	return "success";
}

@RequestMapping("/read")
public String read(Model theModel) {
	List<Sandhiya> students = service.getStudents();
	theModel.addAttribute("students",students);
	return "success";
}

@RequestMapping("/editStudent")
public String editStudent(@RequestParam("id") String id,Model theModel) {
	theModel.addAttribute("stu",service.getStudent(id));
	return "home";
}


@RequestMapping("/deleteStudent")
public String deleteStudent(@RequestParam("id") String id) {
	Sandhiya s1 = service.getStudent(id);
	service.deleteUser(s1);
	return "redirect:/read";
}


}

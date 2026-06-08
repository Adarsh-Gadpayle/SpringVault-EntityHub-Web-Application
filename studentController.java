package in.soft.controller;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.soft.bind.Student;
import in.soft.entity.StudentEntity;
import in.soft.service.StudentService;

@Controller
public class studentController {
	
	@Autowired
	StudentService std;
	
	@GetMapping("/")
	public String loadHomepage() {
		
		return "home";
		
	}
	@GetMapping("/reg")
	public String loadRegistrationpage(Model model) {
		
		List<String> courseList = new ArrayList<>();
		courseList.add("Java fullStack");
		courseList.add("Python fullStack");
		courseList.add("DevOps");
		courseList.add("Data Science");
		courseList.add("AI");
		courseList.add("Software Testing");
		courseList.add("React js ");
		
		 
		
		List<String> timingsList = new ArrayList<>();
		
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");
		
		Student student = new Student();
		model.addAttribute("courses",courseList);
		model.addAttribute("timing",timingsList);
		model.addAttribute("student", student);
		
		return "register";
		
	}
	
	
	@PostMapping("/save")
	public String SaveRegisterData(StudentEntity student) {
		
		std.saveStudent(student);
		
		return "redirect/display";
		
	}
	
	@GetMapping("/display")
	public String display(Model model) {
		List<StudentEntity> allStudent = std.getAllStudent();
		model.addAttribute("student",allStudent);
		return "display";
		
	}

}

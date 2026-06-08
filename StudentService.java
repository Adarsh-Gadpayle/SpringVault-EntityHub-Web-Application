package in.soft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.soft.bind.Student;
import in.soft.entity.StudentEntity;


public interface StudentService {
	
	public void saveStudent(StudentEntity student);
	public Student getStudent(Integer id);
	public void deleteStudent(Integer id);
	public void updateStudent(StudentEntity student);

	public List<StudentEntity> getAllStudent();
}

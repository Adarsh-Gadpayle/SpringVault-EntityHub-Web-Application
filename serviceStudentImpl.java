package in.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.soft.bind.Student;
import in.soft.entity.StudentEntity;
import in.soft.repository.StudentRepository;

@Service
public class serviceStudentImpl implements StudentService{
	@Autowired
	StudentRepository stdrepo;
	

	@Override
	public void saveStudent(StudentEntity student) {
		stdrepo.save(student);
		
	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentEntity student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StudentEntity> getAllStudent() {
		List<StudentEntity> all = stdrepo.findAll();
		return all;
	}

}

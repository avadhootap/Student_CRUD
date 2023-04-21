package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.Repository.StudentRepo;
import com.app.customException.CustomExcpetion;
import com.app.pojo.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student addStudent(Student addStudent) {
		return studentRepo.save(addStudent);
	}

	@Override
	public Student updateStudent(Student updateStudent) {
		Long StudentId=updateStudent.getId();
		if(studentRepo.existsById(StudentId)) {
			return studentRepo.save(updateStudent);
		}
		else {
			throw new CustomExcpetion("Invalid Exception");
		}
	}

	@Override
	public String deleteStudent(Long id) {
		if (studentRepo.existsById(id)) {
			studentRepo.deleteById(id);
			return "Student Deleted Successfully...";
		}
		throw new CustomExcpetion("Deletion Failed");
	}

}

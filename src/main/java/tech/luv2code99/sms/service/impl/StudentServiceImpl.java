package tech.luv2code99.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import tech.luv2code99.sms.entity.Student;
import tech.luv2code99.sms.repository.StudentRepository;
import tech.luv2code99.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	
	@Override
	public Student getStudentById(Long id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}
	
	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	

}

package tech.luv2code99.sms.service;

import java.util.List;

import tech.luv2code99.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
}

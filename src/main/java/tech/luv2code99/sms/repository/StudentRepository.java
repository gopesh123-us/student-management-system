package tech.luv2code99.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.luv2code99.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
 
}

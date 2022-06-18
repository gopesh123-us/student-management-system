package tech.luv2code99.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tech.luv2code99.sms.entity.Student;
import tech.luv2code99.sms.repository.StudentRepository;

@Component
public class StudentRepositoryCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(StudentRepositoryCommandLineRunner.class);
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Guruji", "Puri", "guruji@gmail.com");
		 * studentRepository.save(student1); log.info("A new student created: " +
		 * student1);
		 * 
		 * Student student2 = new Student("Gopesh", "Sharma", "gopesh@gmail.com");
		 * studentRepository.save(student2); log.info("A new student created: " +
		 * student2);
		 * 
		 * Student student3 = new Student("Bhupesh", "Parashar", "bhupesh@gmail.com");
		 * studentRepository.save(student3); log.info("A new student created: " +
		 * student3);
		 * 
		 * Student student4 = new Student("Vaishali", "Sharma", "vaishali@gmail.com");
		 * studentRepository.save(student4); log.info("A new student created: " +
		 * student4);
		 */
		
	
	}

}

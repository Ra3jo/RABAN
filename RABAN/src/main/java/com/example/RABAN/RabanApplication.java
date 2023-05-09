package com.example.RABAN;

import com.example.RABAN.ENTITY.InstructorEntity;
import com.example.RABAN.REPOSITORY.INSTRUCTORREPOSITORY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabanApplication implements CommandLineRunner {
	@Autowired
	private INSTRUCTORREPOSITORY instructorrepository;

	public static void main(String[] args) {
		SpringApplication.run(RabanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		InstructorEntity instructorEntity=new InstructorEntity();
		instructorEntity.setPhon(762933166);
		instructorEntity.setMname("JOMAJO");
		instructorEntity.setFname("Raban");
		instructorEntity.setLname("Jomajo");
		instructorrepository.save(instructorEntity);


		InstructorEntity instructorEntity1=new InstructorEntity();
		instructorEntity1.setPhon(762933160);
		instructorEntity1.setMname("JOMAJ");
		instructorEntity1.setFname("Raba");
		instructorEntity1.setLname("Joma");
		instructorrepository.save(instructorEntity1);

	}
}

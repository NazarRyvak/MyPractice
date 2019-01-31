package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.entity.SizeOfPage;
import com.practice.entity.User;
import com.practice.repository.SizeOfPageRepository;
import com.practice.repository.StudentRepository;
import com.practice.repository.UserRepository;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		addStudent(ctx);
		addUser(ctx);
	}

	private static void addStudent(ConfigurableApplicationContext ctx) {
		StudentRepository studentRepository = ctx.getBean(StudentRepository.class);
		SizeOfPageRepository r=ctx.getBean(SizeOfPageRepository.class);
		Long students = studentRepository.count();
		System.out.println("Students in DB: " + students);
		if (students == 300) {
			SizeOfPage size = new SizeOfPage();
			size.setId(1);
			size.setSizePage("10");
			r.save(size);
 
	/*		for (int i = 0; i < 300; i++) {
				Student student = new Student();
				student.setFirstName("Student FirstName #" + i);
				student.setLastName("Student LastName #" + i);
				student.setAge(i);
				student.setPassword("password" + i);

				studentRepository.save(student);
			}*/
		}
	}

	private static void addUser(ConfigurableApplicationContext ctx) throws IOException {
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		Long users = userRepository.count();
		System.out.println("Users in DB: " + users);
		if (users == 20022) {

			BufferedReader inputStreamFirstName = null;
			BufferedReader inputStreamLastName = null;
			Random rd = new Random();
			List<String> firstNames = new ArrayList<String>();
			List<String> lastNames = new ArrayList<String>();

			try {
				inputStreamFirstName = new BufferedReader(new FileReader("src/main/resources/first_name.txt"));
				inputStreamLastName = new BufferedReader(new FileReader("src/main/resources/last_name.txt"));
				String first_name;
				String last_name;
				while ((first_name = inputStreamFirstName.readLine()) != null) {
					firstNames.add(first_name);
				}
				while ((last_name = inputStreamLastName.readLine()) != null) {
					lastNames.add(last_name);
				}
			} finally {
				System.out.println("List first names :" + firstNames.size());
				System.out.println("List last names :" + lastNames.size());
				if (inputStreamFirstName != null) {
					inputStreamFirstName.close();
				}
				if (inputStreamLastName != null) {
					inputStreamLastName.close();
				}
			}
			// addUsersToDB
			for (int i = 0; i < 1; i++) {
				User user = new User();
				user.setFirstName(firstNames.get(rd.nextInt(firstNames.size())));
				user.setLastName(lastNames.get(rd.nextInt(lastNames.size())));
				user.setAge(rd.nextInt(80));
			
				
				int helpVar = rd.nextInt(3);
				if (helpVar==0) {
					user.setEmail(user.getFirstName().toLowerCase()+"_"+user.getLastName().toLowerCase()+"@gmail.com");
				}else if(helpVar==1) {
					user.setEmail(user.getFirstName().toLowerCase()+"_"+user.getLastName().toLowerCase()+"@ukr.net");
				}else if(helpVar==2) {
					user.setEmail(user.getFirstName().toLowerCase()+"_"+user.getLastName().toLowerCase()+"@e-mail.ua");
				}else {
						user.setEmail(user.getFirstName().toLowerCase()+"_"+user.getLastName().toLowerCase()+"@bigmir.net");
				}
				
				user.setLogin(user.getLastName()+user.getFirstName());
				user.setPassword(rd.nextInt(20000)*i+user.getFirstName());
				userRepository.save(user);
				String folderName="user_"+user.getId();
				//CustomFilesUtils.createFolder(folderName);
				
			}

		}

	}

}


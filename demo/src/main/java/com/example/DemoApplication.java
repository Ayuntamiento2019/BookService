package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.*;
import com.example.dao.UserRepository;
import com.example.entities.User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		//System.out.println( "Hello World!" );  
		UserRepository userRepository = context.getBean(UserRepository.class);

		// User user1 = new User();
		// user1.setName("Ayush");
		// user1.setCity("Delhi");
		// user1.setStatus("java");
        // User user2 = new User();
		// user2.setName("Ayushi");
		// user2.setCity("patna");
		// user2.setStatus("python");
		// User user3 = new User();
		// user3.setName("piyush");
		// user3.setCity("gaya");
		// user3.setStatus("c++");

		// List<User> li = List.of(user1,user2,user3); 

		//  Iterable<User> temp = userRepository.saveAll(li);

		//  temp.forEach(user->{
		// 	System.out.println(user);
		//  });
		
		// Optional<User> tempuser = userRepository.findById(152);

		// User user = tempuser.get();

		// user.setName("heera");
		// userRepository.save(user);
          
		// Iterable<User> all = userRepository.findAll();
		// all.forEach(user1->{
		// 	System.out.println(user1);
		// });
		// userRepository.deleteById(153);
		// Iterable<User> all = userRepository.findAll();
		// all.forEach(user1->{
		// 	System.out.println(user1);
		// });

		List<User> it = userRepository.findByName("heera");

		List<User> lit = userRepository.findByCityAndName("gaya","piyush");
        lit.forEach(user->{
			System.out.println(user);
		  });
		it.forEach(user->{
          System.out.println(user);
		});

	}

}

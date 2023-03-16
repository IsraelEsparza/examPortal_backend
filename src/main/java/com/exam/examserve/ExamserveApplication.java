package com.exam.examserve;

import com.exam.examserve.Model.Role;
import com.exam.examserve.Model.User;
import com.exam.examserve.Model.UserRole;
import com.exam.examserve.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserveApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserveApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

		/*User user = new User();

		user.setFirstName("israel");
		user.setLastName("Esparza");
		user.setUsername("israel");
		user.setPassword("123456");
		user.setEmail("isra@gmail.com");
		user.setProfile("deafault.png");

		Role role = new Role();
		role.setRoleId(44L);
		role.setRoleName("ADMIN");

		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);

		userRoleSet.add(userRole);

		User user1 = this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());*/

	}
}

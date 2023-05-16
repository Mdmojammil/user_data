package com.Userdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Userdata.entity.user;
import com.Userdata.repository.UserRepository;

@SpringBootTest
class UserDataApplicationTests {
	@Autowired
	private UserRepository userRepo;
	@Test
	void saveUser() {
		user u=new user();
		u.setName("mojammil");
		u.setCity("purnia");
		u.setInstitute("banglore");
		u.setFee(2000);
		userRepo.save(u);
		
		
	}

}

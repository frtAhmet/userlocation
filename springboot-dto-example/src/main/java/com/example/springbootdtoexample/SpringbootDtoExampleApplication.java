package com.example.springbootdtoexample;

import com.example.springbootdtoexample.entity.Location;
import com.example.springbootdtoexample.entity.User;
import com.example.springbootdtoexample.repository.LocationRepository;
import com.example.springbootdtoexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoExampleApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Sivas");
		location.setDescription("Sivas is great place to live");
		location.setLongitude(37.01);
		location.setLatitude(39.75);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Ahmet");
		user1.setLastName("Fırat");
		user1.setEmail("ahmet.firat.cmpe@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Muhammed");
		user2.setLastName("Ali");
		user2.setEmail("mali@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);


	}
}

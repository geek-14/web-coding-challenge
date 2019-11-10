package com.geek14.webcodingchallenge;

import java.util.Random;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.geek14.webcodingchallenge.models.Position;
import com.geek14.webcodingchallenge.models.Shop;
import com.geek14.webcodingchallenge.models.User;
import com.geek14.webcodingchallenge.repositories.PositionRepository;
import com.geek14.webcodingchallenge.repositories.ShopRepository;
import com.geek14.webcodingchallenge.repositories.UserRepository;

@SpringBootApplication
public class WebCodingChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebCodingChallengeApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepository, PositionRepository positionRepository,
			ShopRepository shopRepository) {
		return args -> {
            Stream.of("Aicha", "Omar", "Zineb", "Ahmed", "Abder").forEach(name -> {
            	Position position = new Position(new Random().nextInt(10), new Random().nextInt(10));
                User user = new User(name.toLowerCase() + "@blahblah.com", name, position);
                Shop shop = new Shop("Store" + name, true, position);
                shop.setUser(user);
                positionRepository.save(position);
                userRepository.save(user);
                shopRepository.save(shop);
            });
        };
	} 

}

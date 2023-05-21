package com.example.springmvcbranchoffice;

import com.example.springmvcbranchoffice.domain.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringMvcBranchofficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcBranchofficeApplication.class, args);
	}

	@Bean
	public Map<Long, Book> bookMap(){
		Map<Long, Book> bookMap = new HashMap<>();
		for (long i = 1; i < 2_000_000; i++) {
			bookMap.put(i, new Book(i, "IT Book" + i, 2000));
		}
		return bookMap;
	}


}

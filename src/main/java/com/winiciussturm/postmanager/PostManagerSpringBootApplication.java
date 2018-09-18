package com.winiciussturm.postmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.winiciussturm.postmanager.services.AudioParserService;

@SpringBootApplication
public class PostManagerSpringBootApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(PostManagerSpringBootApplication.class, args);
		AudioParserService.listSongData();
	}
}

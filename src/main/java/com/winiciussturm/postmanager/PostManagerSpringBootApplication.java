package com.winiciussturm.postmanager;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.winiciussturm.postmanager.services.AudioParserService;
import com.winiciussturm.postmanager.services.ZipService;

@SpringBootApplication
public class PostManagerSpringBootApplication {

	public static void main(String[] args) throws IOException 
	{
		SpringApplication.run(PostManagerSpringBootApplication.class, args);
		AudioParserService.listSongData();
		ZipService.compress("C:/Users/winicius/Desktop/Personal/Zip");
	}
}

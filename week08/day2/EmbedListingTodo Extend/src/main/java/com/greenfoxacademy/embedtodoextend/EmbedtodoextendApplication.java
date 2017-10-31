package com.greenfoxacademy.embedtodoextend;
import com.greenfoxacademy.embedtodoextend.Modell.ToDo;
import com.greenfoxacademy.embedtodoextend.Repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmbedtodoextendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmbedtodoextendApplication.class, args);}

		@Autowired
		ToDoRepo toDoRepo;

		@Override
		public void run (String...args) throws Exception {
			toDoRepo.save(new ToDo("stufftodo"));
		}
	}


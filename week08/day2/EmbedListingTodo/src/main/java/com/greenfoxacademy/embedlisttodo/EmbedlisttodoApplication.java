package com.greenfoxacademy.embedlisttodo;
import com.greenfoxacademy.embedlisttodo.Model.ToDo;
import com.greenfoxacademy.embedlisttodo.Repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmbedlisttodoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmbedlisttodoApplication.class, args);
	}

	@Autowired
	ToDoRepo toDoRepo;

	@Override
	public void run(String... args) throws Exception {
		toDoRepo.save(new ToDo("tasktodo"));
	}
}

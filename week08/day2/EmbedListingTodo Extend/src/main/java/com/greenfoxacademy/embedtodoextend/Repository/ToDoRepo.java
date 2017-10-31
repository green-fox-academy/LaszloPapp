package com.greenfoxacademy.embedtodoextend.Repository;
import com.greenfoxacademy.embedtodoextend.Modell.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDo, Integer> {

}

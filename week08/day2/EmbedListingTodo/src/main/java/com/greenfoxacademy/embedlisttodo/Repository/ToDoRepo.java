package com.greenfoxacademy.embedlisttodo.Repository;
import com.greenfoxacademy.embedlisttodo.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDo, Integer> {

}

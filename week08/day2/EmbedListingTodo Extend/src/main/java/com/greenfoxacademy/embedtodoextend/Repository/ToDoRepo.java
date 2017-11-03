package com.greenfoxacademy.embedtodoextend.Repository;
import com.greenfoxacademy.embedtodoextend.Modell.ToDo;
import org.omg.CORBA.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.method.annotation.RequestParamMethodArgumentResolver;

public interface ToDoRepo extends CrudRepository<ToDo, Long> {

   // ToDo saveById(Long id);

}

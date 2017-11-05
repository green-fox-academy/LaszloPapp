package com.greenfoxacademy.embedtodoextend.Repository;
import com.greenfoxacademy.embedtodoextend.Modell.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long>{
    User findUserByName(String name);
}

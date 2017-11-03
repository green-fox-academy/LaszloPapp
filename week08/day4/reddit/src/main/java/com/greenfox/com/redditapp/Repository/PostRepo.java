package com.greenfox.com.redditapp.Repository;
import com.greenfox.com.redditapp.Model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long>{

}

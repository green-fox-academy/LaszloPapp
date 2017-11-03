package com.greenfox.com.redditapp.service;
import com.greenfox.com.redditapp.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostProvider {

    @Autowired
    PostRepo postRepo;

    public void increase(Long id){
        postRepo.findOne(id).setScore(postRepo.findOne(id).score+1);
        postRepo.save(postRepo.findOne(id));
    }

    public void decrease(Long id){
        postRepo.findOne(id).setScore(postRepo.findOne(id).score-1);
        postRepo.save(postRepo.findOne(id));
    }
}

package com.kamotech.kamotech.service;

import com.kamotech.kamotech.model.Post;
import com.kamotech.kamotech.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepo postRepo;



    @Autowired
    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    // From here we can start our CRUD operations

    public Post addPost(Post post){
        post.setPayment("Definir avec le client");
        return postRepo.save(post);
    }

    public List<Post> findAllPosts(){

        return postRepo.findAll();
    }

    public Post updatePost(Post post){

        return postRepo.save(post);
    }

    public void deletePost(Long id){

        postRepo.deletePostById(id);
    }

}

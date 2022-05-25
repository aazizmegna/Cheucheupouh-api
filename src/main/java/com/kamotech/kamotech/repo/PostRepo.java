package com.kamotech.kamotech.repo;

import com.kamotech.kamotech.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
    void deletePostById(Long Id);
}
//JpaRepository has methods that will help us to make CRUD operations (save(), findAll()...)
//we will call them from UserService

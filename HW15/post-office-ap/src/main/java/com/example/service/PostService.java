package com.example.service;

import com.example.model.PostModel;
import com.example.response.PostResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PostService {
    PostResponse getPostDetails(String postId);
    List<PostModel> getAllPosts();
    PostModel getPostById(String postId);

}

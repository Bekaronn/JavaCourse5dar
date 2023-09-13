package com.example.service.post;

import com.example.model.PostRequest;
import com.example.model.PostResponse;
import jakarta.transaction.Transactional;

import java.util.List;

public interface PostService {
    PostResponse createPost(PostRequest postRequest);
    PostResponse updatePost(PostRequest postRequest);
    PostResponse getPostById(String postId);
    List<PostResponse> getAllPosts();

    @Transactional
    void deletePostById(String postId);
}

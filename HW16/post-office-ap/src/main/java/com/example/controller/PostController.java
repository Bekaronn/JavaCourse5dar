package com.example.controller;

import com.example.model.PostModel;
import com.example.model.PostRequest;
import com.example.model.PostResponse;
import com.example.service.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public PostResponse createPost(@RequestBody PostRequest postRequest){
        return postService.createPost(postRequest);
    }

    @PutMapping("/{postId}")
    public PostResponse updatePostById(@PathVariable String postId, @RequestBody PostRequest postRequest){
        postRequest.setPostId(postId);
        return postService.updatePost(postRequest);
    }

    @GetMapping("/{postId}")
    public PostResponse getPostById(@PathVariable String postId){
        return postService.getPostById(postId);
    }

    @GetMapping("/all")
    public List<PostResponse> getAllPosts() {
        return postService.getAllPosts();
    }

    @DeleteMapping("/{postId}")
    public void deletePostById(@PathVariable String postId){
        postService.deletePostById(postId);
    }
}

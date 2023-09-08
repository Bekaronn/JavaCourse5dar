package com.example.controller;

import com.example.feign.ClientF;
import com.example.model.PostModel;
import com.example.response.ClientResponse;
import com.example.response.PostResponse;
import com.example.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @Autowired
    ClientF client;

    @GetMapping("/check")
    public String checkPost() {
        return "post-office-api is working";
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public PostModel getPostById(@PathVariable String postId) {
        return postService.getPostById(postId);
    }

    @GetMapping("/client/check")
    public String checkClient() {
        return client.checkClient();
    }

    @GetMapping("/client/all")
    public List<ClientResponse> getAllClients() {
        return client.getAllClients();
    }

    @GetMapping("/client/{clientId}")
    public ClientResponse getClientById(@PathVariable String clientId) {
        return client.getClientById(clientId);
    }

    @GetMapping("/detail/{id}")
    public PostResponse getPostDetails(@PathVariable String id){
        return postService.getPostDetails(id);
    }

}
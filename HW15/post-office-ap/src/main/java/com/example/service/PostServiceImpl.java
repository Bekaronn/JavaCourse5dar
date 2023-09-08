package com.example.service;

import com.example.feign.ClientF;
import com.example.model.PostModel;
import com.example.response.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostServiceImpl implements  PostService{
    private static final HashMap<String, PostModel> postMap = new HashMap<>();

    static {
        PostModel postModel1 = new PostModel("1", "iphone", "delivering");
        PostModel postModel2 = new PostModel("2", "samsung", "delivered");
        PostModel postModel3 = new PostModel("3", "pen", "completed");
        postMap.put(postModel1.getPostId(), postModel1);
        postMap.put(postModel2.getPostId(), postModel2);
        postMap.put(postModel3.getPostId(), postModel3);
    }

    @Autowired
    private ClientF client;


    @Override
    public PostResponse getPostDetails(String postId) {
        PostResponse postResponse = new PostResponse();
        postResponse.setPostId(postMap.get(postId).getPostId());
        postResponse.setPostItem(postMap.get(postId).getPostItem());
        postResponse.setClient(client.getClientById(postId));
        postResponse.setReceiver(client.getClientById(postId));
        postResponse.setStatus(postMap.get(postId).getStatus());
        return postResponse;
    }

    @Override
    public List<PostModel> getAllPosts() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public PostModel getPostById(String postId) {
        return postMap.get(postId);
    }
}

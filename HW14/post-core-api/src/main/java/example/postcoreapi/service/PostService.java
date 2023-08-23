package example.postcoreapi.service;

import example.postcoreapi.model.PostModel;

import java.util.List;

public interface PostService {
    void createPost(PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPostById(String PostId);
    void updatePostById(String postId, PostModel postModel);
    void deletePostById(String postId);
}

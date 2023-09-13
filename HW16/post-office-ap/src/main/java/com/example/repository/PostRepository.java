package com.example.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {
    PostEntity getPostEntityByPostId(String PostId);

    List<PostEntity> getPostEntitiesBy();

    @Transactional
    void deletePostEntitiesByPostId(String postId);
}

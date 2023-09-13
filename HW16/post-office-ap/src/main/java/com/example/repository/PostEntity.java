package com.example.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String postId;
    @Column(nullable = false, length = 50)
    private String postItem;
    @Column(nullable = false, length = 50)
    private String status;
}

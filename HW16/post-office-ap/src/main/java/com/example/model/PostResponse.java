package com.example.model;

import com.example.model.ClientResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
    private String postId;
    private String postItem;
    private String status;
}

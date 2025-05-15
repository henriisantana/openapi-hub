package com.henriisantana.openapi_hub.integration;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Map;

@HttpExchange(accept = "application/json")
public interface JsonPlaceholderClient {

    @GetExchange("/posts")
    List<Map<String, Object>> getAllPosts();

    @GetExchange("/posts/{id}")
    Map<String, Object> getPostById(@PathVariable int id);

    @PostExchange("/posts")
    Map<String, Object> createPost(Map<String, Object> post);

    @PutExchange("/posts/{id}")
    Map<String, Object> updatePost(@PathVariable int id, Map<String, Object> post);

    @DeleteExchange("/posts/{id}")
    void deletePost(@PathVariable int id);

    // Adicionar métodos para outros recursos como comments, todos, etc.
}

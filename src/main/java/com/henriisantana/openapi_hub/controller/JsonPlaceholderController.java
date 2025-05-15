package com.henriisantana.openapi_hub.controller;

import org.springframework.web.bind.annotation.*;

import com.henriisantana.openapi_hub.integration.JsonPlaceholderClient;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("fakeapi/v1")
public class JsonPlaceholderController {

    private final JsonPlaceholderClient jsonPlaceholderClient;

    public JsonPlaceholderController(JsonPlaceholderClient jsonPlaceholderClient) {
        this.jsonPlaceholderClient = jsonPlaceholderClient;
    }

    @GetMapping("/posts")
    public List<Map<String, Object>> getAllPosts() {
        return jsonPlaceholderClient.getAllPosts();
    }

    @GetMapping("/posts/{id}")
    public Map<String, Object> getPostById(@PathVariable int id) {
        return jsonPlaceholderClient.getPostById(id);
    }

    @PostMapping("/posts")
    public Map<String, Object> createPost(@RequestBody Map<String, Object> post) {
        return jsonPlaceholderClient.createPost(post);
    }

    @PutMapping("/posts/{id}")
    public Map<String, Object> updatePost(@PathVariable int id, @RequestBody Map<String, Object> post) {
        return jsonPlaceholderClient.updatePost(id, post);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable int id) {
        jsonPlaceholderClient.deletePost(id);
    }
}

package com.stone.backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stone.backend.dto.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	public List<Post> findAllByOrderByCreatedDateAsc();
}

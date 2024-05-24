package com.blog.app.BlogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.app.BlogApplication.entity.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategoryId(Long categoryId);

}
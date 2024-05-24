package com.blog.app.BlogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.app.BlogApplication.entity.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(long postId);
}
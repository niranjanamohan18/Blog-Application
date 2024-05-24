package com.blog.app.BlogApplication.service;


import java.util.List;

import com.blog.app.BlogApplication.payload.PostDto;
import com.blog.app.BlogApplication.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    List<PostDto> getPostsByCategory(Long categoryId);
}
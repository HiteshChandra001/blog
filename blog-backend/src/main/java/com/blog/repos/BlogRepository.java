package com.blog.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entities.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
}

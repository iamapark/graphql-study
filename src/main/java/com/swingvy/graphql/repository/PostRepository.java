package com.swingvy.graphql.repository;

import com.swingvy.graphql.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author jinyoung.park
 * @date 2020/07/09
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    @Query("SELECT p FROM Post p")
    List<Post> getAllPosts(int count, int offset);
}

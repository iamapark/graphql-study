package com.swingvy.graphql.repository;

import com.swingvy.graphql.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jinyoung.park
 * @date 2020/07/09
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}

package com.swingvy.graphql.resolver;

import com.swingvy.graphql.Author;
import com.swingvy.graphql.Post;
import com.swingvy.graphql.repository.AuthorRepository;
import com.swingvy.graphql.repository.PostRepository;
import com.swingvy.graphql.PostResponse;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author jinyoung.park
 * @date 2020/07/09
 */
@Component
public class RootQueryResolver implements GraphQLQueryResolver {

    private final PostRepository postDao;
    private final AuthorRepository authorRepository;
    public RootQueryResolver(PostRepository postDao, AuthorRepository authorRepository) {
        this.postDao = postDao;
        this.authorRepository = authorRepository;
    }

    public List<PostResponse> allPosts(int count, int offset) {
        final List<Post> all = postDao.getAllPosts(count, offset);
        return PostResponse.from(all);
    }

    public List<Author> allAuthors() {
        return authorRepository.findAll();
    }

    public Author Author(Long id) {
        return authorRepository.findById(id).orElseThrow();
    }

    public PostResponse Post(Long id) {
        return postDao.findById(id).map(PostResponse::from).orElseThrow();
    }
}

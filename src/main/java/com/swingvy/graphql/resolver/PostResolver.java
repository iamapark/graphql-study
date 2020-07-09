package com.swingvy.graphql.resolver;

import com.swingvy.graphql.Author;
import com.swingvy.graphql.PostResponse;
import com.swingvy.graphql.repository.AuthorRepository;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author jinyoung.park
 * @date 2020/07/09
 */
@Component
@RequiredArgsConstructor
public class PostResolver implements GraphQLResolver<PostResponse> {
    private final AuthorRepository authorRepository;

    public Author getAuthor(PostResponse postResponse) {
        final Long authorId = postResponse.getAuthor().getId();
        return authorRepository.findById(authorId)
                .orElseThrow(NullPointerException::new);
    }
}

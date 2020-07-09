package com.swingvy.graphql.resolver;

import com.swingvy.graphql.Post;
import com.swingvy.graphql.PostResponse;
import com.swingvy.graphql.repository.AuthorRepository;
import com.swingvy.graphql.repository.PostRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author jinyoung.park
 * @date 2020/07/09
 */
@Component
@RequiredArgsConstructor
public class RootMutationResolver implements GraphQLMutationResolver {

    private final PostRepository postRepository;
    private final AuthorRepository authorRepository;

    public PostResponse writePost(Long authorId, String title, String text, String category) {
        Post post = new Post();
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthor(authorRepository.getOne(authorId));

        final Post save = postRepository.save(post);

        return PostResponse.from(save);
    }
}

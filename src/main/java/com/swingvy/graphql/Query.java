package com.swingvy.graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;

/**
 * @author jinyoung.park
 * @date 2020/07/13
 */
public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }
}

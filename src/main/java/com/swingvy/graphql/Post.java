package com.swingvy.graphql;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author jinyoung.park
 * @date 2020/07/09
 */
@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String text;
    private String category;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id")
    private Author author;
}

package com.swingvy.graphql;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jinyoung.park
 * @date 2020/07/09
 */
@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String thumbnail;

    public Long getId() {
        return id;
    }
}

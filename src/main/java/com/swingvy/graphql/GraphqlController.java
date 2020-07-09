package com.swingvy.graphql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinyoung.park
 * @date 2020/07/08
 */
@RestController
public class GraphqlController {

    @GetMapping(path = "test")
    public String test() {
        return "graphql";
    }
}

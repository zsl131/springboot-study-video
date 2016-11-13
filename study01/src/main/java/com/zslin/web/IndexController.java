package com.zslin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 钟述林 393156105@qq.com on 2016/11/14 1:26.
 */
@RestController
public class IndexController {

    @GetMapping(value = "index")
    public String index(HttpServletRequest request) {

        return "Hello World!";
    }
}

package com.wsw.controller;

import com.wsw.dto.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<User> query(@RequestParam("username") String name,
                            @PageableDefault(page = 0, size = 2) Pageable pageable) {

        System.out.println(name);

        System.out.println(pageable.getPageSize());

        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @GetMapping("/{id:\\d+}")
    public User getInfo(@PathVariable String id) {
        User user = new User();
        user.setUsername("wsw");
        return user;
    }
}

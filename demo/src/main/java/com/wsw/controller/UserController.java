package com.wsw.controller;

import com.wsw.dto.User;
import com.wsw.exception.UserNotFoundException;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/user")
@EnableSwagger2
public class UserController {

    @GetMapping
    @ApiOperation(value = "获取用户列表")
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

    @PostMapping
    public User create(@Valid @RequestBody User user, BindingResult error) {

        throw new UserNotFoundException("122212");

//        if (error.hasErrors()) {
//            error.getAllErrors().stream().forEach(e -> {
//                System.out.println(e.getDefaultMessage());
//            });
//        }

//        return user;
    }

    @GetMapping("/{id:\\d+}")
    public User getInfo(@PathVariable String id) {
        User user = new User();
        user.setUsername("wsw");
        return user;
    }
}

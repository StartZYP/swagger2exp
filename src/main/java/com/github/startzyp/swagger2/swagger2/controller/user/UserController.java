package com.github.startzyp.swagger2.swagger2.controller.user;

import com.github.startzyp.swagger2.swagger2.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户层操作", description = "用户 API", position = 100, protocols = "http")
@RequestMapping("/")
public class UserController {


    @ApiOperation("说你妈呢")
    @PostMapping(value = "userOpenWashingMachine/")
    public User userOpenWashingMachine(User user){
        return user;
    }

}

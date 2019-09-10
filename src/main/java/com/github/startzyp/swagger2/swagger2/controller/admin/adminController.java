package com.github.startzyp.swagger2.swagger2.controller.admin;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "管理层操作", description = "管理员 API", position = 100, protocols = "http")
@RequestMapping("/")
public class adminController {
}

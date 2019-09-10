package com.github.startzyp.swagger2.swagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(userApiInfo())
                .groupName("用户组")
                .select()
                // 自行修改为自己的包路径
                .apis(RequestHandlerSelectors.basePackage("com.github.startzyp.swagger2.swagger2.controller.user"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket adminApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(adminApiInfo())
                .groupName("管理组")
                .select()
                // 自行修改为自己的包路径
                .apis(RequestHandlerSelectors.basePackage("com.github.startzyp.swagger2.swagger2.controller.admin"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo userApiInfo() {
        return new ApiInfoBuilder()
                .title("洗衣机开启系统UserApi")
                .description("创维漏洞User API 1.0 操作文档")
                //服务条款网址
                .termsOfServiceUrl("http://blog.ipedg.com/")
                .version("1.0")
                .contact(new Contact("漏洞详解文章", "http://blog.ipedg.com/", "codehacker886@gmail.com"))
                .build();
    }

    private ApiInfo adminApiInfo() {
        return new ApiInfoBuilder()
                .title("洗衣机开启系统AdminApi")
                .description("创维漏洞User API 1.0 操作文档")
                //服务条款网址
                .termsOfServiceUrl("http://blog.ipedg.com/")
                .version("1.0")
                .contact(new Contact("漏洞详解文章", "http://blog.ipedg.com/", "codehacker886@gmail.com"))
                .build();
    }
}
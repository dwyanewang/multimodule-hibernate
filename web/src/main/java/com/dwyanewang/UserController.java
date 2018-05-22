/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/05/22 14:29
 * ProjectName : multimodule-hibernate
 * Description : UserController
 * Version : V1.0
 */
package com.dwyanewang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") Long id){
        System.out.println("id = [" + id + "]");
        return userService.getUserById(id);
    }

    @GetMapping("/list")
    public List<User> getList(){
        return userService.getList();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
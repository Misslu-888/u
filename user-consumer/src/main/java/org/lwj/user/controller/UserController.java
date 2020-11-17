package org.lwj.user.controller;

import org.lwj.user.entity.User;
import org.lwj.user.service.UserService;
import org.lwj.user.struct.PageResult;
import org.lwj.user.vo.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("page")
    public PageResult<User> page(int cp, int pz, @RequestBody SearchVO vo){
        return userService.getPage(cp,pz,vo);
    }
}

package org.lwj.user.controller;


import org.apache.catalina.User;
import org.lwj.user.client.UserClient;
import org.lwj.user.struct.PageResult;
import org.lwj.user.vo.SearchVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.lwj.user.service.UserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lwj
 * @since 2020-11-16
 */
@RestController
@RequestMapping("/user")
public class UserController implements UserClient {
	@Autowired
	private UserService userService;

	@Override
	@PostMapping("page")
	public PageResult<User> page(int cp, int pz, SearchVO vo) {
		return userService.page(cp,pz,vo);
	}
}

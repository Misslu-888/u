package org.lwj.user.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.lwj.user.service.MajorService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lwj
 * @since 2020-11-16
 */
@RestController
@RequestMapping("/major")
public class MajorController {
	@Autowired
	private MajorService majorService;
}

package org.lwj.user.client;

import org.lwj.user.entity.User;
import org.lwj.user.fallback.UserFallBack;
import org.lwj.user.struct.PageResult;
import org.lwj.user.vo.SearchVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",path = "user",fallback = UserFallBack.class)
public interface UserClient {
    @PostMapping("page")
    PageResult<User> page(@RequestParam("cp") int cp, @RequestParam("pz") int pz, @RequestBody SearchVO vo);
}

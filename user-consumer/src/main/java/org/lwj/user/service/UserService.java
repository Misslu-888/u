package org.lwj.user.service;

import org.lwj.user.client.UserClient;
import org.lwj.user.entity.User;
import org.lwj.user.struct.PageResult;
import org.lwj.user.vo.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserClient userClient;

    public PageResult<User> getPage(int cp, int pz, SearchVO vo) {
        return userClient.page(cp,pz,vo);
    }
}

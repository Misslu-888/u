package org.lwj.user.fallback;

import org.lwj.user.client.UserClient;
import org.lwj.user.entity.User;
import org.lwj.user.struct.PageResult;
import org.lwj.user.vo.SearchVO;
import org.springframework.stereotype.Component;

@Component
public class UserFallBack implements UserClient {
    @Override
    public PageResult<User> page(int cp, int pz, SearchVO vo) {
        return PageResult.of(null,0);
    }
}

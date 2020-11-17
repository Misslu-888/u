package org.lwj.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.catalina.User;
import org.lwj.user.mapper.UserMapper;
import org.lwj.user.service.UserService;
import org.lwj.user.struct.PageResult;
import org.lwj.user.util.StringUtils;
import org.lwj.user.vo.SearchVO;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lwj
 * @since 2020-11-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public PageResult<User> page(int cp, int pz, SearchVO vo) {
        Page<User> userPage = new Page<>(cp, pz);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        if(Objects.nonNull(vo)){
            String name = vo.getName();
            if(StringUtils.isNotEmpty(name)){
                wrapper.like("a.name",name);
            }
            String age = vo.getAge();
            if(StringUtils.isNotEmpty(age)){
                wrapper.ge("a.age",age);
            }
        }
        userPage = baseMapper.getPage(userPage,wrapper);
        return PageResult.of(userPage.getRecords(),userPage.getTotal());
    }
}

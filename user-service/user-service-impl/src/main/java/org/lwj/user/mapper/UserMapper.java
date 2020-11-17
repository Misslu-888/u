package org.lwj.user.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lwj
 * @since 2020-11-16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    Page<User> getPage(Page<User> userPage,@Param("ew") QueryWrapper<User> wrapper);
}

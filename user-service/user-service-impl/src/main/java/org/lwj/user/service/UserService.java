package org.lwj.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.catalina.User;
import org.lwj.user.struct.PageResult;
import org.lwj.user.vo.SearchVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lwj
 * @since 2020-11-16
 */
public interface UserService extends IService<User> {

    PageResult<User> page(int cp, int pz, SearchVO vo);
}

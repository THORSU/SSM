package com.test.mapper;

import com.test.pojo.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: QuincySu
 * Date: 2018-07-30
 * Time: 10:24
 */
public interface UserMapper {
    /**
     * 查询用户
     * @return
     */
    public User getUser(User user);
}

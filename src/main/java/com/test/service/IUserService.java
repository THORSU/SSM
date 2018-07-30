package com.test.service;

import com.test.pojo.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: QuincySu
 * Date: 2018-07-30
 * Time: 10:06
 */
public interface IUserService {
    /**
     * 查询用户
     * @return
     */
    public User getUser(User user);
}

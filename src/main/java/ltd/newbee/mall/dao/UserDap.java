package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.User;

import java.util.List;

public interface UserDap {
    /***
     * 返回数据列表
     * @return
     */
    List<User> findAllUsers();
}

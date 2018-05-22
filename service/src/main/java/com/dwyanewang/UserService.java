/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/05/22 14:25
 * ProjectName : multimodule-hibernate
 * Description : UserService
 * Version : V1.0
 */
package com.dwyanewang;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getList();
}

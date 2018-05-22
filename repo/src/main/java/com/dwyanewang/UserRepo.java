/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/05/22 14:21
 * ProjectName : multimodule-hibernate
 * Description : UserRepo
 * Version : V1.0
 */
package com.dwyanewang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepo extends JpaRepository<User,Long> {

}

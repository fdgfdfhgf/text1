package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * 增加用户数据
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}

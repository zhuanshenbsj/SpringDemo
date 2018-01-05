package com.wcxu.annotation.UserInfoAutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	//@Autowired默认bytype ，如果byName就要加Qualifier
	@Autowired
	//@Qualifier("userDao1")//缩小范围或指定唯一
	private IUserDao userDao;

	//	public void setUserDao(IUserDao userDao) {
	//		this.userDao = userDao;
	//	}

	@Override
	public void done() {
		userDao.done();
	}

}

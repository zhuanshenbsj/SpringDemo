package com.wcxu.annotation.jsr330;

import javax.inject.Inject;
import javax.inject.Named;

//@Service
@Named
public class UserServiceImpl implements IUserService {

	//@Resource
	//@Inject
	private IUserDao userDao;

	@Inject
	public void setUserDao(@Named("userDaoImpl") IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void done() {
		userDao.done();
	}

}

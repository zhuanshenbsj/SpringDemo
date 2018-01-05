package com.wcxu.annotation.UserInfoResource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	//  @Resource
	//	public void setUserDao(IUserDao userDao) {
	//		this.userDao = userDao;
	//	}

	@PostConstruct
	public void init() {
		System.out.println("jsrService init");
	}

	@PreDestroy
	public void destory() {
		System.out.println("jsrService destory");
	}

	@Override
	public void done() {
		userDao.done();
	}

}

package com.wcxu.annotation.UserInfoAutoWired;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

	@Override
	public void done() {
		System.out.println("userdaoimpl.do sth");
	}

}

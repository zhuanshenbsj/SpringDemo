package com.wcxu.annotation.jsr330;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

	@Override
	public void done() {
		System.out.println("userdaoimpl.do sth");
	}

}

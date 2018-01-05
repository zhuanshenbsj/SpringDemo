package com.wcxu.autowiring;

public class AutoWiringService {

	public AutoWiringService(AutoWiringDao autoWiringDao) {
		super();
		this.autoWiringDao = autoWiringDao;
	}

	private AutoWiringDao autoWiringDao;

	public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
		this.autoWiringDao = autoWiringDao;
	}

	public void saysth(String str) {
		autoWiringDao.say(str);
	}

}

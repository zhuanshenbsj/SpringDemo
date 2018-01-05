package com.wcxu.junitTest;

public class StringUtil {
	public String concat(String str1, String str2) {
		str1 = str1 == null ? "" : str1;
		str2 = str2 == null ? "" : str2;
		return str1.replace(" ", "") + str2.replace(" ", "");
	}
}

package com.machine.learning.explore.web.utils;

public class StringUtils {
	public static boolean isEmpty(String str){
		if(null==str){
			return true;
		}
		if("".equals(str.trim())){
			return true;
		}
		return false;
	}

}

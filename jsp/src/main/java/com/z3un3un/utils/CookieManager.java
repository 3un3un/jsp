package com.z3un3un.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieManager {

	public CookieManager() {
	}
	
	public static void makeCookie(HttpServletResponse response,
			String name, String value, int time) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(time);
		response.addCookie(cookie);

	}
	public static String readCookie(HttpServletRequest request,
			String name) {
		String value = "";
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals(name)) {
				value = cookie.getValue();
				break;
			}
		}
	
		return value;
		
	}
	
	public static void deleteCookie(HttpServletResponse response,
			String name) {
		makeCookie(response, name, "", 0);
		
	}
}

package com.app.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		String pwd="sam";
		BCryptPasswordEncoder enc=new BCryptPasswordEncoder();
		String s1=enc.encode(pwd);
		System.out.println(s1);
		
		
		
		
		
		
		
	}
}

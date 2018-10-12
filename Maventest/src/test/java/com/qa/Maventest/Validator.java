package com.qa.Maventest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static Boolean isValid(String pw) {
		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
		Matcher matcher = pattern.matcher(pw);
		return matcher.matches();
	}

}
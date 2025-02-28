package com.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static boolean validEmail(String email)
	{
		boolean validate = Pattern.matches
				("[a-zA-z0-9]+(\\.[A-Za-z0-9]*)*@[a-zA-z0-9]+([\\.A-za-z0-9]*)*"
						,email);
		return validate;
	}
	public static boolean validPassword(String pass)
	{
		String pattern1=
	   "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%&*])(?=\\S+$).{10,}";
		
		boolean validPass = Pattern.matches(pass, pattern1);
		return validPass;
	}
	
	
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");
		
		Matcher m = p.matcher("av");
		
		boolean b = m.matches();
		
		System.out.println(b);
		
		boolean b1 = Pattern.compile("..s").matcher("bss").matches();
		System.out.println(b1);
		
		System.out.println(Pattern.matches("[a-z][a-z]","dg"));
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}","9897989898"));
		System.out.println();
	    boolean v = validEmail("adhav@gmail.com");
	    System.out.println(v);
	    boolean a = validPassword("Adddddddddddddd@1");
	    
	    System.out.println(a);
	}
}

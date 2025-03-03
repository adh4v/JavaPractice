package com.day6;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		AgeValide a = new AgeValide();
		a.checkAge(age);
	}
}

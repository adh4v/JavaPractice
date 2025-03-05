package com.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Exp2 {
	public static void main(String[] args) {
		Path path =  Paths.get("src/byteTest.txt");
		Path target = Paths.get("src/charTest.txt");
		try
		{
			Path p = Files.copy(path, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Target File Location : "+p);
			System.out.println("Copied Content : "+new String(Files.readAllBytes(p)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

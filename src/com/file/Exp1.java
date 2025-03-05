package com.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exp1 {
	public static void main(String[] args) {
		Path path = Paths.get("src/byteTest.txt");
		try
		{
			byte[] bs = Files.readAllBytes(path);
			List<String> linesData = Files.readAllLines(path);
			System.out.println("Reading Byte Data :"+new String(bs));
			System.out.println("Reading list of lines : "+linesData);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

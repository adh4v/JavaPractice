package com.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Exp5 {
	public static void main(String[] args) {
		Path path = Paths.get("src/byteTest.txt");
		try
		{
			String lines="";
			Files.writeString(path, lines, StandardOpenOption.CREATE);
			byte []bs = Files.readAllBytes(path);
			List<String> line = Files.readAllLines(path);
			System.out.println("Reading byte data : "+new String(bs));
			System.out.println("Reading list of lines : "+lines);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

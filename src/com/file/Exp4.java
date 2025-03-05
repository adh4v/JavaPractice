package com.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Exp4 {
	public static void main(String[] args) {
		List<String> data = null;
		try(Stream<String> strm = Files.lines(Paths.get("src/charTest.txt")))
		{
			data = strm.filter(t -> t.startsWith("T"))
					.map(String::toUpperCase).toList();
			System.out.println(data);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

package com.file;

import java.io.FileWriter;

public class Exp3 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("src/resourceTest.txt"))
		{
			fw.write("This is a sample resource");
			System.out.println("Done");
			fw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

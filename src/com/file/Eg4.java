package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Eg4 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try
		{
			fr = new FileReader("src/charTest.txt");
			br = new BufferedReader(fr);
			System.out.println(br.readLine());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
				fr.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

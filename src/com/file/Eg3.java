package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Eg3 {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try
		{
			fw = new FileWriter("src/charTest.txt");
			bw = new BufferedWriter(fw);
			String msg = "This is a simple text file";
			bw.write(msg);
			System.out.println("Done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.close();
				fw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

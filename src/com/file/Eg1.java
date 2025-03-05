package com.file;

import java.io.File;
import java.io.FileOutputStream;

public class Eg1 {
	public static void main(String[] args) {
		FileOutputStream fout = null;
		try
		{
			File f = new File("src/byteTest.txt");
			fout = new FileOutputStream(f);
			String msg = "This is a Sample Test for I/O";
			fout.write(msg.getBytes());
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
				fout.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

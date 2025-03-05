package com.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc.next();
		String city = sc.next();
		int pincode = sc.nextInt();
		Eg5 e = new Eg5(id,name,city,pincode);
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream objout = null;
		try
		{
			fout = new FileOutputStream("src/customer.txt");
			
			bout = new BufferedOutputStream(fout);
			objout = new ObjectOutputStream(bout);
			objout.writeObject(e);
			System.out.println("Done");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				objout.close();
				bout.close();
				fout.close();
			}
			catch(Exception ep)
			{
				ep.printStackTrace();
			}
		}
		
	}

}

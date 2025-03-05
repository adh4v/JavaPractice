package com.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DSerialDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream obj = null;
		try
		{
			fis = new FileInputStream("src/customer.txt");
			bis = new BufferedInputStream(fis);
			obj = new ObjectInputStream(bis);
			Eg5 cis=(Eg5)obj.readObject();
			System.out.println(cis.getId()+" "+cis.getName()+" "+cis.getCity()+" "+cis.getPincode());
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				obj.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

package com.dashboard;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readfile {

	public static void main(String[] args) {
		try {
			
		
		FileReader ref=new FileReader("C:\\Users\\91900\\git\\divi\\FirstProject\\src\\com\\dashboard\\Readfile.java") ;
		Properties ref1=new Properties();
		ref1.load(ref);
	System.out.println	(ref1.getProperty("user"));
	System.out.println(	ref1.getProperty("password"));
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		catch(NullPointerException e) {
			e.printStackTrace();
		}

	}

}

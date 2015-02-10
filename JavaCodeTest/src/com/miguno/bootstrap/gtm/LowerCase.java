package com.miguno.bootstrap.gtm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowerCase {
	
	public static void toLowerCase(String uppercase){
		System.out.println(uppercase.toLowerCase());
	}

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream(args[0]);				
		BufferedReader br = new BufferedReader(new InputStreamReader(f));
		String strLine;
		while ((strLine = br.readLine()) != null)   {
			toLowerCase(strLine);
		}
		br.close();		
		
	}	
}

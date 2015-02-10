package com.miguno.bootstrap.gtm;

import java.util.*;
import java.io.*;
public class Fibonacci {

	/**
	 * @param args
	 */
	public static int fibonacci(int n) {
	    if ((n == 0) || (n== 1))
	      return n;
	    else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	  }
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(new File(args[0]));
		int n;
	    while(sc.hasNextInt()){
	      n = sc.nextInt();
	      System.out.printf("Fibonacci of %d is: %d\n", n , fibonacci(n));
		  }
	    sc.close();
	}

}

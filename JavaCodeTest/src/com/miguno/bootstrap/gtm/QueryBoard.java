package com.miguno.bootstrap.gtm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QueryBoard {
	public static final int size = 256; 
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        int[][] board = new int[size][size];
		Scanner in = new Scanner(file);
		while(in.hasNextLine()) {
			String line = in.nextLine(); 
			Scanner lineScan = new Scanner(line); 
			String method = lineScan.next(); 			
			if (method.equalsIgnoreCase("SetCol")) {
				setCol(lineScan.nextInt(), lineScan.nextInt(), board);
			} else if (method.equalsIgnoreCase("SetRow")) {
				setRow(lineScan.nextInt(), lineScan.nextInt(), board);
			} else if (method.equalsIgnoreCase("QueryRow")) {
				queryRow(lineScan.nextInt(), board);
			} else {
				queryCol(lineScan.nextInt(), board);
			}
			
		}
    }
    
    public static void setCol(int col, int value, int[][] board) {
    	for (int i = 0; i < size; i++) {
    		board[col][i] = value; 
    	}
    }
    
    public static void setRow(int row, int value, int[][] board) {
    	for (int i  = 0; i < size; i++) {
    		board[i][row] = value; 
    	}
    }
    
    public static void queryRow(int row, int[][] board) {
    	int sum = 0; 
    	for (int i = 0; i < size; i++) {
    		sum += board[i][row];
    	}
    	System.out.println(sum); 
    }
    
    public static void queryCol(int col, int[][] board) {
    	int sum = 0; 
    	for (int i = 0; i < size; i++) {
    		sum += board[col][i]; 
    	}
    	System.out.println(sum); 
    }
}
package com.miguno.bootstrap.gtm;

public class PrimePalindrome {
		
		public static boolean checkPrimeNumber(int num){
			int count=0;
			for(int j=1;j<=num;j++){
				if(num%j == 0){
					count++;
				}
			}
			return count == 2 ? true:false;
		}
		
		public static boolean checkPalindrome(int num){
			
			String palinString = String.valueOf(num);
			String reverseStr = new StringBuffer(palinString).reverse().toString();
			if(palinString.compareTo(reverseStr)==0){
				return true;
			}
			return false;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int i =0;
			int num =1;
			int count=0;
			int primepalin =0;
			
			while(i<1000){
				if(checkPalindrome(num)){
					count++;
							
					if(checkPrimeNumber(num)){
						primepalin = num;
					}
				}
				i++;
				num++;
			}
			
			System.out.println("The largest Prime Palindrome less than 1000 is  "+primepalin);
			
		}

	}

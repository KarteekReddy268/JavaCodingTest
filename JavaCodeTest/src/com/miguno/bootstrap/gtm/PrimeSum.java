package com.miguno.bootstrap.gtm;

public class PrimeSum {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		while(i<1000){
			int count= 0;
		for(int j=1; j<=i; j++){
			if(i%j ==0){
				count=count+1;
			}			
		}
		if(count == 2){
			//System.out.println(i);
			sum= sum+i;
		}
		i++;
		
	}
		System.out.println("sum of prime number less than 1000 is "+sum);
}
}
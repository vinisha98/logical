package com.bridfgelabz.logical;

import java.util.Scanner;

import com.bridfgelabz.utility.Utility2;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n, sum=0;  
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=sc.nextLong();  
		Utility2.Perfectnumber(n,sum);
	}

}

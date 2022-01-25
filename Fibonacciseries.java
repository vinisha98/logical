package com.bridfgelabz.logical;

import java.util.Scanner;

import com.bridfgelabz.utility.Utility2;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the count value: ");
		int count = scan.nextInt();    
		 System.out.print(n1+" "+n2);    
		 Utility2.Fibonacciseries(n1, n2, n3, count);
}
}
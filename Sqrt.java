package com.bridfgelabz.logical;

import java.util.Scanner;

import com.bridfgelabz.utility.Utility2;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scan = new Scanner(System.in);
		       System.out.println("Enter a non negitive number: ");
		       int c = scan.nextInt();
		       c=c*-1;
		       Utility2.Sqrt(c);
	}
}


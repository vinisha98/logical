package com.bridfgelabz.logical;

import java.util.Scanner;

import com.bridfgelabz.utility.Utility2;

public class Dayofweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int m = scan.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date: ");
		int d = sc.nextInt();
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter The Year: ");
		int y = sn.nextInt();
		Utility2.Dayofweek(m, d, y);
	}

}

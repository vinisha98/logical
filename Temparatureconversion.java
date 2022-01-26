package com.bridfgelabz.logical;

import java.util.Scanner;

import com.bridfgelabz.utility.Utility2;

public class Temparatureconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature value");
		int tempValue = scan.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter from option: 1)Celsius to Fahrenheit 2)Fahrenheit to Celsius:");
		int tempUnit = sc.nextInt();
		Utility2.Temperatureconversion(tempValue, tempUnit);
	}

}

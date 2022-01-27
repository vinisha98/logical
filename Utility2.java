package com.bridfgelabz.utility;

public class Utility2 {

	public static int M;
	public static int N;
	public static int Array[][] = new int[M][N];  

	public  static void Twodimearray(int M, int N, int[][] Array) {
		System.out.println("Elements of the array are: ");  
		for ( int i = 0; i < M; i++)   
		{   
		for (int j = 0; j < N; j++)  { 
		System.out.print(Array[i][j] + " ");   
		  
		} 
		System.out.println(); 
	}
	}
	
	public static void Sumtozero(int[] arr, int n)
	{
	    boolean found = false;
	    for (int i=0; i<n-2; i++)
	    {
	        for (int j=i+1; j<n-1; j++)
	        {
	            for (int k=j+1; k<n; k++)
	            {
	                if (arr[i]+arr[j]+arr[k] == 0)
	                {
	                    System.out.print(arr[i]);
	                    System.out.print(" ");
	                    System.out.print(arr[j]);
	                    System.out.print(" ");
	                    System.out.print(arr[k]);
	                    System.out.print("\n");
	                    found = true;
	                }
	            }
	        }
	    }
	 
	    if (found == false)
	        System.out.println(" not exist ");
	}

	public static void Distance(int x,int y) {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Distance from (0, 0) to (" +  x + ", " + y + ") is " + distance);		
	}
	
	public static void Quadratic(double a,double b,double c) {
		double d= b * b - 4.0 * a * c;  
		if (d> 0.0)   
		{  
		double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
		System.out.println("The roots are " + r1 + " and " + r2);  
		}   
		else if (d == 0.0)   
		{  
		double r1 = -b / (2.0 * a);  
		System.out.println("The root is " + r1);  
		}   
		else   
		{  
		System.out.println("Roots are not real.");  
		}
	}
	
	public static void Windchills(double t,double v) {
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t + " Fahrenheit");
        System.out.println("Wind speed  = " + v + " miles per hour");
        System.out.println("Wind chill  = " + w);
	}
	
	public static void Fibonacciseries(int n1,int n2,int n3,int count) {
		 for(int i=2;i<count;++i)    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}
	
	public static void Perfectnumber(long n,long sum) {
		for(int i=1;i<=n/2;i++) 
		{  
		if(n % i == 0)  
		{  
		sum = sum + i;  
		} 
		}
		if(sum==n)  
		{  
		System.out.println( n + " is a perfect number.");  
		} 
		else  {
		System.out.println( n + " is not a perfect number.");   
		} 
	}
	
	public static void Prime(int n) {
		int temp=0;
		for (int i=2; i<n/2; i++)
		{
		if ( n%i == 0) {	
			temp=1;
			break;
		}
		}
		if ( n == 1) {
			System.out.println( n+ " is not a prime and not composite");
		}
		else if ( temp == 0) {
			System.out.println( n + " is prime number");
		}
		else {
			System.out.println(n + " is nota prime number");
		}		
		}	
	
	public static void Plaindrom(int num) {
		 int r,sum=0,temp;    
		  temp = num;    
		  while( num > 0 ){    
		   r= num % 10;   
		   sum = ( sum * 10 )+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    {
		   System.out.println( temp + " is a palindrome number ");    
		  }
		  else    {
		   System.out.println( temp + " is not a palindrome");   
		  }
	}
	public static void Coupon(int number) {
		boolean[] isCollected =new boolean[number];
		int count = 0;
		int distint = 0;
		while (distint < number) {
			int value = (int) Math.floor(Math.random() * number);
			count++;
			if (!isCollected[value]) {
				distint++;
				isCollected[value] = true;
			}
		}
		System.out.println(count);				
	}
	
	public static void Vendingmachine(int amount) {
	        int[] notes = new int[]{ 1000, 500, 100, 50, 10, 5, 2, 1 };
	        int[] noteCounter = new int[8];
	        int count = 0;
	        for (int i = 0; i < 8; i++) 
	        {
	            if (amount >= notes[i]) 
	            {
	                noteCounter[i] = amount / notes[i];
	                amount = amount - noteCounter[i] * notes[i];
	            }
	        }
	        System.out.println("list of Rs Notes that would given in the Change:");
	        for (int i = 0; i < 8; i++) 
	        {
	            if (noteCounter[i] != 0)
	            {
	                System.out.println(notes[i] + " RS : " + noteCounter[i] + "Note");
	                count = count+1;
	            }
	        }
	        System.out.println("Number of minimum notes needed will be: " + count);
	}
	
	public static void Dayofweek(int m,int d,int y) {
		int tempY,tempM,tempD,x;
				tempY = ((y -(14 - m) )/ 12);
				x = tempY + tempY/4 - tempY/100 + tempY/400;
				tempM = m + 12 * ((14 - m) / 12) - 2;
				tempD = (d + x + 31*tempM/ 12) % 7 ;
				System.out.println("Day of the week (Sunday=0;Monday=1;Tuesday=2;Wednesday=3;Thursday=4;Friday=5;Saturday=6)" + tempD);
	}
	
	public static void Temperatureconversion(int tempValue,int tempUnit) {
		int conv1,conv2;
		switch (tempUnit) {
		case 1:
			conv1 = (tempValue * 9/5) + 32; 
			System.out.println("Celsius to Fahrenheit: " + conv1);
			break;
		case 2:
			 conv2 = (tempValue - 32) * 5/9;
				System.out.println("Fahrenheit to Celsius: " + conv2);
			break;
		default:
		}
	}
	
	public static void Monthlypayment(int p,int y,int r) {
		int n,R;
		double payment;
		n=12*y;
		R=(r/12)*100;
		payment = (p*R)/1-(Math.pow((1+R),(-n)));
		System.out.println("The payment that has to be done will be: " + payment);
	}
	
	public static void Sqrt(int c) {
		 double epsilon = 1e-15;    
	        double t = c;              
	        while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	        }
	        System.out.println(t);
	}
	
	public static void Binary(int num)
	{
		System.out.print("Binary value of "+ num +" will be: " );
    int[] binary = new int[35];
    int id = 0;
    while (num > 0) {
        binary[id++] = num % 2;
        num = num / 2;
    }
	for (int i = id - 1; i >= 0; i--) {
        System.out.print(binary[i] + "");
}
}
}
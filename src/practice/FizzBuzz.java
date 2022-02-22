package practice;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
		int n=sc.nextInt();
		if(n%3==0 && n%5!=0) {
			System.out.println("FIZZ");
		}
		else if (n%5==0 && n%3!=0) {
			System.out.println("BIZZ");
		}
		else if (n%3==0 && n%5==0) {
			System.out.println("FIZZBIZZ");
		}
		else {
			System.out.println(n);
		}
}
}
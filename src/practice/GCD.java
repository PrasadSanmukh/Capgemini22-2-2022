package practice;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
			int n=sc.nextInt();
			 System.out.println("enter  next the number");
				int x=sc.nextInt();
				int y=1;
				for(int i = 1; i <= n && i <=x; i++)
		        {
		            if(n%i==0 && x%i==0)
		                y= i;
		        }
				System.out.println("gcd of "+n+" and "+x+" is:"+y);
	}

}
 
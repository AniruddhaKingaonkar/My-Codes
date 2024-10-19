package day1;
import java.util.*;
import java.io.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int rev=0;
		int n=num;
		
		while(num!=0) {
			rev = rev*10+num%10;  //  sum= sum+num%10 ;
			num=num/10;
		}
		if (n==rev) {
			System.out.println("pali");
		} else {
			System.out.println("Non-pali");
		}
		
	}

}

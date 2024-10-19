package day1;
import java.util.*;
import java.io.*;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev="";
		int len = str.length();
		
		for (int i = len-1; i>=0; i--) {
			rev= rev+str.charAt(i);
			
		}
		if (str.equals(rev)) {
			System.out.println("pali");
			
		} else {
			System.out.println("Non-pali");
		}
	}

}

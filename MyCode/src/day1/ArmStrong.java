package day1;
 import java.util.*;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner dc = new Scanner(System.in);
          int num = dc.nextInt();
          int cube=0,n,r;
          
        n=num;
        
        while(num!=0) {
        	r= num%10;
        	cube= cube+(r*r*r);
        	num=num/10;
        }
        
        if(n==cube) {
        	System.out.println("armStrong");
        }
        else {
        	System.out.println("not arm");
        }
	}

}

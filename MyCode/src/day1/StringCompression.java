package day1;
import java.util.*;
public class StringCompression {
   
	
		  public static String getComStr(String str){
		      String ans="";
		      int  count=0;
		      char ch = str.charAt(0);
		      
		      for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)==ch) {
					count++;
				}
				else {
					ans =ans+ch;
						if(count>1) {
							ans = ans + count;
							count = 1;
						}
						ch =str.charAt(i);
					}
				
				if(i==str.length()-1) {
					ans =ans+ch;
					if(count>1) {
						ans = ans + count;
						count = 1;
					}
				}
				}
			return ans;
			}
		     
		      
		  
		    public static void main(String args[]){
		       
		       Scanner sc = new Scanner(System.in);

		       String str = sc.nextLine();

		       System.out.println(getComStr(str));

		    }
		}


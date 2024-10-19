package day1;

import java.util.Iterator;

public class ReverseEachWordofStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str = "Java is Programming language";
            
          String words[] =   str.split(" ");
        for (int i = words.length-1; i >= 0 ; i--) {
			System.out.println(words[i]);
		}
        
        
          String reversestring = " ";
          
          for (String w:words) {
        	  String reverseword=" ";
        	  for (int i = w.length()-1; i >= 0; i--) {
        		  reverseword     = reverseword + w.charAt(i);
				    
			}
        	  reversestring = reversestring + reverseword ;
		}
          System.out.println(reversestring);
	}

}

package day1;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  int a[] = {1,2,3,4,5,6,7,8,9,10};
                   
                  int key = 1;
                  boolean flag = false;
                  int l = 0;
                  int h = a.length-1;
                  System.out.println(h);
                  while (l<=h) {
                	   int m =(l+h)/2;
                	   
                	   if(key == a[m]) {
                		   System.out.println("element found");
                		   flag = true;
                		   break;
                	   }
                	   if(a[m]<key) {
                		   l = m+1;
                	   }
                	  if(a[m]>key) {
                		  h = m -1;
                	  }
					
				}
                  if(flag==false) {
                	  System.out.println("ele not found");
                  }
                  
                  
                  
	}

}

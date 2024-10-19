package day1;

public class StringCompressionRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "aaabbc";
       
       String compreeStr = comprestr(str);
       System.out.println(compreeStr);
       
	}

	private static String comprestr(String st) { //aaabbc aabbcc
		// TODO Auto-generated method stub
		String compressed = "";
		int count = 1;
		
		for (int i = 0; i < st.length(); i++) {  //0 1 2 3
			if(i+1 < st.length() && st.charAt(i)==st.charAt(i+1))//4<6
			{                                //3==4
			count++;  //2
			}
			else {
				compressed = compressed + st.charAt(i)+String.valueOf(count);
				count = 1;
			}
			}
			
		
		return compressed;
	}

}

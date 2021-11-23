package com.company.module.reverse;

public class ReverseString {
	public static void main(String[] args) {
		String str = "nethaji kumar";
		String rev = "";

		for(int i = str.length()-1; i>0; i--) {
			rev = rev + str.charAt(i);
			
		}
		
		System.out.println(rev);
		System.out.println(str.substring(str.indexOf(' ')+1)+ " " 
							+ str.substring(0, str.indexOf(' ')));
		String s[] = str.split(" ");
		for(int i = s.length-1 ; i>=0; i--) {
			System.out.print(s[i]+ " ");
		}
	}

}

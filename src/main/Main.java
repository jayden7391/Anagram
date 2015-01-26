package main;

import java.util.Scanner;

public class Main {
	
	public static int same(String sn, String pw){
		
		int i=0, temp = 0;
		char sn_c[] = sn.toCharArray(), pw_c[]=pw.toCharArray();
		
		for(i=0; i<sn.length(); i++){
			if(sn_c[i] == pw_c[i]){
				temp = 1;
			}
			else{
				temp = 0;
				break;
			}
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		int t=0, i=0, length=0, j=0, k=0, temp = 0, temp_c=0;
		String s1=null, s2=null;
		char ch1[], ch2[];
		
		Main sm = new Main();
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt();
		
		for(i=0; i<t; i++){
			temp = 0;
			temp_c = 0;
			s1 = sc.next();
			s2 = sc.next();
			
			
			
			if(s1.length() != s2.length() || sm.same(s1, s2) == 1 ){
				System.out.println("No.");
				continue;
			}
			
			else{
				length = s1.length();
				ch1 = s1.toCharArray();
				ch2 = s2.toCharArray();
				
				for(j=0; j<length; j++){
					for(k=0; k<length; k++){
						
						if(ch1[j] == ch2[k]){
							ch2[k] = ' ';
							temp_c = 1;
							break;
						}
						
						else
							temp_c = 0;
					}
					
					if(temp_c == 0)
						break;
				}
			
				if(temp_c == 1)
					temp = 1;
			}
			
			if(temp == 1)
				System.out.println("Yes");
			else
				System.out.println("No.");
			
		}

	}
	

}

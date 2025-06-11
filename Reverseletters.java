package task2.corejava;

import java.util.Scanner;

public class Reverseletters {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			String word=in.nextLine();
			char[] ch=word.toCharArray();
			System.out.println("String values");
			for(int i=0;i<word.length();i++) {
				System.out.println(ch[i]);
			}
			System.out.println("Reversed String:");
			for(int i=word.length()-1;i>=0;i--) {
				System.out.print(ch[i]);
			}
			in.close();
		}
}

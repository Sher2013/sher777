
package sample;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("ENTER A THREE CHARACTER STRING:");
		String a=scan.nextLine();
		Myprogram mypro=new Myprogram();
		mypro.ThreeString(a);
	}
}


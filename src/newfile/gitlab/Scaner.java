package newfile.gitlab;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("student name: ");
		String st=scr.next();
		System.out.println("student age:");
		int age=scr.nextInt();
		System.out.println("student class:");
		int show=scr.nextInt();
		System.out.println("student percent:");
		float percent=scr.nextFloat();
	}

}

package newfile.gitlab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example1 {
	static Map<Integer,Example> penmap=new HashMap<>();
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int multicolor=0;
		do {
			System.out.println(
					"Avilable Operations \n 1. Insert \n 2. Update \n 3. Delete \n 4. Retrive \n 5. Exit. Please Select Your Operation ");
			multicolor = scn.nextInt();
			switch (multicolor) {
			case 1:
				insertEmployee(scn);
				break;
			case 2:
				updateEmployee(scn);
				break;
			case 3:
				deleteEmplyee(scn);
				break;
			case 4:
				retrieveEmplyeeDetails();
				break;
			}

		} while (multicolor != 5);

	}

	public static void retrieveEmplyeeDetails() {
		System.out.println();
	}

	public static void insertEmployee(Scanner scn) {
		Example emp = getExampleDetails(scn, "Insert");
		penmap.put(emp.getPens(), emp);
	}

	public static void updateEmployee(Scanner sc) {
		Example emp = getExampleDetails(scn, "Update");
		penmap.put(emp.getPens(), emp);
	}

	public static void deleteEmplyee(Scanner scn) {
		System.out.println("Enter pens");
		penmap.remove(scn.nextInt());
		}
		
	
	public static Example getExampleDetails(Scanner scn, String operation) {
		Example ex = new Example();

	System.out.println("Enter pens");
	ex.setPens(scn.nextInt());

	System.out.println("Enter name");
	ex.setName(scn.next());

	System.out.println("Enter price");
	ex.setPrice(scn.nextInt());

	System.out.println("Enter serial");
	ex.setSerial(scn.nextLong());


	return ex;










}

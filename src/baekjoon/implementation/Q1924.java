package baekjoon.implementation;

import java.util.Scanner;

public class Q1924 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		int date = scanner.nextInt();
		
		scanner.close();
		
		int gap = date;
		
		switch(month) {
		case 12:
			gap += 30;
		case 11:
			gap += 31;
		case 10:
			gap += 30;
		case 9:
			gap += 31;
		case 8:
			gap += 31;
		case 7:
			gap += 30;
		case 6:
			gap += 31;
		case 5:
			gap += 30;
		case 4:
			gap += 31;
		case 3:
			gap += 28;
		case 2:
			gap += 31;
		default: break;
		}
		
		switch(gap%7) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		
		}
		
		
	}

}

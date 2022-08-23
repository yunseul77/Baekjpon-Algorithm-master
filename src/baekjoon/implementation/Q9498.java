package baekjoon.implementation;

import java.util.Scanner;
//점수에 따라 학점으로 변환
public class Q9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=90 && score<=100) 
			System.out.println("A");
			
		else if(score>=80 && score<90) 
			System.out.println("B");

		else if(score>=70 && score<80) 
			System.out.println("C");

		else if(score>=60 && score<70) 
			System.out.println("D");
		
		else System.out.println("F");
	}

}

package baekjoon.implementation;

import java.util.Scanner;
//정수 N개로 이루어진 수열 A에서 정수 X보다 작은수 출력
public class Q10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numN = sc.nextInt();
		int numX = sc.nextInt();
		int[] arr = new int[numN];
		String result = "";

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < numX) {
				result = result + arr[i] + " ";
			}
		}

		System.out.println(result.substring(0, (result.length()-1)));

		sc.close();
	}
}

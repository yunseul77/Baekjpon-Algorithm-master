package baekjoon.implementation;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i<N; i++) {
			int n =scanner.nextInt();
			if(n<X){
				System.out.printf("%d ", n);
			}
		}
		scanner.close();
	}
}

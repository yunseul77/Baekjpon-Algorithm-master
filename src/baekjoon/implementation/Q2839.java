package baekjoon.implementation;

import java.util.Scanner;
//설탕 봉지 최소 개수 구하기
public class Q2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		if (N % 5 == 0) System.out.println(N / 5);
		else if (N % 5 % 3 == 0) System.out.println(N / 5 + (N % 5) / 3);
		else {
			int i = 1;
			while (i <= N / 5) {
				
				int fivekilo = N / 5 - i;
				
				if ((N - fivekilo * 5) % 3 == 0) {
					System.out.println(fivekilo + (N - fivekilo * 5) / 3);
					return;
				}
				
				i++;
			}
			System.out.println(-1);
		}
	}
}

package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	public static void main(String[] args) {
		int num = getPositiveNumber("사람 수 : ");
		
		int[] height = new int[num];
		getRandom(height, 100, 200);

		int max = maxOf(height);

		System.out.printf("가장 큰 키는 %d cm입니다.", max);
	}

	static int getPositiveNumber(String message) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print(message);
			n = input.nextInt();
			if (n > 0)
				break;
			System.out.println("잘못된 입력입니다.");
		} while (n <= 0);
		return n;
	}

	static int maxOf(int[] n) {
		if (n == null)
			return 0;

		int max = n[0];

		for (int i = 1; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
			}
		}
		return max;
	}

	static void getRandom(int[] table, int min, int max) {
		Random ran = new Random();
		for (int i = 0; i < table.length; i++) {
			table[i] = min + ran.nextInt(max - min);
		}
	}

}

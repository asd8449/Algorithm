package chap02;

import java.util.Scanner;

public class CardConv {

	public static void main(String[] args) {
		int num = getPositiveNumber("양의 숫자 :");
		int a = getPositiveNumber("변환 할 진수 :");
		char[] cardNum = new char[64];
		int numDigit;
		numDigit = cardConv(num, a, cardNum);

		displayResult(cardNum, numDigit);
	}

	static void displayResult(char[] cardNum, int numDigit) {
		for (int i = numDigit - 1; i >= 0; i--) {
			System.out.print(cardNum[i]);
		}
	}

	static int cardConv(int num, int n, char[] cardNum) {
		int numDigit = 0;
		String digitChar = "0123456789ABCDEF";
		while (num > 0) {
			cardNum[numDigit++] = digitChar.charAt(num % n);
			num /= n;
		}
		
		return numDigit;

	}

	static int cardConv2(int num, char[] cardNum) {
		int numDigit = 0;
		String digitChar = "0123456789ABCDEF";
		while (num > 0) {
			cardNum[numDigit++] = digitChar.charAt(num % 2);
			num /= 2;
		}
		return numDigit;

	}

	static int getPositiveNumber(String message) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print(message);
		do {
			num = in.nextInt();

		} while (num < 0);
		return num;
	}
}

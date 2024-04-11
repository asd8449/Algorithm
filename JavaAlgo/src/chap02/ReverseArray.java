package chap02;

import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int numArr[] = new int[num];
		getRandom(numArr, 1, 100);

		displayArray(numArr);
		
		reversArray(numArr, num);
		displayArray(numArr);
		
		

	}

	static void displayArray(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}

	static void reversArray(int[] n, int num) {
		for(int i = 0;i < num;i++) {
			swapArr(n, i, n.length - 1 - i);
			num--;
		}
	}

	static void swapArr(int[] n, int i, int j) {
		int temp = n[i];
		n[i] = n[j];
		n[j] = temp;
		
	}
	
	static void getRandom(int[] table, int min, int max) {
		Random ran = new Random();
		for (int i = 0; i < table.length; i++) {
			table[i] = min + ran.nextInt(max - min);
		}
	}
	
}

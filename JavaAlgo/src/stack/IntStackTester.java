package stack;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntStack intStack = new IntStack(64);

		while (true) {
			System.out.println("=================================================");
			System.out.printf("현재 데이터 개수: %d / %d\n", intStack.size(), intStack.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");
			int menu = in.nextInt();
			if (menu == 0) {
				System.out.println("종료합니다.");
				break;
			}

			int data;

			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				data = in.nextInt();
				if (!intStack.push(data))
					System.out.println("가득 찼습니다.");
				break;

			case 2:
				if (!intStack.empty()) {
					data = intStack.pop();
					System.out.println("팝한 데이터는 " + data + "입니다.");
				} else
					System.out.println("스택이 비어있습니다.");
				break;
			case 3:
				if (!intStack.empty()) {
					data = intStack.top();
					System.out.println("피크한 데이터는 " + data + "입니다.");
				} else
					System.out.println("스택이 비어있습니다.");
				break;
			case 4:
				intStack.dump();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}

		}

	}

}

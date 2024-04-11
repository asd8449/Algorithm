package VPSTester;

import java.util.Scanner;

public class VPSTesterView {

	private CharStack cs = new CharStack(64);
	private                                                                                                                                                                                                                                                                                      char[] pArr;
	
	public void process() {
		input();
		print(check(pArr));
	}
	
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.print("괄호 문자열 : ");
		pArr = in.nextLine().toCharArray();
	}
	
	public void print(boolean isVPS) {
		if (isVPS && !cs.isEmpty())
			isVPS = false;
		String result = isVPS ? "YES" : "NO";
		System.out.println(result);
		
	}

	public boolean check(char[] pArr) {
		for (char p : pArr) {
			if (p == '(' || p == '[' || p == '{')
				cs.push(p);
			else if (p == ')') {
				if (cs.getTop() == '(')
					cs.pop();
			} else if (p == ']') {
				if (cs.getTop() == '[')
					cs.pop();
			} else if (p == '}') {
				if (cs.getTop() == '{')
					cs.pop();
			} else {
				return false;
			}
		}
		return true;
	}
}

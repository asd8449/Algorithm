package chap02;

public class MaxOfArray {

	public static void main(String[] args) {
		int [] numArr = {32, 45, 57, 30, 69};
		
		int max = maxOf(numArr);
		System.out.println("최대값은 " + max + "입니다.");
	}

	static int maxOf(int[] n) {
		if (n == null)
			return 0;
		
		int max = n[0];
		
		for(int i = 1;i < n.length;i++) {
			if(n[i]> max) {
				max = n[i];
			}
		}
		return max;
	}
	
}

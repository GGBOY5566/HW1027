
public class P49 {
	public static void main(String[] args) {
		int [][]num;
		num = new int[2][5];
		num[0][0] = 100;
		num[0][1] = 80;
		num[0][2] = 100;
		num[0][3] = 90;
		num[0][4] = 95;
		num[1][0] = 100;
		num[1][1] = 80;
		num[1][2] = 100;
		num[1][3] = 90;
		num[1][4] = 95;
		for (int i = 0; i<=num[1].length-1; i++) {
			System.out.println("第 "+ (i+1) +" 個人的國文分數 " + num[0][i]);
			System.out.println("第 "+ (i+1) +" 個人的數學分數 " + num[0][i]);
		}
	}
}


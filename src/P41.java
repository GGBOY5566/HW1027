
public class P41 {
	public static void main(String[] args) {
		int []num;
		num = new int[5];
		num[0] = 10;
		num[1] = 40;
		num[2] = 80;
		num[3] = 9;
		num[4] = 5;
		
		num[10] = 100;
		
		for (int i = 0; i<=4; i++) {
			System.out.println("第 "+ (i+1) +" 的分數: " + num[i]);
		}
	}
}

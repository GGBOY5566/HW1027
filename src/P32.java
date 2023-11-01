import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P32 {
	public static void main(String[] args) throws IOException {
		System.out.println("輸入要在第幾次結束迴圈(1~10)");

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br1.readLine());
		for(int i = 1; i<=10; i++) {
			System.out.println("第 " + i +"次迴圈");
			if (i == num)
				break;
		}
	}
}

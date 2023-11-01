import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P21 {
	public static void main(String[] args) throws IOException {
		System.out.println("請問要選哪條路");
		System.out.println("輸入整數");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br1.readLine();
		int res = Integer.parseInt(str);
		char ans = (res == 1)?'A':'B';
		System.out.println("璇則了 " + ans + " 路");
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P19 {
	public static void main(String[] args) throws IOException {
		System.out.println("請問你是男生嘛?");
		System.out.println("請輸入 y or n");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br1.readLine();
		char letter = str.charAt(0);
		if (letter == 'y' || letter == 'Y')
			System.out.println("你是男的");
		else if (letter == 'n' || letter == 'N')
			System.out.println("你是女的");
		else
			System.out.println("請輸入y或n");
	}
}

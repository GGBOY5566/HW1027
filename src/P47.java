import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
public class P47 {
	public static void main(String[] args) throws IOException {
		System.out.println("請輸入5人的分數");
		Integer []a = new Integer[5];

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i<=4; i++) {
			String str = br1.readLine();
			a[i] = Integer.parseInt(str);
		}
		Arrays.sort(a,Collections.reverseOrder());
		
		for(int y= 0; y <a.length ; y ++)
			System.out.println("第 " + (y+1) + " 名的分數是 " + a[y]);

	}
}

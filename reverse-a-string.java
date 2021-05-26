https://www.sololearn.com/learning/eom-project/1068/950

import java.util.Scanner;
 
public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();

		 
		int l = arr.length;
		char[] res = new char[l];
		String chn = "";
		for (int i = l - 1; i >= 0; i--) {
			int resI = (l - 1) - i;
			//System.out.println("i=" + i);
			// your code goes here
			String s = Character.toString(arr[i]);
			//System.out.println("char=" + arr[i]);

			// System.out.println("s=" + s);
			chn = chn + s;
			// res[resI]=arr[i];
			// chn[resI]=arr[i];
			//System.out.println("OK");
		}
		System.out.println(chn);
		//System.out.println("fin");
	}
}

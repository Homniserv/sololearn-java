https://www.sololearn.com/learning/eom-project/1068/950

import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();

		int l =arr.length();
		char[] res=char[l];
		for(int i=l-1;i<=0;i--){
			int resI=(l-1)-i;
			//your code goes here
			res[resI]=arr[i];
        }
		System.out.println(res);
	}
}

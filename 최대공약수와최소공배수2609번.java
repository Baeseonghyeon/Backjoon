package 백준;

import java.util.*;
public class 최대공약수와최소공배수2609번 {
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(gcd(a,b));
		System.out.println(a*b/gcd(a,b));

	}

}

package seleniumpkg;
import java.util.Scanner;

public class VowelsPresent {

	public static void main(String[] args) {
		
		int n = 5;
		check(n);
	
	}
	public static void check(int n) {
		
		int i,j;
		for(i=0;i<n;i++)
		{
//			for (j = 2*(n-i);j>=0;j--) {
//				System.out.println(" ");
//			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	}



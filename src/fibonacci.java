import java.util.Scanner;
import java.util.ArrayList;
public class fibonacci {
	public static void main(String[] args) {
		int n;
		Scanner keyboard = new Scanner(System.in);
		ArrayList fibonacci = new ArrayList();
		do {
			fibonacci.add(1);
			fibonacci.add(1);
			System.out.println("Find fibonacci squence upto: ");
			n = keyboard.nextInt();
			for(int i=2;i<n;i++) {
				int result = (int)fibonacci.get(i-2) + (int)fibonacci.get(i-1);
				fibonacci.add(result);
			}
			if(n!=0) {
			for(int i=0;i<n;i++) {
				System.out.print( fibonacci.get(i)+" ");
			}
			System.out.println();
			}
			fibonacci.clear();
		}while(n!=0);
		
	}
}

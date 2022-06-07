package week06;

import java.util.Scanner;

public class ArraySimple1 {
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			B[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		//Solve + Output
		//Get data for array C
		int[] C = new int[n];
		for (int i = 0; i < n; i++) {
			C[i] = A[i] + 2*B[i];
		}
		
		//Print array C 
		//Way 1
//		String ans = "C = [";
//		for (int i = 0; i < n; i++) {
//			ans += C[i] + ",";
//		}
//		
//		ans = ans.substring(0,ans.length() - 1);	//Example: ans = "C = [1,2,3,4," ===> ans = "C = [1,2,3,4"
//		ans += "]";									//Example: ans = "C = [1,2,3,4" ===> ans = "C = [1,2,3,4]
//		System.out.println(ans);
		
		//Way 2
		System.out.print("C = [");
		for(int i = 0; i < n - 1; i++) {
			System.out.print(C[i] + ",");
		}
		System.out.println(C[n - 1] + "]");
		
		//Print primes
		String ans2 = "";
		for (int i = 0; i < n; i++) {
			if (isPrime(C[i])) {
				ans2 += C[i] + " ";
			}
		}
		ans2 = ans2.trim();
		System.out.println(ans2);
	}
}

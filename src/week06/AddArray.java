package week06; 

import java.util.Scanner;

public class AddArray {	
	public static int[] add(int[] A, int[] B) {
		int[] C = new int[A.length];
		for (int i = 0; i < C.length; i++) { 
			C[i] = A[i] + B[i];
		}
		return C;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		sc.close();
		
		int[] C = new int[n];
		C = add(A, B);
		
		String ans = "";
		for (int i = 0; i < n; i++) {
			ans = ans + C[i] + " ";
		}
		
		System.out.print(ans.trim());
	}
}

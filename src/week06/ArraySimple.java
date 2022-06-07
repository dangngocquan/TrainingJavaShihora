package week06;

import java.util.Scanner;

public class ArraySimple {
	public static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		
		if(num == 2) {
			return true;
		}
		
		for(int i = 2; i < Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[100];
		int[] B = new int[100];
		int[] C = new int[100];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			C[i] = A[i] + 2*B[i];
		}
		sc.close();
		
		System.out.print("C = [");
		for(int i = 0; i < n -1; i++) {
			System.out.print(C[i] + ",");
		}
		
		System.out.println(C[n - 1] + "]");
		for(int i = 0; i < n; i++) {
			if(isPrime(C[i])) {
				System.out.print(C[i] + " ");
			}
		}
	}
}

package week06;

import java.util.Scanner;

public class PrimesInArray {
	//Ktra 1 số có phải số nguyên tố hay ko
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}	
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner giúp mk lấy công cụ số nhập vào
		int n = sc.nextInt(); // tạo 1 biến n, lấy giá trị đầu vào bằng số nguyên tiếp theo được nhập
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		
		String ans = ""; // tạo biến ans có kiểu dữ liệu là chuỗi
		for (int i = 0; i < n; i++) {
			if(isPrime(A[i])) {
				ans += A[i] + " ";
			}
		// cả vòng for kiểm tra lần lượt các phần tưt của mảng A. Nếu phần tử nào là số nguyên tố thì nói chuối với ans
		}
		
		ans = ans.trim();
		System.out.print(ans); //trim : in ra bỏ khoảng trống đầu và cuối
	}
}

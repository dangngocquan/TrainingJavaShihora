package week06;

import java.util.Scanner;

public class FindMinMax{
    
    public static int findMin(int Array[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < Array.length; i++) {
        	min = Math.min(min, Array[i]);
        }
        return min;
    }
    
    public static int findMax(int Array[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {   // mảng ko trống thì i chạy từ 0;
        	max = Math.max(max, Array[i]);  //Array[i] : lấy phần tử có chỉ số(index) i
        }
        return max;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n là số lượng phần tử nhập vào
        int[] array = new int[n]; //tạo mảng ms có n phần tử
        for (int i = 0; i < n; i++) {
        	array[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.println(findMin(array) + " " + findMax(array));
    }
    
}

//int[] array = new int[5];
//int array[] = new int[5];
//int[] array = {1, 2, 3};
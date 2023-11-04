package test;

import java.util.Scanner;

public class HWB1 {
//	public static void main(String[] args) {
//	System.out.println("hello");
//
////	Scanner sc = new Scanner(System.in);
////	int n = sc.nextInt();
////	int[] arr = new int[n];
////	System.out.println("Nhap so phan tu co trong mang:");
////	int tong = 0;
////	for(int i=0; i<n; i++) {
////		System.out.println("Nhap phan tu thu " +(i+1)+ " :");
////		arr[i] = sc.nextInt();
////		tong += tong + arr[i];
////
////	}
////	System.out.println("Tong cac gia tri cua mang la:" +tong);
////	sc.close();
//}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // khai báo mảng
        int sum = 0;

        // nhập số lượng phần tử của mảng
        System.out.println("Nhập số lượng phần tử của mảng:");

        // khởi tạo mảng với số lượng phần tử nhập vào
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Tổng giá trị của mảng là: " + sum);

        sc.close();
    }
}

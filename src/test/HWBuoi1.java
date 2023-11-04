package test;

import java.util.Scanner;

public class HWBuoi1 {
	public static void main(String[] args) {
		
		System.out.println("Nhap so phan tu co trong mang:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int tong = 0;
		for(int i=0; i<n; i++) {
			System.out.println("Nhap phan tu thu " +(i+1)+ " :");
			arr[i] = sc.nextInt();
			//tong += arr[i];
		}
		for(int i=0; i<n; i++) {
			System.out.print("Dãy số đã nhập:");
			System.out.print(arr[i]  +  "; " );

		}
	//System.out.println("Tong cac gia tri cua mang la: " +tong);

	sc.close();
	}
}

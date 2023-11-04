package test;

import java.io.*;
import java.util.Scanner;   
public class test  
{   
	public static void main(String[] args) {
	
		System.out.println("Nhap so phan tu co trong mang:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int tong = 0;
		for(int i=0; i<n; i++) {
			System.out.println("Nhap phan tu thu " +(i+1)+ " :");
			arr[i] = sc.nextInt();
			tong += tong + arr[i];

		}
	System.out.println("Tong cac gia tri cua mang la:" +tong);
	sc.close();
	}
 
}
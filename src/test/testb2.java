package test;

import java.util.Scanner;

public class testb2 {
	public static void main(String[] args) {
	// in ra số lớn hơn
//		System.out.println("Nhap so x:");
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		System.out.println("Nhap so y:");
//		int y = sc.nextInt();
//		if (x < y ) {
//			System.out.println("So lon hơn la: " + y + "");
//
//		}else {
//			System.out.println("So lon hơn la: " + x + "");
//
//		}
		//chanle
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mot so nguyen bat ky: ");
		int n = sc.nextInt();
		System.out.println("So "+n+" la: " + ((n%2==0) ? "so chan" : "so le"));

	}
}

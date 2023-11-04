package day5_overloading;

import java.util.Scanner;

public class BacSi_app {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Adder add = new Adder();
//		//add.add(1, 2);
//		System.out.println("Kết quả là: " +add.add(1, 2));
//		//add.add(1.5, 2.5);
		int loai;
		TinhLuong tl = new TinhLuong();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập loại bác sĩ, loại 1 là chuyên khoa, loại 2 là đa khoa:");
		loai = sc.nextInt();
		System.out.println("Lương của bác sĩ là: "  +tl.tinhluong(5000000, 1, 2, loai));

		
	}

}



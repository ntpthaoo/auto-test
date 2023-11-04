package Day5_BTVN;

import java.util.Scanner;

public class QuanLy {
	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số nhân viên trong công ty: ");
	        int soNhanVien = scanner.nextInt();
	        NhanVien[] nhanVien = new NhanVien[soNhanVien];
	        
	        System.out.println("Nhập thông tin cho nhân viên");
	        for (int i = 0; i < soNhanVien; i++) {
	            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
	            System.out.print("Chọn loại nhân viên \n 1 - lập trình viên\n 2 - Tester\n 3 - BA ");
	            int choose = scanner.nextInt();
	             
	            if (choose == 1) {
	                nhanVien[i] = new Developer();
	            } else if (choose == 2) {
	                nhanVien[i] = new Tester();
	            }
	             
	            nhanVien[i].nhap();

	        }
	         
	        System.out.println("THÔNG TIN NHÂN VIÊN: ");
	        for (int i = 0; i < soNhanVien; i++) {
	            nhanVien[i].print();
	        }
	}
}

package Day5_BTVN;

import java.util.Scanner;

public class BA extends NhanVien {
	private String DuAn;


	public String getDuAn() {
		return DuAn;
	}


	public void setDuAn(String duAn) {
		DuAn = duAn;
	}


	public void nhap() {
		super.nhap();
		System.out.print("Dự án tham gia:");
		Scanner sc = new Scanner(System.in);
		DuAn = sc.nextLine();
	}
}

package Day5_BTVN;

import java.util.Scanner;

public class Tester extends NhanVien {
	private int soBugTimDc;

	public int getSoBugTimDc() {
		return soBugTimDc;
	}

	public void setSoBugTimDc(int soBugTimDc) {
		this.soBugTimDc = soBugTimDc;
	}
	public void nhap() {
		super.nhap();
		System.out.print("Số bug tìm được:");
		Scanner sc = new Scanner(System.in);
		soBugTimDc = sc.nextInt();
	}
}

package Day5_BTVN;

import java.util.Scanner;

public class Developer extends NhanVien{
	private String ngonngu;

	public String getNgonngu() {
		return ngonngu;
	}

	public void setNgonngu(String ngonngu) {
		this.ngonngu = ngonngu;
	}
	public void nhap() {
		super.nhap();
		System.out.print("Nhập ngôn ngữ lập trình:");
		Scanner sc = new Scanner(System.in);
		ngonngu = sc.nextLine();
	}
}

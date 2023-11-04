package Day5_BTVN;

import java.util.Scanner;

public class NhanVien {
	private String MaNV;
	private String hoTen;
	private String SDT;
	private String mail;
	
	Scanner scanner = new Scanner(System.in);
	
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public void nhap() {
		System.out.print("Nhập mã nhân viên:");
		MaNV = scanner.nextLine();
		System.out.print("Nhập họ và tên:");
		hoTen = scanner.nextLine();
		System.out.print("Nhập số điện thoại:");
		SDT = scanner.nextLine();
		System.out.print("Nhập mail:");
		mail = scanner.nextLine();
	}
	public void print() {
		System.out.println("-------------");
		System.out.println("Mã nhân viên:" +MaNV);
		System.out.println("Họ và tên:" +hoTen);
		System.out.println("Số điện thoại:" +SDT);
		System.out.println("Email:" +mail);
		System.out.println("-------------");
		


	}
	
}

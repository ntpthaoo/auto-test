package Day5_inheritance;

public class SinhVien extends Nguoi {
	public String maSinhVien;
	@Override
	public void dichoi() {
		// TODO Auto-generated method stub
		System.out.println("Sinh viên " +getName()+"," +getSdt()+ "," +maSinhVien + "đi chơi sau khi học xong");
	}
	public void dihoc() {
		System.out.println("Sinh viên đi học 6 buổi một tuần");
	}
}

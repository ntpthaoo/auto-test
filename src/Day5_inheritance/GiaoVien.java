package Day5_inheritance;

public class GiaoVien extends Nguoi {
	public String ChuNhiemLop;
	
	@Override
	public void dichoi() {
		// TODO Auto-generated method stub
		System.out.println("Giao viên " +getName()+ "," +getSdt()+ "," +ChuNhiemLop + " đi chơi sau khi dạy xong");

	}
	public void dilam() {
		System.out.println("Giao viên lớp " +ChuNhiemLop+ " đi làm 6 buổi một tuần");
	}

}

package Day5_inheritance;

public class Application  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien();
		sv.maSinhVien="001";
		sv.setName("T");
		sv.dichoi();
		sv.dihoc();

		GiaoVien gv = new GiaoVien();
		gv.setName("T");
		gv.ChuNhiemLop="4C";
		gv.dichoi();
		gv.dilam();

		
		System.out.println();
	}
	

}

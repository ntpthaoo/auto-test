package day5_overloading;

public class HInhChuNhat extends HinhHoc{
	public int chieuDai;
	public int chieuRong;
	@Override
	public void Dientich() {
		// TODO Auto-generated method stub
		int Dientich = chieuDai * chieuRong ;
		System.out.println("Diện tích hình chữ nhật: " +Dientich);

	}
	
}

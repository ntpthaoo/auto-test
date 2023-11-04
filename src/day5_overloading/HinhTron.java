package day5_overloading;

public class HinhTron extends HinhHoc {
	public int bankinh;

	@Override
	public void Dientich() {
		// TODO Auto-generated method stub
		double Dientich = bankinh * bankinh * 3.14;
		System.out.println("Diện tích hình tròn: " +Dientich);
	}

	

}

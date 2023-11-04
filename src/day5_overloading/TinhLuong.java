package day5_overloading;

public class TinhLuong {
	public double tinhluong(int luong,float hesoluong ) {
		return luong * hesoluong;
	}
	public double tinhluong(int luong,int sonamkn, float hesoluong ) {
		return luong * sonamkn * hesoluong;
	}
	public double tinhluong(int luong,int sonamkn, float hesoluong, int loai ) {
		if(loai==1)
			return luong + luong * sonamkn * hesoluong *0.2;
		if(loai==2)
			return luong + luong * sonamkn * hesoluong *0.45;
		else
		return luong;
	}
}

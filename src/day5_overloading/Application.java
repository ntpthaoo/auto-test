package day5_overloading;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Adder add = new Adder();
//		//add.add(1, 2);
//		System.out.println("Kết quả là: " +add.add(1, 2));
//		//add.add(1.5, 2.5);
		HinhTron c = new HinhTron();
		c.bankinh=4;
		c.Dientich();
		HInhChuNhat cn = new HInhChuNhat();
		cn.chieuDai=4;
		cn.chieuRong=5;
		cn.Dientich();
		
	}

}

interface iAaa {
	public void show();
}
class Cbbb {
	public int num=10;
	public void set(int n) {
		num=n;
	}
}
class Cccc extends Cbbb implements iAaa { //8 create extended and implemented class 
	public void show() {
		System.out.println("num="+num); //8 show "num=5"
	}
}
public class Class08 {
	public static void main(String args[]) {
		Cccc cc = new Cccc();
		cc.set(5);
		cc.show();
	}
}
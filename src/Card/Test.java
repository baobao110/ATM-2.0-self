package Card;

public class Test {
	private static final Model a=new Service(4050);
	public static void main(String[] args) {
		//add(2090,"232333");
		delete(4050);
		//Modify(4050, "343434",300);
		//Check(4050,"343434");
		//add (300,"343434");
		//Modify(4002,"passss",66);
	}
	public static void add(double money,String password) {
		a.add(money, password);
	}
	public static void delete(int number) {
		a.delete(number);
	}
	public static  void Modify(int number,String password,double money) {
		a.Modify(number, password, money);
	};
	public static void Check(int number,String password) {
		a.Check(number, password);
	}
}

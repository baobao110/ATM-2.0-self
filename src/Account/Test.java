package Account;

public class Test {
	private static final Model a=new Service(4060);
	public static void main(String[] args) {
		//Check();
		add(23,"转出",4067);
		//Check();
	}
	public static void add(double money,String type,int resource) {
		a.add(money, type, resource);
	}
	public static void Check() {
		a.Check();
	}
}

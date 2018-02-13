package Card;

public interface Model {
	 void add(double money,String password);
	 void Modify(int number,String password,double money);
	 void delete(int number);
	 void Check(int number,String password);
}

package Card;
import Account.Test;
import java.util.ArrayList;

public class Service implements Model{
	private static int currentNumber;
	private static final Account.Test account=new Account.Test();
	private static final CardDAO card=new CardDAO();
	public Service(int currentNumber) {
		this.currentNumber=currentNumber;
	}
	public void add(double money,String password) {
		if(null==password||"".equals(password)) {
			System.out.println("密码为空重新填写");
			return;
		}
		if(password.length()!=6) {
			System.out.println("密码长度为6位重新填写");
			return;
		}
		
		Card a=null;
		try {
			a = card.Check(currentNumber);
			if(null!=a) {
				System.out.println("卡号已经存在");
				return;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a=new Card();
		a.setNumber(currentNumber);
		a.setMoney(money);
		a.setPassword(password);
		int x=card.add(a);
		if(x!=1) {
			System.out.println("注册失败");
		}
		else {
			System.out.println("注册成功");
		}
	}
	public void Modify(int number,String password,double money) {
		if(null==password||"".equals(password)) {
			System.out.println("密码为空重新填写");
			return;
		}
		if(password.length()!=6) {
			System.out.println("密码长度为6位重新填写");
			return;
		}
		if(number<1000||number>10000) {
			System.out.println("卡号不符合要求重新填写");
			return;
		}
		Card b=card.Check(number); 
		if(b==null) {
			System.out.println("修改失败");
		}
		else {
			System.out.println("完成修改");
			String type="转出";
			account.add(money, type, number);
		}
	}
	public void delete(int number) {//删除部分思路同上面一样
		Card a;
		try {
			a= card.Check(number);
			if(a==null) {
				System.out.println("数据不存在");
			}
			if(currentNumber!=a.getNumber()) {
				System.out.println("非所属用户");
				return;
			}
			int x=card.delete(number);
			if(x!=1) {
				System.out.println("用户删除失败");
			}
			else {
				System.out.println("删除成功");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
	public void Check(int number,String password) {
		Card a=null;
		try {
			a= card.Check(number);
			if(a==null) {
				System.out.println("数据不存在");
			}
			if(currentNumber!=a.getNumber()) {
				System.out.println("非所属用户");
				return;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(password.equals(a.getPassword())){
			System.out.println(card.Check(currentNumber));
		}
		else {
			System.out.println("密码输入错误");
		}
	}
}

package Account;

import Card.Card;
import Card.CardDAO;

public class Service implements Model{
	private static int currentNumber;
	private static final CardDAO card=new CardDAO();
	private static final AccountDAO account=new AccountDAO();
	public Service(int currentNumber) {
		this.currentNumber=currentNumber;
	}
	public void add(double money,String type,int resource)
	{
		if(!("转出".equals(type))) {
			System.out.println("非法操作");
			return;
		}
		Card a=null;
		try {
			a = card.Check(resource);
			if(null==a) {
				System.out.println("账户不存在");
				return;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Card c=null;
		Account b=new Account();
		b.setNumber(currentNumber);
		b.setMoney(money);
		b.setType(type);
		b.setResource(resource);
		account.add(b);
		c=card.Check(currentNumber);
		/*a.setMoney(a.getMoney()+money);
		c.setMoney(c.getMoney()-money);*/
		int x=card.update(a, money);
		int y=card.update(c, -money);
		if(x!=1||y!=1) {
			System.out.println("转账失败");
		}
		else {
			System.out.println("转账成功");
		}
	}
	public void Check() {
		Account a=null;
		try {
			a= account.Check(currentNumber);
			if(a==null) {
				System.out.println("无交易信息");
			}
			else {
				System.out.println(a);
				}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		}
   }

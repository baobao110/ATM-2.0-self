package Account;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import Card.Card;
import Card.DATA;

public class AccountDAO {
	public int add(Account account) {
		String sql="insert account (number,money,type,createtime,resource)values("+account.getNumber()+","+account.getMoney()+",'"+account.getType()+"',NOW(),'"+account.getResource()+"');";
		int a=0;
		try {
			 a=DATA.update(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	public Account Check(int number) {
		String sql="select * from account where number="+number+";";
		ResultSet a=null;
		Account b=null;
		try {
			a=DATA.execute(sql);
			while(a.next()) {
				int id=a.getInt("id");
				int num=a.getInt("number");
				double money=a.getDouble("money");
				String type=a.getString("type");
				Date createtime=a.getDate("createtime");
				int resource=a.getInt("resource");
				b=new Account();
				b.setId(id);
				b.setNumber(num);
				b.setMoney(money);
				b.setType(type);
				b.setCreatetime(createtime);
				b.setResource(resource);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}

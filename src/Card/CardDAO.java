package Card;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class CardDAO {
	
	public int add(Card card) {
		String sql="insert card (number,money,createtime,modifytime,password)values("+card.getNumber()+","+card.getMoney()+",NOW(),NOW(),'"+card.getPassword()+"');";
		int a=0;
		try {
			 a=DATA.update(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	public int delete(int number) {
		String sql="delete from card where number="+number+";";
		int a=0;
		try {
			 a=DATA.update(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	public int update(Card card,double money) {
		String sql="update card set password='"+card.getPassword()+"',money="+(card.getMoney()+money)+",modifytime=NOW() where id="+card.getId()+";";
		int a=0;
		try {
			 a= DATA.update(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	public Card Check(int number) {
		String sql="select * from card where number="+number+";";
		ResultSet a=null;
		Card b=null;
		try {
			a=DATA.execute(sql);
			while(a.next()) {
				int id=a.getInt("id");
				int num=a.getInt("number");
				double money=a.getDouble("money");
				Date createtime=a.getDate("createtime");
				Date modifytime=a.getDate("modifytime");
				String password=a.getString("password");
				b=new Card();
				b.setId(id);
				b.setNumber(num);
				b.setMoney(money);
				b.setCreatetime(createtime);
				b.setModifytime(modifytime);
				b.setPassword(password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}

package Account;

import java.util.Date;

public class Account {
	private int id;
	private int number;
	private double money;
	private String type;
	private Date createtime;
	private int resource;
	
	
	public int getResource() {
		return resource;
	}
	public void setResource(int resource) {
		this.resource = resource;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", number=" + number + ", money=" + money + ", type=" + type + ", createtime="
				+ createtime + ", resource=" + resource + "]";
	}
	
}

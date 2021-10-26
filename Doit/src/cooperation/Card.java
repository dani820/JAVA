package cooperation;

public class Card {
	private static int serialNum = 10000;
	String cusName;
	int cardNum;
	
	public Card() {
		serialNum++;
		this.cardNum = serialNum;
	}
	
	public String getCusName() {
		return cusName;
	}
	
	public void setCusName(String name) {
		this.cusName = name;
	}
	
	public int getSerailNum() {
		return serialNum;
	}
	
	public void setSerialNum(int serialNum) { 
		this.serialNum = serialNum;
	}
	 
}

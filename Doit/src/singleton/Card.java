package singleton;

public class Card {
	private static int serialNum = 10000;
	private int cardNum;
	private String cusName;
	
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
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
}

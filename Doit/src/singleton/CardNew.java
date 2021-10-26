package singleton;

public class CardNew {
	public static void main(String[] args) {
		CardFactory factory = CardFactory.getInstance();
		
		Card myCard = new Card();
		Card yourCard = new Card();
		
		System.out.println(myCard.getCardNum());
		System.out.println(yourCard.getCardNum());
		
	}
}

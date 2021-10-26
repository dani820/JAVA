package singleton;

public class CardFactory {
	private CardFactory() {}
	private static CardFactory instance = new CardFactory();
	
	public static CardFactory getInstance() {
		if(instance == null) {
			instance = new CardFactory();
		}
		return instance;
	}
	
	public Card creatdCard() {
		Card card = new Card();
		return card;
	}
	
}

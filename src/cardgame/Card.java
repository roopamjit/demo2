package cardgame;

public class Card {

	private Suit suit;
	private Value value;

	public Suit getSuit() {
		return this.suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Value getValue() {
		return this.value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	/**
	 * public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
	 */
	public Card() {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param value
	 * @param suit
	 */
	public Card(Value value, Suit suit) {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

}
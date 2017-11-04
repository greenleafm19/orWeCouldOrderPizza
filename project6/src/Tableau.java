import java.util.*;

/**
 * Represents a tableau for the game of free cell.
 * 
 * @author nasona
 * @author lefkowitza
 * @author delosreyesa
 * @author greenleafm
 * @version 1.0
 */
public class Tableau extends AbstractCell implements TableauInterface{
	
	
	private List<Card> tableau;
	public Tableau() {
		tableau = new LinkedList<Card>();
		
	}
	
	public void addToCell(){
		if(tableau.isEmpty()) {
			if (movePile.size() == 1)
				tableau.add(movePile.remove(0));
			else {
				for (Card card : movePile) 
					tableau.add(card);
				movePile.clear();
			}
		}
		else if (tableau.get(tableau.size() -1).compareTo(movePile.get(0)) == 1 &&
				compareColors(tableau.get(tableau.size() -1), movePile.get(0)) == true) {
			if(movePile.size() == 1)
				tableau.add(movePile.remove(0));
			else
				for (Card card : movePile) 
					tableau.add(card); 
				movePile.clear();
		}
		
		else
			System.out.println("ILLEGAL MOVE in addToCelltableau, DUMMY!");
	}
	
	public List<Card> removeFromCell(int position) {
		
		if (tableau.isEmpty()) {
			System.out.println("ILLEGAL MOVE in removeFromCelltableau1, DUMMY!");
		}
		
		//Make sure the cards are in alternating colors and descending rank
		else if (position != tableau.size() - 1){
			int tempPosition = position;
			while (tempPosition < tableau.size() - 1) {
				Card card1 = tableau.get(tempPosition);
				Card card2 = tableau.get(tempPosition + 1);
				if (card1.getRank() - card2.getRank() == 1) {
					if (compareColors(card1, card2) == true)
						tempPosition++;
					else
						System.out.println("ILLEGAL MOVE in removeFromCelltableau2, DUMMY!");
				}
			}
			
			while (position < tableau.size()) {
				movePile.add(tableau.remove(position));
			}
		}
		
		else if (position == tableau.size() - 1) {
			movePile.add(tableau.remove(position));
		}
			
		else
			System.out.println("ILLEGAL MOVE in removeFromCelltableau3, DUMMY!"); //print out error message
		return movePile;
	}
	
	public boolean compareColors(Card card1, Card card2){
		//checks to see if card1 and card2 are the same suit
		Suit card1Suit = card1.getSuit();
		Suit card2Suit = card2.getSuit();

		//card 1 spades: check to see if card 2 is red
		if ((card1Suit.toString().compareTo("spades") == 0 &&
				(card1Suit.compareTo(card2Suit) == 1 ||
				card1Suit.compareTo(card2Suit) == 2)))
			return true;
		
		//card 1 clubs: check to see if card 2 is red
		else if ((card1Suit.toString().compareTo("clubs") == 0 && 
				(card1Suit.compareTo(card2Suit) == -1 ||
					card1Suit.compareTo(card2Suit) == -2)))
			return true;
		
		//card 1 hearts: check to see if card 2 is black
		else if ((card1Suit.toString().compareTo("diamonds") == 0 && 
				(card1Suit.compareTo(card2Suit) == 1 ||
					card1Suit.compareTo(card2Suit) == -2)))
			return true;
		
		//card 1 diamonds: check to see if card 2 is black
		else if ((card1Suit.toString().compareTo("hearts") == 0 && 
				(card1Suit.compareTo(card2Suit) == -1 ||
					card1Suit.compareTo(card2Suit) == 2)))
			return true;
		
		
		else 
			return false;	
	}

	public boolean dealAdd(Card card) {
		tableau.add(card);
		return true;
	}
	
	public String toString() {
		String cards = "";
		for (Card card : tableau) {
			cards += card.toString() + "\n";
		}
		return cards + "\n";
	}
	
}
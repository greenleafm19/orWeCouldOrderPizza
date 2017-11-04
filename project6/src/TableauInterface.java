import java.util.*;

/**
 * Represents an interface for a tableau for the game of free cell.
 * 
 * @author nasona
 * @author lefkowitza
 * @author delosreyesa
 * @author greenleafm
 * @version 1.0
 */
public interface TableauInterface{
	
	/**
	 * Adds a card to the tableau.
	 * Prints error if the rules of the game are not followed. 
	 * Precondition: top tableau card and bottom movePile card must be
	 * alternating colors and descending rank.
	 */
	public void addToCell();
	
	/** Removes a card from the tableau and prints error 
	 * if the tableau is empty.
	 * Precondition: tableau has at least one card
	 * @param position = the position of the card in the tableau
	 */
	public List<Card> removeFromCell(int position);
	
	/**
	 * Compares the colors of card1 and card2 to see if they're opposite
	 * @param card1 = card at bottom of tableau
	 * @param card2 = card at top of movePile
	 * @return true if cards are opposite colors, false otherwise
	 */
	public boolean compareColors(Card card1, Card card2);
	
	/**
	 * Adds cards when initially dealing cards in the game
	 * @param card = card being dealt to the tableau
	 * @return true
	 */
	public boolean dealAdd(Card card);
	
	/** Returns a string of the card in the free cell.
	 * @return a string representation of free cell.
	 */
	public String toString();
}


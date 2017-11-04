import java.util.LinkedList;
import java.util.List;

/**
 * Represents an interface of the home cell.
 * 
 * @author nasona
 * @author lefkowitza
 * @author delosreyesa
 * @author greenleafm
 * @version 1.0
 */

public interface HomeCellInterface{
	
	/**
	 * Adds a card to the home cell and prints error if a card 
	 * of the same suit greater than one is placed on top or 
	 * if it is not the same suit.
	 * Precondition: there is only one card in the movePile
	 */
	public void addToCell();
	
	/**
	 * Prints error because you CANNOT take cards from home cell
	 * @param position = the position of the card
	 * @return empty list
	 */
	public List<Card> removeFromCell(int position);
	
	/**
	 * Returns a string of the card in the home cell.
	 * @return a string representation of home cell.
	 */
	public String toString();
}
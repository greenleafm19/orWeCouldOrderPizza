import java.util.ArrayList;
import java.util.List;

/**
 * Represents the interface of the free cell.
 * 
 * @author nasona
 * @author lefkowitza
 * @author delosreyesa
 * @author greenleafm
 * @version 1.0
 */

public interface FreeCellInterface{
	
	/** Adds a card to the free cell and prints error
	 *  if there is already a card in the free cell.
	 *  Precondition: movePile must have only one card
	 */
	public void addToCell();
	
	/** Removes a card from the free cell and prints error 
	 * if the free cell is empty.
	 * Precondition: movePile has one card
	 * @param position = the position of the card in the free cell
	 */
	public List<Card> removeFromCell(int position);
	
	/** Returns a string of the card in the free cell.
	 * @return a string representation of free cell.
	 */
	public String toString();
}
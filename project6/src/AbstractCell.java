import java.util.*;

/**
 * Abstract class for FreeCell, HomeCell, and Tableau.
 * 
 * @author nasona
 * @author lefkowitza
 * @author delosreyesa
 * @author greenleafm
 * @version 1.0
 */

abstract public class AbstractCell{
	
	protected static List<Card> movePile; 
	
	//Create a list to keep track of the "floater" cards (between adds/removes)
	public AbstractCell() {
		movePile = new LinkedList<Card>(); 
	}
	
	
	
	/**
	 * Adds cards to the cell and prints error if move 
	 * does not follow the rules of the game.
	 * Precondition: movePile is not empty
	 */
	abstract public void addToCell();
	
	/**
	 * Adds cards to the cell.
	 * precondition: cell must not be empty
	 * @param position = the position of the card
	 */
	abstract public List<Card> removeFromCell(int position);
	/**
	 * Returns the movePile list for purposes of testing in a terminal setting.
	 * @return movePile for testing purposes
	 */
	public String returnMovePile() {
		return movePile.toString(); 
	}
}
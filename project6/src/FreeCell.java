import java.util.*;

/**
 * Represents a free cell for the game of free cell.
 * 
 * @author nasona
 * @author lefkowitza
 * @author delosreyesa
 * @author greenleafm
 * @version 1.0
 */
public class FreeCell extends AbstractCell implements FreeCellInterface{
	
	private List<Card> freecell;
	
	public FreeCell() {
		freecell = new ArrayList<Card>(1);
	}
	
	public void addToCell() {
		if (freecell.isEmpty() && movePile.size() == 1) {
			freecell.add(movePile.remove(0));
		}
		else
			System.out.println("ILLEGAL MOVE in addToCellfree, DUMMY!");
	}
	
	public List<Card> removeFromCell(int position) {
		if (freecell.isEmpty()) {
			System.out.println("ILLEGAL MOVE in removeFromCellfree, DUMMY!");
			return movePile;
		}
		else {
			movePile.add(freecell.remove(0));
			return movePile;
		}
	}
	
	public String toString() {
		if (freecell.isEmpty())
			return "";
		return freecell.get(0).toString();
	}
}
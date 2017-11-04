import java.util.*;

/**
 * Represents a home cell for the game of free cell.
 * 
 * @author nasona
 * @author lefkowitza
 * @author delosreyesa
 * @author greenleafm
 * @version 1.0
 */
public class HomeCell extends AbstractCell implements HomeCellInterface{
	
	private List<Card> homecell;
	
	public HomeCell() {
		homecell = new LinkedList<Card>();
	}
	
	public void addToCell() {
		Card card = movePile.get(0);
		if (homecell.isEmpty()) {
			if(card.getRank() == 1 && movePile.size() == 1) {
				homecell.add(movePile.remove(0));
			}
			else
				System.out.println("ILLEGAL MOVE in addToCellhome1, DUMMY!");
		}
		
		else {
			if(card.getRank() - homecell.get(homecell.size() - 1).getRank() == 1 && 
				homecell.get(homecell.size() - 1).getSuit().compareTo(card.getSuit()) == 0
				&& movePile.size() == 1) {
				homecell.add(movePile.remove(0));
			}
			else
				System.out.println("ILLEGAL MOVE in addToCellhome2, DUMMY!");
		}
	}
	
	public List<Card> removeFromCell(int position) {
		System.out.println("ILLEGAL MOVE, DUMMY!");
		List<Card> noRemove = new ArrayList();
		return noRemove;
	}
	
	public String toString() {
		String cards = "";
		for (Card card : homecell) {
			cards += card.toString() + "\n";
		}
		return cards + "\n";
	}
}
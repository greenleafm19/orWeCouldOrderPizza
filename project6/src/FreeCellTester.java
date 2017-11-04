import java.util.*;

/**
 * Terminal tester for FreeCell, HomeCell, and Tableau.
 * CHANGE EXCEPTIONS TO ERRORS?
 * 
 * @author nasona
 * @author lefkowitza
 * @author delosreyesa
 * @author greenleafm
 * @version 1.0
 */

public class FreeCellTester
{
	private static Deck deck;
	
	public static void main(String[] args)
	{
		System.out.println("LET THE GAMES BEGIN!!!!!");
		//make four FreeCells
		FreeCell fc1 = new FreeCell();
		FreeCell fc2 = new FreeCell();
		FreeCell fc3 = new FreeCell();
		FreeCell fc4 = new FreeCell();
		
		//make four HomeCells
		HomeCell hc1 = new HomeCell();
		HomeCell hc2 = new HomeCell();
		HomeCell hc3 = new HomeCell();
		HomeCell hc4 = new HomeCell();
		
		//make eight Tableaus
		Tableau t1 = new Tableau();
		Tableau t2 = new Tableau();
		Tableau t3 = new Tableau();
		Tableau t4 = new Tableau();
		Tableau t5 = new Tableau();
		Tableau t6 = new Tableau();
		Tableau t7 = new Tableau();
		Tableau t8 = new Tableau(); 
		
		//create a deck' shuffle to tableaus (to make sure deal will work in game)
		FreeCellTester.deck = new Deck();
		deck.shuffle();
		while(true) {
			if(! deck.isEmpty())
				t1.dealAdd(deck.deal());
			
			if(! deck.isEmpty())
				t2.dealAdd(deck.deal());
			
			if(! deck.isEmpty())
				t3.dealAdd(deck.deal());
			
			if(! deck.isEmpty())
				t4.dealAdd(deck.deal());
			
			if(! deck.isEmpty())
				t5.dealAdd(deck.deal());
			
			if(! deck.isEmpty())
				t6.dealAdd(deck.deal());
			
			if(! deck.isEmpty())
				t7.dealAdd(deck.deal());
			
			if(! deck.isEmpty())
				t8.dealAdd(deck.deal());
			else
				break;
		}
		
		//print the contents of the Tableaus
		System.out.println("Print the tableaus!");
		System.out.println("Tableau 1: \n" + t1.toString());
		System.out.println("Tableau 2: \n" + t2.toString());
		System.out.println("Tableau 3: \n" + t3.toString());
		System.out.println("Tableau 4: \n" + t4.toString());
		System.out.println("Tableau 5: \n" + t5.toString());
		System.out.println("Tableau 6: \n" + t6.toString());
		System.out.println("Tableau 7: \n" + t7.toString());
		System.out.println("Tableau 8: \n" + t8.toString()); 
		
		
		System.out.println("Status Report: make a new test tableau (t9), unshuffled");
		Tableau t9 = new Tableau();
		Deck deck2 = new Deck();
		for (int i = 0; i < 13; i++) 
			t9.dealAdd(deck2.deal());
		System.out.println("Tableau 9: \n" + t9.toString());
		
		System.out.println("Status Report: test the FreeCell by removing the last "
				+ "card from t9 (Ace of Clubs) and adding it to fc1");
		t9.removeFromCell(12);
		fc1.addToCell();
		System.out.println("Free Cell 1: " + fc1.toString() + "\n");
		System.out.println("Tableau 9: " + t9.toString() + "\n");
		
		//Expect error, removing from empty free cell fc2
		System.out.println("Should expect error (remove from empty free cell): ");
		fc2.removeFromCell(0);
		
		//Expect error, adding card of same color (clubs) to t9 from fc1
		System.out.println("Should expect error (adding card of same color to pile): ");
		fc1.removeFromCell(0);
		System.out.println("FC1 MovePile: ");
		System.out.println(fc1.returnMovePile());
		t9.addToCell();
		System.out.println("T9 MovePile: ");
		System.out.println(t9.returnMovePile());
		fc1.addToCell();
		System.out.println("Free Cell 1: \n" + fc1.toString());
		
		//Create an empty tableau
		Tableau t10 = new Tableau();
		
		System.out.println("Status Report: Add Ace of Clubs from fc1 to t10");
		fc1.removeFromCell(0);
		t10.addToCell();
		System.out.println("Free Cell 1: \n" + fc1.toString());
		System.out.println("Tableau 10: \n" + t10.toString());
		
		System.out.println("Status Report: Add Ace of Clubs from t10 to hc3, testing "
				+ "home cells");
		t10.removeFromCell(0);
		System.out.println("T10 MovePile: ");
		System.out.println(t10.returnMovePile());
		hc3.addToCell();
		System.out.println("Tableau 10: \n" + t10.toString());
		System.out.println("Home Cell 3: \n" + hc3.toString());
		
		//Create a new test tableau, with diamonds unshuffled
		Tableau t11 = new Tableau();
		for (int i = 0; i < 13; i++) 
			t11.dealAdd(deck2.deal());
		
		System.out.println("Status Report: Add Ace of Diamonds to t9 on top of 2 of "
				+ "Clubs, testing the addToCell method");
		t11.removeFromCell(12);
		t9.addToCell(); 
		System.out.println("Tableau 9: \n" + t9.toString());
		System.out.println("Tableau 11: \n" + t11.toString());
		
		System.out.println("Status Report: Move 2 of Clubs and Ace of Diamonds "
				+ "to t10, the empty tableau");
		t9.removeFromCell(11);
		t10.addToCell();
		System.out.println("Tableau 10: \n" + t10.toString());
		System.out.println("Tableau 9: \n" + t9.toString());
		
		System.out.println("Status Report: Move Ace of Diamonds to hc4");
		t10.removeFromCell(1);
		System.out.println("T10 MovePile: ");
		System.out.println(t10.returnMovePile());
		hc4.addToCell();
		System.out.println("Home Cell 4: \n" + hc4.toString());
		System.out.println("Tableau 10: \n" + t10.toString());
		
		System.out.println("Status Report: Move 2 of Clubs to hc3, on top of "
				+ "Ace of Clubs");
		t10.removeFromCell(0);
		hc3.addToCell();
		System.out.println("Home Cell 3: \n" + hc3.toString());
		System.out.println("Tableau 10: \n" + t10.toString());
	}
}
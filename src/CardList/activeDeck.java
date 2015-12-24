package CardList;
import java.util.ArrayList;

//comment 1
public class activeDeck 
{
	public static void main(String[]args)
	{
		ArrayList<Cards> ActiveDeck = new ArrayList<Cards>();
		
		cellarCard card1 = new cellarCard();
		chapelCard card2 = new chapelCard();
		

		for(int x=1; x<=10; x++)
		{
		 ActiveDeck.add(card1);
		 ActiveDeck.add(card2);
		}
		

		for(int x=0; x< ActiveDeck.size(); x++)
		{
		 System.out.println(ActiveDeck.get(x));
		}
	}
}

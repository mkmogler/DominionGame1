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
		chancellorCard card3 = new chancellorCard();
		festivalCard card4 = new festivalCard();
		marketCard card5= new marketCard();
		moatCard card6 = new moatCard();
		smithyCard card7 = new smithyCard();
		villageCard card8 = new villageCard();
		woodcutterCard card9 = new woodcutterCard();
		workshopCard card10 = new workshopCard();

		for(int x=1; x<11; x++)
		{
		 ActiveDeck.add(card1);
		 ActiveDeck.add(card2);
		 ActiveDeck.add(card3);
		 ActiveDeck.add(card4);
		 ActiveDeck.add(card5);
		 ActiveDeck.add(card6);
		 ActiveDeck.add(card7);
		 ActiveDeck.add(card8);
		 ActiveDeck.add(card9);
		 ActiveDeck.add(card10);
		 
		}
		

		for(int x=0; x< ActiveDeck.size(); x++)
		{
		 System.out.println(ActiveDeck.get(x));
		}
		System.out.println(ActiveDeck.size() + " cards in active deck.");
	}
}

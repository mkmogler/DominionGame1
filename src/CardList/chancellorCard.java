package CardList;

public class chancellorCard extends Cards
{
	private String description;

	public chancellorCard()
	{
	super(0,3,0,2);
	description = " +2 Cards "
				+ "/nYou may immediately put your deck into your discard pile.";
		
	}
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	@Override
	public void doCardSpecificACtion()
	{
		System.out.println("Gold - " + super.getCost()+super.getAddedGold());
	}
}

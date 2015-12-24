package CardList;

public class cellarCard extends Cards 
{
	private String description;

	public cellarCard()
	{
	super(2,1,0,0);
	description = "Discard any number of cards."
				+ "/n+1 Card per card discarded.";
		
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
		System.out.println("Gold - " + super.getCost() + super.getAddedGold());
	}
}

package CardList;

public class workshopCard extends Cards
{
	private String description;

	public workshopCard()
	{
	super(0,3,0,0);
	description = "Gain a card costing up to $4."; 	
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
		System.out.println("Gold - " + super.getCost());
	}
}

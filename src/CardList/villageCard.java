package CardList;

public class villageCard extends Cards
{
	private String description;

	public villageCard()
	{
	super(2,3,0,0);
	description = " +1 Cards."
				+ "/n+2 Actions."; 	
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

package CardList;

public class marketCard extends Cards
{
	private String description;

	public marketCard()
	{
	super(1,5,1,1);
	description = "+1 Card,"
				+ "/n+1 Action,"
				+ "/n+1 Buy,"
				+ "/n+$1.";
		
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

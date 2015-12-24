package CardList;

public class festivalCard extends Cards
{
	private String description;

	public festivalCard()
	{
	super(2,5,1,2);
	description = "+2 Actions, "
				+ "/n+1 Buy,"
				+ "/n+$2."; 	
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

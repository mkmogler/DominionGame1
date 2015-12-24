package CardList;

public class woodcutterCard extends Cards
{
	private String description;

	public woodcutterCard()
	{
	super(0,3,1,2);
	description = "+1 Buy"
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
		System.out.println("Gold - " + super.getCost()+super.getAddedGold());
	}
}

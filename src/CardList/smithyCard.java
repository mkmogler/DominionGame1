package CardList;

public class smithyCard extends Cards
{
	private String description;

	public smithyCard()
	{
	super(0,4,0,0);
	description = "+3 Cards."; 	
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

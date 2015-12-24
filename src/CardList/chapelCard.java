package CardList;

public class chapelCard extends Cards
{
	private String description;

	public chapelCard()
	{
	super(2,0,0);
	description = "Trash up to 4 cards from your hand.";
		
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

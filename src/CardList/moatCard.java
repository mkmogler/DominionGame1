package CardList;

public class moatCard extends Cards
{
	private String description;

	public moatCard()
	{
	super(0,2,0,0);
	description = " +2 Cards "
				+ "/nWhen another player plays an Attack card, you may reveal this from your hand."
				+ "/nIf you do, you are unaffected by that Attack.";
		
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

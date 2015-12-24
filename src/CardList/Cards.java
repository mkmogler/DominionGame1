package CardList;

public class Cards {
	
	private int cost;
	private int action;
	private int buys;
	private int addedGold;
	
	public Cards()
	{
		cost = 0;
		action = 0;
		buys = 0;
		addedGold = 0;
	}
	
	public Cards(int cost, int action, int buys, int addedGold)
	{
		this.action = action;
		this.cost = cost;
		this.buys = buys;
		this.addedGold = addedGold;
		
	}
	
	public int getCost()
	{
		return cost;
	}
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	
	public int getAction()
	{
		return action;
	}
	
	public void setAction(int action)
	{
		this.action = action;
	}
	
	public int getBuys()
	{
		return buys;
	}
	
	public void setBuys(int buys)
	{
		this.buys=buys;
	}
	public int getAddedGold()
	{
		return addedGold;
	}
	
	public void setAddedGold(int addedGold)
	{
		this.addedGold = addedGold;
	}
	public void doCardSpecificACtion()
	{
		System.out.println("Not overridden");
	}
	

}

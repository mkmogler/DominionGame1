package CardList;

public class Cards {
	
	private int cost;
	private int action;
	private int buys;
	
	public Cards()
	{
		cost = 0;
		action = 0;
		buys = 0;
	}
	
	public Cards(int cost, int action, int buys)
	{
		this.action = action;
		this.cost = cost;
		this.buys = buys;
		
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
	
	public void setACtion(int action)
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
	
	public void doCardSpecificACtion()
	{
		System.out.println("Not overridden");
	}
	

}

package eg3;

public class product {
	
	private int id;
	private double rate;
	private String name;
	private double cost;
	
	public product()
	{
		//TODO Auto-generated constructor stub
	}
	
	public product(int id, double rate, String name)
	{
		this.id = id;
		this.name = name;
		this.rate = rate;
	}

	public product(int id,  String name, double rate, double cost)
	{
		this(id,rate,name); //Constructor chaining
		this.cost = cost;
	}
	
	@Override
	public String toString()
	{
		return "Product [id=" + id + ", name=" + ", rating=" + rate + ", cost=" + cost + "]"; 
				
	}
}

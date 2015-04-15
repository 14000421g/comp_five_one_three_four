package comp5134.model;

public abstract class IceCreamDecorator extends IceCream{

	protected IceCream iceCream ;
	protected int myPrice = 0;
	
	protected IceCreamDecorator(IceCream iceCream){
		this.iceCream = iceCream;

	}
	
	public abstract int getTotalPrice();
	public abstract boolean isHasFlavor();
	
}

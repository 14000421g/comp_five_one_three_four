package comp5134.model;

public class FlavorDecorator extends IceCreamDecorator{
	
	public FlavorDecorator(IceCream iceCream, int price) {
		super(iceCream);
		// TODO Auto-generated constructor stub
		myPrice = price;
		
		totalPrice = iceCream.totalPrice;
		
		for (int i=0;i<iceCream.getObserverList().size();i++){
			this.registerObserver(iceCream.getObserverList().get(i));
		}
	}


	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return totalPrice;
	}


	@Override
	public boolean isHasFlavor() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public void addTotal() {
		// TODO Auto-generated method stub
		totalPrice += myPrice;
		setChanged();
		notifyObservers(OBSERVABLE_EVENT_ADD_TOTAL);
	}
	
	
	@Override
	public void setFlavor() {
		// TODO Auto-generated method stub
		hasFlavor = false;
		setChanged();
		notifyObservers(OBSERVABLE_EVENT_SET_FLAVOR);
	}

}

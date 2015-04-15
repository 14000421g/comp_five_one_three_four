package comp5134.model;

public class IceCreamSale extends IceCream{

	public IceCreamSale(){

	}
	
	@Override
	public void addTotal() {
		// TODO Auto-generated method stub
		totalPrice = 0;
		setChanged();
		notifyObservers(IceCream.OBSERVABLE_EVENT_RESET);
	}

	@Override
	public void setFlavor() {
		// TODO Auto-generated method stub
		hasFlavor = false;
		setChanged();
		notifyObservers(IceCream.OBSERVABLE_EVENT_RESET);
		
		
	}

	
}

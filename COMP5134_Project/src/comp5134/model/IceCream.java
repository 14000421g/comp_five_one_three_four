package comp5134.model;

import comp5134.util.Observable;


public abstract class IceCream extends Observable {
	
	

	protected int totalPrice ;
	protected boolean hasFlavor = false;
	
	public static final String OBSERVABLE_EVENT_ADD_TOTAL = "ADD_TOTAL";
	public static final String OBSERVABLE_EVENT_SET_FLAVOR = "SET_FLAVOR";
	public static final String OBSERVABLE_EVENT_RESET = "RESET";
	
	
	public abstract void addTotal();
	public abstract void setFlavor();
	
	public boolean isHasFlavor() {
		return hasFlavor;
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	
	

}

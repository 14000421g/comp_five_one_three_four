package comp5134.controller;

import comp5134.model.IceCream;

import comp5134.view.POSView;

public class IceCreamController {

	private POSView myView;
	private IceCream iceCream;
	
	public IceCreamController(POSView view, IceCream iceCream){
		
		this.myView = view;
		this.iceCream = iceCream;
	}
	
	public void control(){
		
		
		NewIceCreamActionListener newIceCreamListener = new NewIceCreamActionListener(this);   
		myView.getNewIceCreamButton().addActionListener(newIceCreamListener);
		
		SystemAdminActionListener adminBtnListener = new SystemAdminActionListener(this);
		myView.getAdminButton().addActionListener(adminBtnListener);
		
		
		FlavorActionListener flavorListener = new FlavorActionListener(this,20);
		myView.getChocolateButton().setText("Chocolate $"+20);
		myView.getChocolateButton().addActionListener(flavorListener);
		iceCream.registerObserver(myView.getChocolateButton());
		
		flavorListener = new FlavorActionListener(this,10);
		myView.getVanillaButton().setText("Vanilla $"+10);
		myView.getVanillaButton().addActionListener(flavorListener);
		iceCream.registerObserver(myView.getVanillaButton());
		
		iceCream.registerObserver(myView.getTotalLabel());
		
		ToppingActionListener decoratorListener = new ToppingActionListener(this,5);
		myView.getM_mButton().setText("M&M $"+5);
		myView.getM_mButton().addActionListener(decoratorListener);
		
		decoratorListener = new ToppingActionListener(this,4);
		myView.getStrawberryButton().setText("Strawberry $"+4);
		myView.getStrawberryButton().addActionListener(decoratorListener);
		
		
	}

	public POSView getMyView() {
		return myView;
	}

	public IceCream getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	
	
	
}

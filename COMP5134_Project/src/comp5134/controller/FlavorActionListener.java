package comp5134.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import comp5134.model.FlavorDecorator;

public class FlavorActionListener implements ActionListener{

	private int price;
	private IceCreamController controller;
	
	
	public FlavorActionListener(IceCreamController controller,int price){
		this.controller = controller;
		this.price = price;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		controller.setIceCream(new FlavorDecorator(controller.getIceCream(), price) )  ;
		controller.getIceCream().setFlavor();
		controller.getIceCream().addTotal();
		
	}


}

package comp5134.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import comp5134.model.ToppingDecorator;

public class ToppingActionListener implements ActionListener{

	private int price;
	private IceCreamController controller;
	
	
	public ToppingActionListener(IceCreamController controller,int price){
		this.controller = controller;
		this.price = price;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		controller.setIceCream(new ToppingDecorator(controller.getIceCream(), price));
		controller.getIceCream().addTotal();
		
	}

}

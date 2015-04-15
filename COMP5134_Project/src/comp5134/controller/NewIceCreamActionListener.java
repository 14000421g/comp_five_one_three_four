package comp5134.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import comp5134.model.IceCream;
import comp5134.model.IceCreamSale;

public class NewIceCreamActionListener implements ActionListener{
	
	private IceCreamController controller ;
	
	public NewIceCreamActionListener(IceCreamController controller){
		this.controller = controller;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		IceCream newIceCreamSale = new IceCreamSale();
		for (int i=0;i<controller.getIceCream().getObserverList().size();i++){
			newIceCreamSale.registerObserver(controller.getIceCream().getObserverList().get(i));
		}
		
		controller.setIceCream(newIceCreamSale);
		controller.getIceCream().addTotal();
		controller.getIceCream().setFlavor();
	}

}

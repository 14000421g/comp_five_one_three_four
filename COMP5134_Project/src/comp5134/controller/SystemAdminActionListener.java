package comp5134.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import comp5134.view.FlavorButton;
import comp5134.view.SystemAdminView;

public class SystemAdminActionListener implements ActionListener{

	private IceCreamController controller;

	public SystemAdminActionListener(IceCreamController controller){
		this.controller = controller;
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String itemName = null;
		String itemPrice = null;
		
		String itemType = null;

		
		SystemAdminView adminView = new SystemAdminView();
		
		int reply = JOptionPane.showOptionDialog(null, adminView.getContentPane(),
		    "System Administration", JOptionPane.OK_CANCEL_OPTION,
		    JOptionPane.QUESTION_MESSAGE, null, null, null);
		
		if (JOptionPane.OK_OPTION==reply){
			
			if (adminView.getFlavorRadioButton().isSelected()){
				itemType = "flavor";
			}else if (adminView.getDecoratorRadioButton().isSelected()){
				itemType = "decorator";
			}
			
			itemName = adminView.getItemName().getText();
			itemPrice = adminView.getItemPrice().getText();
			
		}
		
		
		
		int price = 0;
		
		if (itemPrice!=null && !"".equals(itemPrice)){
			price = Integer.parseInt(itemPrice);
		}


		if ("flavor".equals(itemType)){

			FlavorButton newBtn = new FlavorButton(itemName + " $"+price);
			
			if (controller.getIceCream().isHasFlavor()){
				newBtn.setEnabled(false);
			}
			
			controller.getMyView().getFlavorButtonPanel().add(newBtn);

			FlavorActionListener listener = new FlavorActionListener(controller ,price);
			newBtn.addActionListener(listener);
			
			controller.getIceCream().registerObserver(newBtn);
		
		}
		
		if ("decorator".equals(itemType)){
			JButton newDecoratorBtn = new JButton(itemName + " $"+price);
			controller.getMyView().getDecoratorButtonPanel().add(newDecoratorBtn);
			
			ToppingActionListener decoratorListener = new ToppingActionListener( controller ,price);
			newDecoratorBtn.addActionListener(decoratorListener);
		}
		
		controller.getMyView().getMainFrame().revalidate();
		controller.getMyView().getMainFrame().repaint();


	}



}

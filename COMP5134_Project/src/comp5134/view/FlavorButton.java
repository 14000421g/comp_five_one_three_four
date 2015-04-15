package comp5134.view;

import javax.swing.JButton;

import comp5134.model.IceCream;
import comp5134.util.Observable;
import comp5134.util.Observer;


public class FlavorButton extends JButton implements Observer{


	/**
	 * 
	 */
	private static final long serialVersionUID = 8303182830297536087L;


	public FlavorButton(String text){
		super(text);
	}


	@Override
	public void update(Observable o, Object obj) {
		// TODO Auto-generated method stub


		String str = (String) obj;
		IceCream iceCream = (IceCream) o ;

		if (IceCream.OBSERVABLE_EVENT_ADD_TOTAL.equals(str) || IceCream.OBSERVABLE_EVENT_SET_FLAVOR.equals(str)){
			if (iceCream.isHasFlavor()) {
				this.setEnabled(false);
			}
		}


		if (IceCream.OBSERVABLE_EVENT_RESET.equals(str)){
			this.setEnabled(true);
		}

	}

}

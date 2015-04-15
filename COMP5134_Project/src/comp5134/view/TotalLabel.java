package comp5134.view;

import javax.swing.JLabel;

import comp5134.model.IceCream;
import comp5134.util.Observable;
import comp5134.util.Observer;


public class TotalLabel extends JLabel implements Observer{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1019789082414092394L;

	public TotalLabel(String text){
		super(text);
	}
	
	@Override
	public void update(Observable o, Object obj) {
		// TODO Auto-generated method stub
		
		
		String str = (String) obj;
		if (IceCream.OBSERVABLE_EVENT_ADD_TOTAL.equals(str) || IceCream.OBSERVABLE_EVENT_SET_FLAVOR.equals(str)){
			IceCream m = (IceCream) o;
			this.setText("Total: $"+ m.getTotalPrice() );
		}
		
		
		if (IceCream.OBSERVABLE_EVENT_RESET.equals(str)){
			IceCream m = (IceCream) o;
			this.setText("Total: $"+ m.getTotalPrice());
		}
		
	}

}

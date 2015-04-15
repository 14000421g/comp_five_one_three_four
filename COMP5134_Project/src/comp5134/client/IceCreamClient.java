package comp5134.client;


import comp5134.controller.IceCreamController;
import comp5134.model.IceCream;
import comp5134.model.IceCreamSale;
import comp5134.view.POSView;

public class IceCreamClient {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IceCream iceCream = new IceCreamSale();

		POSView view = new POSView();

		IceCreamController controller = new IceCreamController(view,iceCream);
		controller.control();

	}

}

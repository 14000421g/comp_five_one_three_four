package comp5134.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SystemAdminView extends JPanel{


	/**
	 * 
	 */
	private static final long serialVersionUID = 6128221812332859248L;



	private Container contentPane = new Container();



	private JRadioButton flavorRadioButton = new JRadioButton("Flavor");
	private JRadioButton decoratorRadioButton = new JRadioButton("Decorator");

	private JTextField itemName = new JTextField(10);
	private JTextField itemPrice = new JTextField(10);


	public SystemAdminView(){


		JPanel panel = new JPanel();
		panel.setSize(20, 20);
		contentPane.setLayout(new BorderLayout(2,1));

		ButtonGroup group = new ButtonGroup();

		group.add(flavorRadioButton);
		group.add(decoratorRadioButton);

		panel.add(flavorRadioButton);
		panel.add(decoratorRadioButton);

		contentPane.add(panel, BorderLayout.NORTH);

		JPanel p2 = new JPanel(new GridLayout(2,2));
	
		p2.add(new JLabel("Item Name:"));
		p2.add(itemName);
		p2.add(new JLabel("Item Price:"));
		p2.add(itemPrice);

		contentPane.add(p2,BorderLayout.CENTER);

	}




	public JRadioButton getFlavorRadioButton() {
		return flavorRadioButton;
	}

	public JRadioButton getDecoratorRadioButton() {
		return decoratorRadioButton;
	}

	public JTextField getItemName() {
		return itemName;
	}

	public JTextField getItemPrice() {
		return itemPrice;
	}
	public Container getContentPane() {
		return contentPane;
	}

}

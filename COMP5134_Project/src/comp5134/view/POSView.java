package comp5134.view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class POSView{

	
	
	private NewIceCreamButton newIceCreamButton = new NewIceCreamButton("New IceCream");
	private JButton adminButton = new JButton("System Administration");
	
	private TotalLabel totalLabel = new TotalLabel("Total: $0");
	
	private FlavorButton chocolateButton = new FlavorButton("");
	private FlavorButton vanillaButton = new FlavorButton("");
	
	private JButton m_mButton = new JButton("");
	private JButton strawberryButton = new JButton("");
	
	
	JPanel flavorButtonPanel = new JPanel();
	JPanel decoratorButtonPanel = new JPanel();
	
	JFrame mainFrame = new JFrame("COMP5134 OO Project - IceCream POS");
	
	
	public POSView(){
		
		
		mainFrame.setSize(800, 600);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagLayout gbLayout = new GridBagLayout();
		JPanel pane = new JPanel(gbLayout);
		GridBagConstraints c = new GridBagConstraints();

		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.fill = GridBagConstraints.BOTH;

		c.weightx = 0.3;
		c.weighty = 0.2;
		
		
		JLabel flavorLabel = new JLabel("ICE-CREAM Flavor");
		flavorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		flavorLabel.setSize(200, 50);
		c.gridx = 0;
		c.gridy = 0;
		
		pane.add(flavorLabel,c);


		JLabel decoratorLabel = new JLabel("Topping");
		decoratorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 1;
		c.gridy = 0;

		pane.add(decoratorLabel,c);
		

		c.gridx = 2;
		c.gridy = 0;
		pane.add(newIceCreamButton,c);
		
		
		flavorButtonPanel = new JPanel(new GridLayout(0,1));
		flavorButtonPanel.add(chocolateButton);
		flavorButtonPanel.add(vanillaButton);

		c.gridx = 0;
		c.gridy = 1;
		c.weighty = 0.6;
		pane.add(flavorButtonPanel,c);

		
		
		decoratorButtonPanel = new JPanel(new GridLayout(0,1));
		
		decoratorButtonPanel.add(m_mButton);
		decoratorButtonPanel.add(strawberryButton);

		c.gridx = 1;
		c.gridy = 1;
		pane.add(decoratorButtonPanel,c);
		
		
		JPanel dummyPanel = new JPanel();
		c.gridx = 1;
		c.gridy = 2;
		pane.add(dummyPanel,c);

		
		c.gridx = 0;
		c.gridy = 2;
		c.weighty = 0.2;
		pane.add(adminButton,c);
		
		c.gridx = 1;
		c.gridy = 2;
		pane.add(dummyPanel,c);

		System.out.println(flavorLabel.getFont().getFontName());
		totalLabel.setFont(new Font("LucidaGrande", Font.BOLD, 25));
		totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 2;
		c.gridy = 2;
		pane.add(totalLabel,c);

		mainFrame.add(pane);
		
		mainFrame.setVisible(true);
	}



	public JFrame getMainFrame() {
		return mainFrame;
	}



	public JPanel getFlavorButtonPanel() {
		return flavorButtonPanel;
	}

	public JPanel getDecoratorButtonPanel() {
		return decoratorButtonPanel;
	}

	public JButton getM_mButton() {
		return m_mButton;
	}


	public JButton getStrawberryButton() {
		return strawberryButton;
	}


	public NewIceCreamButton getNewIceCreamButton() {
		return newIceCreamButton;
	}



	public TotalLabel getTotalLabel() {
		return totalLabel;
	}

	public FlavorButton getChocolateButton() {
		return chocolateButton;
	}

	public JButton getAdminButton() {
		return adminButton;
	}

	public FlavorButton getVanillaButton() {
		return vanillaButton;
	}

}

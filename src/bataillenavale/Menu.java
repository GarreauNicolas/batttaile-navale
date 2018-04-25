package bataillenavale;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Menu extends JPanel {
	
	private JFrame menu;
	
	private JButton jouer;
	
	public Menu () {
		 this.menu = new JFrame ( " Bataille Navale ");
		 this.menu.setSize(600, 500);
		 this.menu.setResizable(false);
		 this.menu.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);
		 
		 jouer = new JButton(" Jouer ");
		 
		 this.menu.getContentPane().setLayout(new BorderLayout ());
		 this.menu.add(jouer, BorderLayout.CENTER);
		 
		 jouer.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					AffichBataille plateau = new AffichBataille();
					menu.setVisible(false);
			
					
				}
			});
		 
		 this.menu.setVisible(true);
	}

}

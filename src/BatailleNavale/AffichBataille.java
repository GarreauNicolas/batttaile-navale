package BatailleNavale;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class AffichBataille extends JPanel {
	
	private JFrame bataille;
	
	private JPanel partieDroite;
	private JPanel partieGauche;
	private JPanel monPlateau;
	private JPanel plateauAdver;
	
	private JLabel ml3;
	private JLabel ml4;
	
	
	public AffichBataille ( ) {
		
		this.bataille = new JFrame ( " Bataille Navale ");
		this.bataille.setSize(1925, 1025);
		this.bataille.setResizable(false);
		this.bataille.setDefaultCloseOperation(bataille.EXIT_ON_CLOSE);
		
		
		partieDroite = new JPanel ();
		partieDroite.setLayout(new BorderLayout());
		
		ml3 = new JLabel ("Mon plateau");
		this.ml3.setHorizontalAlignment(SwingConstants.CENTER);
		
		monPlateau = new JPanel ();
		monPlateau.setLayout(new GridLayout (10,10));
		for ( int i =0; i <100; i++) {
			monPlateau.add(new JButton ());
		}
		
		partieDroite.add(monPlateau, BorderLayout.CENTER);
		partieDroite.add(ml3, BorderLayout.SOUTH);

		partieGauche = new JPanel ();
		partieGauche.setLayout(new BorderLayout());
		
		ml4 = new JLabel ("Plateau adverse");
		this.ml4.setHorizontalAlignment(SwingConstants.CENTER);
		
		plateauAdver = new JPanel ();
		plateauAdver.setLayout(new GridLayout (10,10));
		for ( int i =0; i <100; i++) {
			plateauAdver.add(new JButton ());
		}
		
		partieGauche.add(plateauAdver, BorderLayout.CENTER);
		partieGauche.add(ml4, BorderLayout.SOUTH);
		
		this.bataille.setLayout(new GridLayout (1,2));
		
		this.bataille.add(partieDroite);
		this.bataille.add(partieGauche);
	
		
		
		this.bataille.setVisible(true);
	}
}



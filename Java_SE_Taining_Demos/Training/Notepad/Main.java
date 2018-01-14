import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Main extends JFrame{

	
	Main(){
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));

		Color bc = new Color(255,0,0);
	
		
		p1.setBorder(new LineBorder(bc, 3));
		
		p1.setBackground(Color.BLACK);
		
		JButton b1 = new JButton("Font");
		
		//b1.addAncestorListener(new)
		
		final JTextField l1 = new  JTextField(10);
		
		
      JButton b2 = new JButton("Font");
		
		JTextField l2 = new  JTextField(10);
		
		
		p1.add(b1);
		p1.add(l1);
		p1.add(b2);
		p1.add(l2);
				
		 JRadioButton r1 = new JRadioButton("male");
		 JRadioButton r2 = new JRadioButton("Female");
		 ButtonGroup group = new ButtonGroup();
		 
		 group.add(r1);
		 group.add(r2);
		 p1.add(r1);
		 p1.add(r2);
		
		 JCheckBox e = new JCheckBox();
		 JComboBox<String> f = new JComboBox<String>();
		 String[] flagTitles= {"Canada" , "China" , "Denmark" ,
				 "France", "Germany", "India", "Norway", "United Kingdom",
				 "United States of America"};
		 
		 JComboBox jcbo = new JComboBox(flagTitles);
		
		 p1.add(jcbo);
		 
		 
		 p1.add(e);
		 
		 JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
			setLayout(new BorderLayout());
			add(p1,BorderLayout.NORTH);
			add(p2,BorderLayout.SOUTH);
			final TextArea t1 = new TextArea();
			
			add(t1,BorderLayout.CENTER);
				
			b1.addActionListener(
					 new ActionListener() {
					 public void actionPerformed(ActionEvent e) {
					 t1.setFont(new Font(l1.getText(),Font.BOLD,20));
					 }
					 }
					 );

		 
		
		JButton saveButton = new JButton("Save");

		
		
		p2.add(saveButton);
		saveButton.addActionListener(
				 new ActionListener() {
				 public void actionPerformed(ActionEvent e) {

					 
					 
				
						

							FileWriter file;
							try {
								file = new FileWriter("amr.txt");
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							BufferedWriter writer = new BufferedWriter(file);
							
								writer.write(t1.getText());
								
							writer.close();
								
							file.close();
							
						
					 
					 

				 }
				 }
				 );

		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.setSize(400,400);
		
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
		
		
		
		
		
		
		
		

	}

}

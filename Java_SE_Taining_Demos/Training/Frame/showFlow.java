import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.FlowLayout;





public class showFlow extends JFrame {
	
	showFlow()
	{
		
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		
		
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
		
	
			
		
		
	}	
	
	showFlow(int i)
	{
		
		setLayout(new BorderLayout(5,10));
		
		
		add(new JButton("Center"),BorderLayout.CENTER);
		add(new JButton("First Name"),BorderLayout.SOUTH);
		add(new JButton("First Name"),BorderLayout.EAST);
		add(new JButton("First Name"),BorderLayout.NORTH);
		add(new JButton("First Name"),BorderLayout.WEST);
	
		
			
		
		
	}	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showFlow frame = new showFlow(1);
		
		frame.setTitle("my frame");
		
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(200,200);
		frame.setVisible(true);
	
		
		
	}

}

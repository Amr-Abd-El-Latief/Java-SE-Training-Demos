import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Microwave extends JFrame{

	
	Microwave(){
		
		JPanel p1 =new JPanel();
		
		p1.setLayout(new GridLayout(4,3));
		
		
		for (int i=1;i<=9;i++)
		{
			p1.add(new JButton(""+i));	
			
			
		}
			
		
		p1.add(new JButton("Start"));
		p1.add(new JButton("0"));
		p1.add(new JButton("End"));
		
		
	
		 JPanel p2 =  new JPanel(new BorderLayout());
		 
        p2.add(new JTextField ("Time to Display Here"),BorderLayout.NORTH);
        p2.add(p1 , BorderLayout.CENTER);
        
        add(p2,BorderLayout.EAST);
        add(new JButton("Food to be Placed Here"),BorderLayout.CENTER);
        
        		
		
		
		
	}
	
	
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Microwave m = new Microwave();
		
		m.setTitle("my project");
		
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		m.setSize(400, 250);
		
		m.setVisible(true);
		
		
		
		
		
		
		

	}

}

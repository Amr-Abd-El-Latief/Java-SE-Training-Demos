import javax.swing.*;
import java.awt.event.*;
public class ListenerDemo extends JFrame {
public ListenerDemo() {
// Create four buttons
 
 JButton jbtOK = new JButton("OK"); 
 ActionListener listener1 = new OKListenerClass(); 
 
 
 jbtOK.addActionListener(listener1);

add(jbtOK);
		 


}


 /** Main method */
 public static void main(String[] args) {
 JFrame frame = new ListenerDemo();
 frame.setTitle("ListenerDemo");
 frame.setLocationRelativeTo(null); // Center the frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(200,100);
 frame.setVisible(true);
 }
 
 class OKListenerClass implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		 System.out.println("Process OK");
		 }
}
 }




import java.io.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyServer extends JFrame {
public static void main(String[] args){
	

	
	
try{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection 

DataInputStream dis=new DataInputStream(s.getInputStream());

String	str=(String)dis.readUTF();
System.out.println("message= "+str);

//servertf.setText("message= "+str);

//JOptionPane.showMessageDialog(null,"message= "+str);

ss.close();

}catch(Exception e){System.out.println(e);}
}
}

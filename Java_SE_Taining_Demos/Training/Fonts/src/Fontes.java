import java.awt.GraphicsEnvironment;


public class Fontes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphicsEnvironment e = 
				  GraphicsEnvironment.getLocalGraphicsEnvironment();
				String[] fontnames =   e.getAvailableFontFamilyNames();
				for (int i = 0; i < fontnames.length; i++)
				  System.out.println(fontnames[i]);



	}

}

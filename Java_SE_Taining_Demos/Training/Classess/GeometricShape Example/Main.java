package com.shape.Geo;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GeometricShape g = new  GeometricShape();
				
		
		g.setColor("red");
		g.setBorderSize(2);
		
		System.out.print(g.getColor());
		
		
		GeometricShape g2 = new  GeometricShape("Blue",4);
		System.out.print(g2.getColor());
		
		
		
		
		
	}

}

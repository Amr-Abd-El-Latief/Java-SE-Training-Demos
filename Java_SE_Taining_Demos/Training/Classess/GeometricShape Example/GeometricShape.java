package com.shape.Geo;

public class GeometricShape {

	
	private String color;
	private int borderSize;
	private static int numberofObject;

	
GeometricShape()
	
	{
		
	numberofObject++;
	}
	
GeometricShape(String c,int bs)
	
	{
		
		color = c;
		borderSize =bs;
		numberofObject++;
		
		
	}
	
	public void setColor(String c)
	{
		
		color =c;
		
		
	}
	
	
	
	public String getColor()
	
	{
		
		return color;
		
	}

	
	public void setBorderSize(int bs)
	{
		
		borderSize =bs;
		
		
	}
	
	
	
	public int getBorderSize()
	{
		
		return borderSize ;
		
		
	}

	
}

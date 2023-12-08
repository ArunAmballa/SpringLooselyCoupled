package com.arun.beans;

public class PythonBook implements Book
{
	public PythonBook()
	{
		System.out.println("PythonBook Object is created");
	}

	@Override
	public boolean bookSelected() 
	{
		
		System.out.println("PythonBook is Selected");
		return true;
	}

}

package com.revature.indepthexceptions;

public class Launcher 
{
	
	public static void main(String[] args)
	{
		try
		{
			Launcher.Divider(5,1);
		}
		
		catch (Exception e)
		{
			
		}
		finally
		{
			System.out.println("Thanks for using divider!");
		}
		
		try
		{
			Launcher.JamesBond("1738");
		}
		catch (SecretAgentException exception) {
			System.out.println("Hello, Mr. Bond!");
		}
		finally
		{
			System.out.println("Thank you for using my method.");
		}
	}
	
	public static int Divider(int dividend, int divisor)
	{
		return dividend/divisor;
	}
	public static void JamesBond(String word) throws SecretAgentException
	{
		if (word == "007")
		{
			throw new SecretAgentException();
		}
		
	}
}

package com.revature.armstrong;

public class Armstrong {
	
	public static void main(String[] args) {
		for(int i = 0; i<=10000; i++)
		{
			String number = Integer.toString(i);
			int power = number.length();
			int[] digits = new int[power];
			int sum =0;
			for(int j =0; j<power; j++)
			{
				digits[j]=Character.getNumericValue(number.charAt(j));
			}
			for(int digit:digits)
			{
				sum = sum + (int)Math.pow(digit,power);
				
			}
			
			if (sum == i)
			{
				System.out.println(i);
			}	
		}
	}
}

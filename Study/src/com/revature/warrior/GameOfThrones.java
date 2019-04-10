package com.revature.warrior;

public class GameOfThrones {
	public static void main(String[] args) {
		
		Warrior w1 = new Assasin("Arya", "Stark","needle");
		try {
			Warrior w2 = (Warrior)w1.clone();
			System.out.println(w1);
			System.out.println(w2);
			if(w1.equals(w2))
			{
				System.out.println("w1 is equal to w2");
			}
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}

package com.revature.objectsuper;
import com.revature.objects.*;

public class ObjectSuperLauncher {
	
	public static void main(String[] args) {
		
		Animal b1 = new Bear();
		Animal b2 = new Bear("Brown", "Polar Bear", 4, "Bearington", "White","salmon");
		
		if (b1==b2)
		{
			System.out.println("b1 and b2 are equal");
		}
		
		b1 = b2;
		if(b1.equals(b2))
		{
			System.out.println("b1 and b2 .equal");
		}
		
		if(b1==b2)
		{
			System.out.println("b1 and b2 are equal");
		}
		try {
			b1 =  (Animal) b2.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(b1.equals(b2))
		{
			System.out.println("b1 and b2 .equal after cloning");
		}
	}

}

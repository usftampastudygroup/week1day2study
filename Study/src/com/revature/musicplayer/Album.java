package com.revature.musicplayer;

public class Album {
	
	private static Album album = null;
	private String artist;
	private String name;
	private Single[] singles;
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Album()
	{
//		super();
		this.artist = "Ed Sheeran";
		this.name = "Divide";
		singles = new Single[5];
		singles[0] = new Single("Dive");
		singles[1] = new Single("Shape of You");
		singles[2] = new Single("Perfect");
		singles[3] = new Single("Castle on the Hill");
		singles[4] = new Single("Gallway Girl");
	}
	
	private static void createAlbum()
	{
		album = new Album();
	}
	
	public static Album giveAlbum()
	{
		if (album == null)
		{
			createAlbum();
		}
		return album;
	}
	public void playSingle(String title)
	{
		boolean available=false;
		for (Single single : this.singles)
		{
			if(single.getTitle().equals(title))
			{
				available = true;
				System.out.println(title + " is playing.");
			}
		}
		if(available==false)
		{
			System.out.println("Song is not in album.");
		}
		
		
	}
	

}

package com.revature.musicplayer;

public class MusicPlayer {

	public static void main(String[] args) {
		
		Album album = Album.giveAlbum();
		album.playSingle("Shape of You");
	}
}

package com.nit.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMusicPlayer {

	public static void main(String[] args) {
		
		List<String> playlist = new ArrayList<>(Arrays.asList("Shape of You", "Blinding Lights"));
		String newSong = "Shape of You";
		
		if(playlist.contains(newSong)) {
			System.out.println("Song already present in playlist");
			
		}
		else {
			System.out.println("New Song");
		}
		
	}

}

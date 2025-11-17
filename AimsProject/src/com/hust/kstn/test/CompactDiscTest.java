package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
    
    public static void main(String[] args) {
  
        Track track1 = new Track("Track 1: Introduction", 150); 
        Track track2 = new Track("Track 2: Main Theme", 240); 
        Track track3 = new Track("Track 3: Interlude", 90); 
        Track track4 = new Track("Track 4: Zero Length Test", 0);
        Track track5 = new Track("Track 5: Overdrive",48);
        String[] artists = {"Adele", "Bruno Mars"};
        String[] directors = {"Director A", "Director B"};
        
        Track[] multiTracks = {track1, track2, track3};
        CompactDisc cd1 = new CompactDisc("New Future", "Pop", 12.99, artists, directors, multiTracks);
        
        System.out.println(cd1);
        
        cd1.addTrack(track4);
        System.out.println(cd1);
        
        cd1.removeTrack(track4);
        System.out.println(cd1);
        
        cd1.removeTrack(track5);
        System.out.println(cd1);

        

    }
}
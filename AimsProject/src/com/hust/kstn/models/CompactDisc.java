package com.hust.kstn.models;

public class CompactDisc {
    private int id;
    private String title;
    private String category;
    private double cost;
    private String[] artist; 
    private String[] director;
    private Track[] tracks = new Track[MAX_TRACK]; 
    
    private static int numberCD = 0; 
    private static final int MAX_TRACK = 50; 
    private int trackCount = 0; 
    
    public CompactDisc(String title, String category, double cost, String[] artist, String[] director, Track[] tracks) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artist = new String[artist.length];
        for(int i=0;i<artist.length;i++) {
        	this.artist[i]=artist[i];
        }
        
        this.director = new String[director.length];
        for(int i=0;i<director.length;i++) {
        	this.director[i]=director[i];
        }

        numberCD++;
        this.id = numberCD;
        
        if (tracks != null) {
            int numberTrackLimit = Math.min(tracks.length, MAX_TRACK);
            
            for (int i = 0; i < numberTrackLimit; i++) {
                this.tracks[i] = tracks[i];
            }
            
            this.trackCount = numberTrackLimit;
            
            if (tracks.length > MAX_TRACK) {
                System.out.println("There too much track . Only the first "+ MAX_TRACK + "will be added ,another will be ignored");
            }
        } else {
            this.trackCount = 0;
        }
    }
   
    public int totalLength() {
        int total = 0;
        for (int i = 0; i < this.trackCount; i++) {
            total += this.tracks[i].getLength(); 
        }
        return total;
    }
    
    @Override
    public String toString() {
        String tracksString = "Tracks:\n";
        if (this.tracks != null && this.trackCount > 0) {
            for (int i = 0; i < this.trackCount; i++) {
                tracksString += "\t" + (i + 1) + ". " + this.tracks[i].toString(); 
            }
        } else {
            tracksString += "\tNo tracks listed.\n";
        }

        String artistString = "Artist(s): ";
        if (this.artist != null && this.artist.length > 0) {
            for (int i = 0; i < this.artist.length; i++) {
                artistString += this.artist[i];
                if (i < this.artist.length - 1) {
                    artistString += ", ";
                }
            }
        } else {
            artistString += "N/A";
        }
        
        String directorString = "Director(s): ";
        if (this.director != null && this.director.length > 0) {
            for (int i = 0; i < this.director.length; i++) {
                directorString += this.director[i];
                if (i < this.director.length - 1) {
                    directorString += ", ";
                }
            }
        } else {
            directorString += "N/A";
        }
        return "CompactDisc [" + this.id + "]["
            + this.title + "]["
            + this.cost + "]["
            + this.category + "]"
            + "\n" + artistString
            + "\n" + directorString
            + "\nTotal Length: " + this.totalLength() + " seconds"
            + "\n" + tracksString;
    }

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public double getCost() {
		return cost;
	}

	public String[] getArtist() {
		return artist;
	}

	public String[] getDirector() {
		return director;
	}

	public static int getNumberCD() {
		return numberCD;
	}

	public int getTrackCount() {
		return trackCount;
	}
	public void addTrack(Track track) {
	    if (track == null) {
	        System.out.println("Error: Cannot add a null track.");
	        return;
	    }
	    
	    if (trackCount < MAX_TRACK) {
	        tracks[trackCount++] = track;
	        System.out.println("Track '" + track.getTitle() + "' added successfully.");
	    } else {
	        System.out.println("CompactDisc is full. Cannot add track .");
	    }
	}


	public void removeTrack(Track track) {
	    if (track == null) return;

	    for (int i = 0; i < trackCount; i++) {
	        if (tracks[i].equals(track)) { 
	            
	            for (int j = i; j < trackCount - 1; j++) {
	                tracks[j] = tracks[j + 1];
	            }
	            
	            tracks[trackCount - 1] = null; 
	            trackCount--;
	            System.out.println("Track '" + track.getTitle() + "' removed successfully.");
	            return;
	        }
	    }
	    System.out.println("Warning: Track not found in Compact Disc.");
	}
   }
        

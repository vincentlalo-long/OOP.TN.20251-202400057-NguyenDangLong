package com.hust.kstn.models;


public class Book extends Media{
	private int numTokens;
	private BookAuthor[] authors =new BookAuthor[MAX_AUTHORS] ;
	private static final int MAX_AUTHORS=50;
	private int authorsCount;
	
	
	public Book(String title , String category, double cost, int numTokens ,BookAuthor[] authors) {
		super(title,category,cost);
		this.numTokens=numTokens;
		if(authors!=null) {	
			int numberLimitAuthor = Math.min(authors.length, MAX_AUTHORS);
			for (int i=0;i<numberLimitAuthor;i++) {
				this.authors[i] = authors[i];
			}
			this.authorsCount = numberLimitAuthor;
			if(authors.length>MAX_AUTHORS) {
				System.out.println("There too much author . Only the first" + MAX_AUTHORS +" will be add , another will be ignored");
				
			}
		}
		else {
			this.authorsCount=0;
		}
	}

	public int getNumTokens() {
		return numTokens;
	}
	
	public int getAuthorCount() {
		return authorsCount;
	}
	@Override
	public String toString() {
	    String authorsString = "";
	    
	    if (this.authors != null && this.authorsCount > 0) {
	        authorsString = "Authors:\n";
	        for (int i = 0; i < this.authorsCount; i++) {
	            authorsString += "\t" + (i + 1) + ". " + this.authors[i].toString(); 
	        }
	    } else {
	        authorsString = "Authors: N/A";
	    }
	    return super.toString() + "]"
	        + this.numTokens + "]"
	        + "\n" + authorsString;
	}

}

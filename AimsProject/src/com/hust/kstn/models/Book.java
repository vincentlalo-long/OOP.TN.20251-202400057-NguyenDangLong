package com.hust.kstn.models;


public class Book {
	private int id ;
	private String title ;
	private String category ;
	private double cost ;
	private int numTokens;
	private static int numBook=0;
	private BookAuthor[] authors =new BookAuthor[MAX_AUTHORS] ;
	private static final int MAX_AUTHORS=50;
	private int authorsCount;
	
	
	public Book(String title , String category, double cost, int numTokens ,BookAuthor[] authors) {
		this.title=title;
		this.category=category;
		this.cost=cost;
		this.numTokens=numTokens;
		numBook++;
		this.id=numBook;
		if(authors!=null) {
			int numberLimitAuthor = Math.min(authors.length, MAX_AUTHORS);
			for (int i=0;i<numberLimitAuthor;i++) {
				this.authors[i] = authors[i];
			}
			this.authorsCount = numberLimitAuthor;
			if(this.authors.length>MAX_AUTHORS) {
				System.out.println("There too much author . Only the first" + MAX_AUTHORS +" will be add , another will be ignored");
				
			}
		}
		else {
			this.authorsCount=0;
		}
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

	public int getNumTokens() {
		return numTokens;
	}
	
	public int getId() {
		return id;
	}
	
	public int getNumBook() {
		return numBook;
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
	    return "Book [" + this.id + "]["
	        + this.title + "]["
	        + this.cost + "]["
	        + this.category + "]["
	        + this.numTokens + "]"
	        + "\n" + authorsString;
	}

}

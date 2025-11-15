package com.hust.kstn.models;

public class DigitalVideoDisc {
	//Set attribute  class DVD
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	//constructor  DVD all attribute  
	public DigitalVideoDisc(String tittle, String category, String director , int length , double cost) {
		this.title=tittle;
		this.category=category;
		this.director=director;
		this.length=length;
		this.cost=cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs ;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	public String getTitle() {
		return title;
	}
	//constructor  DVD  with title
	public DigitalVideoDisc(String title) {
		this.title=title;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
		//constructor DVD category , cost , title
	public DigitalVideoDisc(String category, String title , double cost) {
		this.title=title;
		this.category=category;
		this.cost=cost;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
		//constructor DVD title , category , director , cost
	public DigitalVideoDisc(String director , String category , String title , double cost) {
		this.title=title;
		this.category=category;
		this.director=director;
		this.cost=cost;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	public int getId() {
		return id;
	}
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
}

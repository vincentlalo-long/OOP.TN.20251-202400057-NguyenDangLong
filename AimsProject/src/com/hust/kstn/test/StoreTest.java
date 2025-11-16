package com.hust.kstn.test;
import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		DigitalVideoDisc dvd_1  = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
		DigitalVideoDisc dvd_2  = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95);
		DigitalVideoDisc dvd_3  = new DigitalVideoDisc("Avengers Endgame", "Action", "Anthony Russo", 181, 29.95);
		DigitalVideoDisc dvd_4  = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 21.50);
		DigitalVideoDisc dvd_5  = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 26.75);
		DigitalVideoDisc dvd_6  = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 18.25);
		
		store.addDVD(dvd_1);
		store.addDVD(dvd_2);
		store.addDVD(dvd_3);
		store.addDVD(dvd_4);
		store.addDVD(dvd_5);
		store.print();
		
		
		store.removeDVD(dvd_1);
		store.print();
		
		store.removeDVD(dvd_6);
		store.print();
		
		

	}
}

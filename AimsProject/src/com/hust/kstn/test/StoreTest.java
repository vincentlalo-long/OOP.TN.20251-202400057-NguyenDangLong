package com.hust.kstn.test;
import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		DigitalVideoDisc dvd_1  = new DigitalVideoDisc("The Lion King", "Animation",19.95,"Roger Allers",87);
		DigitalVideoDisc dvd_2  = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95, "George Lucas", 121);
		DigitalVideoDisc dvd_3  = new DigitalVideoDisc("Avengers Endgame", "Action",29.25, "Anthony Russo", 181);
		DigitalVideoDisc dvd_4  = new DigitalVideoDisc("Titanic", "Romance",21.50, "James Cameron", 195);
		DigitalVideoDisc dvd_5  = new DigitalVideoDisc("Inception", "Science Fiction", 26.75,"Christopher Nolan", 148);
		DigitalVideoDisc dvd_6  = new DigitalVideoDisc("Frozen", "Animation", 18.25,"Chris Buck", 102);
		
		
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

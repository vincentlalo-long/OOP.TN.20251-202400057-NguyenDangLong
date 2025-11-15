package com.hust.kstn;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		DigitalVideoDisc dvd_1  = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
		DigitalVideoDisc dvd_2  = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95);
		DigitalVideoDisc dvd_3  = new DigitalVideoDisc("Avengers Endgame", "Action", "Anthony Russo", 181, 29.95);
		DigitalVideoDisc dvd_4  = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 21.50);
		DigitalVideoDisc dvd_5  = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 26.75);
		DigitalVideoDisc dvd_6  = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 18.25);
		DigitalVideoDisc dvd_7  = new DigitalVideoDisc("Toy Story", "Animation", "John Lasseter", 81, 17.90);
		DigitalVideoDisc dvd_8  = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 27.80);
		DigitalVideoDisc dvd_9  = new DigitalVideoDisc("Interstellar", "Science Fiction", "Christopher Nolan", 169, 28.60);
		DigitalVideoDisc dvd_10 = new DigitalVideoDisc("The Matrix", "Science Fiction", "Lana Wachowski", 136, 25.40);
		DigitalVideoDisc dvd_11 = new DigitalVideoDisc("Joker", "Drama", "Todd Phillips", 122, 23.70);
		DigitalVideoDisc dvd_12 = new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 19.20);
		DigitalVideoDisc dvd_13 = new DigitalVideoDisc("Up", "Animation", "Pete Docter", 96, 18.90);
		DigitalVideoDisc dvd_14 = new DigitalVideoDisc("Coco", "Animation", "Lee Unkrich", 105, 20.40);
		DigitalVideoDisc dvd_15 = new DigitalVideoDisc("Spirited Away", "Animation", "Hayao Miyazaki", 125, 22.50);
		DigitalVideoDisc dvd_16 = new DigitalVideoDisc("Zootopia", "Animation", "Byron Howard", 108, 19.80);
		DigitalVideoDisc dvd_17 = new DigitalVideoDisc("Moana", "Animation", "Ron Clements", 107, 19.95);
		DigitalVideoDisc dvd_18 = new DigitalVideoDisc("Doctor Strange", "Action", "Scott Derrickson", 115, 23.10);
		DigitalVideoDisc dvd_19 = new DigitalVideoDisc("Iron Man", "Action", "Jon Favreau", 126, 24.50);
		DigitalVideoDisc dvd_20 = new DigitalVideoDisc("Guardians of the Galaxy", "Action", "James Gunn", 121, 25.30);
		DigitalVideoDisc dvd_21 = new DigitalVideoDisc("Detective Conan","Mystery","Oda",101,20.05);
		
		//Add các dvd vào cart 
		cart.addDVD(dvd_1);
		cart.addDVD(dvd_2);
		cart.addDVD(dvd_3);
		cart.addDVD(dvd_4);
		cart.addDVD(dvd_5);
		cart.addDVD(dvd_6);
		cart.addDVD(dvd_7);
		cart.addDVD(dvd_8);
		cart.addDVD(dvd_9);
		cart.addDVD(dvd_10);
		cart.addDVD(dvd_11);
		cart.addDVD(dvd_12);
		cart.addDVD(dvd_13);
		cart.addDVD(dvd_14);
		cart.addDVD(dvd_15);
		cart.addDVD(dvd_16);
		cart.addDVD(dvd_17);
		cart.addDVD(dvd_18);
		cart.addDVD(dvd_19);
		cart.addDVD(dvd_20); 

		// In ra thông báo khi add đĩa và xem trong đĩa
		cart.calculateTotalCost();
		cart.print();
		
		
		//Xóa 1 DVD và in lại danh sách 
		cart.removeDVD(dvd_2);
		cart.calculateTotalCost();
		cart.print(); 
		
		
		// Thêm lại đĩa 
		cart.addDVD(dvd_2);
		
		// Khi add thêm 1 đĩa vào Cart khi đầy 
		cart.addDVD(dvd_21);
		 
		// Xóa 1 DVD không có 
		cart.removeDVD(dvd_21);
		cart.calculateTotalCost();
		cart.print();
		
		// Xóa DVD khi rỗng 
		//cart.removeDVD(dvd_1);
	}

}


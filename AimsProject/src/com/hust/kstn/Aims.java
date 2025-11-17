package com.hust.kstn;
import com.hust.kstn.models.Cart; 
import com.hust.kstn.models.DigitalVideoDisc;
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		DigitalVideoDisc dvd_1  = new DigitalVideoDisc("The Lion King", "Animation",19.95, "Roger Allers", 87);
		DigitalVideoDisc dvd_2  = new DigitalVideoDisc("Star Wars", "Science Fiction",24.95, "George Lucas", 121);
		DigitalVideoDisc dvd_3  = new DigitalVideoDisc("Avengers Endgame", "Action", 29.95,"Anthony Russo", 181);
		DigitalVideoDisc dvd_4  = new DigitalVideoDisc("Titanic", "Romance",21.50, "James Cameron", 195);
		DigitalVideoDisc dvd_5  = new DigitalVideoDisc("Inception", "Science Fiction",26.75, "Christopher Nolan", 148);
		DigitalVideoDisc dvd_6  = new DigitalVideoDisc("Frozen", "Animation",18.25, "Chris Buck", 102);
		DigitalVideoDisc dvd_7  = new DigitalVideoDisc("Toy Story", "Animation",17.90, "John Lasseter", 81);
		DigitalVideoDisc dvd_8  = new DigitalVideoDisc("The Dark Knight", "Action", 27.80,"Christopher Nolan", 152);
		DigitalVideoDisc dvd_9  = new DigitalVideoDisc("Interstellar", "Science Fiction",28.60, "Christopher Nolan", 169);
		DigitalVideoDisc dvd_10 = new DigitalVideoDisc("The Matrix", "Science Fiction",25.40, "Lana Wachowski", 136);
		DigitalVideoDisc dvd_11 = new DigitalVideoDisc("Joker", "Drama",23.70, "Todd Phillips", 122);
		DigitalVideoDisc dvd_12 = new DigitalVideoDisc("Finding Nemo", "Animation",19.20, "Andrew Stanton", 100);
		DigitalVideoDisc dvd_13 = new DigitalVideoDisc("Up", "Animation", 18.90,"Pete Docter", 96);
		DigitalVideoDisc dvd_14 = new DigitalVideoDisc("Coco", "Animation",20.40, "Lee Unkrich", 105);

		
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
		 

		cart.calculateTotalCost();
		cart.print();
		
		//Xóa 1 DVD và in lại danh sách 
		/*cart.removeDVD(dvd_2);
		cart.calculateTotalCost();
		cart.print();*/ 
		
		// Thêm lại đĩa 
		//cart.addDVD(dvd_2);
		
		// Khi add thêm 1 đĩa vào Cart khi đầy 
		cart.addDVD(dvd_14);
		 
		// Xóa 1 DVD không có 
		cart.removeDVD(dvd_13);
		cart.calculateTotalCost();
		cart.print();
		
		// Xóa DVD khi rỗng 
		//cart.removeDVD(dvd_1);
		
		//Test hàm thêm 2 đĩa 
		//cart.addDVD(dvd_16, dvd_17);
		//cart.print();
		
		//Test hàm thêm một mảng hoặc các danh sách đĩa 
		//cart.addDVD(dvd_15,dvd_18,dvd_19,dvd_20);
		//cart.print();
		 
		// Hàm test biến classifier , instance member quản lý id
		System.out.println("Total number of DVDs: " + DigitalVideoDisc.getNbMedias());

        System.out.println("DVD1 ID: " + dvd_1.getId());
        System.out.println("DVD2 ID: " + dvd_2.getId());
        System.out.println("DVD3 ID: " + dvd_8.getId());
	}

}


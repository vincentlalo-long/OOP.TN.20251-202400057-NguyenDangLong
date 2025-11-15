package com.hust.kstn.models;

public class Cart {
	private DigitalVideoDisc[] itemsInCart=new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int quantityOrder=0;
	private static final int MAX_NUMBER_ORDERED =20;
	
	public void addDVD(DigitalVideoDisc disc) {
		if(quantityOrder < MAX_NUMBER_ORDERED) {
			itemsInCart[quantityOrder++]=disc;
			System.out.println("The disc has been added sucessfully");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2 ) {
		addDVD(disc1);
		addDVD(disc2);
	}
	/*public void addDVD(DigitalVideoDisc[] discs) {
		if (discs == null) return ;
		for(DigitalVideoDisc disc : discs) {
			addDVD(disc);
		}
	} */
	public void addDVD(DigitalVideoDisc... discs) {
		for(DigitalVideoDisc disc : discs) {
			addDVD(disc);
		}
	}
	public void removeDVD(DigitalVideoDisc disc) {
		if (quantityOrder<=0) {
			System.out.println("The cart is empty");
			return;
		}
		else {
			int found=0;
			for(int i=0;i<quantityOrder;i++) {
				if(itemsInCart[i]==disc) {
					for(int j=i;j<quantityOrder-1;j++) {
						itemsInCart[j]=itemsInCart[j+1];
					}
					quantityOrder-=1;
					found=1;
					System.out.println("The disc has been removed sucessfully");
					return;
				}
			}
			if(found==0) {
				System.out.println("The disc does not exist");
			}
			
		}
		
	}
	
	public double calculateTotalCost() {
	    double totalCost = 0;
	    for (int i = 0; i < quantityOrder; i++) {
	        totalCost += itemsInCart[i].getCost();
	    }
	    return totalCost;
	}

	
	public void print() {
	    System.out.println("===Total items in Cart : " + quantityOrder + "===");
	    System.out.println("===All items in Cart ===");
	    for (int i = 0; i < quantityOrder; i++) {
	        DigitalVideoDisc item = itemsInCart[i];
	        System.out.println("[Title] : " + item.getTitle() + ", [Cost] : " + item.getCost() + "\n");
	    }
	    double totalCost = calculateTotalCost();
	    System.out.println("===========================");
	    System.out.println("Total cost in cart: " + totalCost);
}
}
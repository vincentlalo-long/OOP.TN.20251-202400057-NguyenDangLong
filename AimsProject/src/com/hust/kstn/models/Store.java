package com.hust.kstn.models;

public class Store {
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_DVD];
	private static int MAX_ITEMS_DVD=100;
	private int quantityStore=0;
	
	public void addDVD(DigitalVideoDisc disc) {
		if(quantityStore >=MAX_ITEMS_DVD) {
			System.out.println("Full Items in the Store . Cannot add another DVD");
			return;
		}
		itemsInStore[quantityStore++]=disc;
		System.out.println("The disc has been added succesfully to the store");
		
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (quantityStore<=0) {
			System.out.println("The store is empty! Cannot remove");
			return;
		}
		else {
			int found=0;
			for(int i=0;i<quantityStore;i++) {
				if(itemsInStore[i]==disc) {
					for(int j=i;j<quantityStore-1;j++) {
						itemsInStore[j]=itemsInStore[j+1];
					}
					quantityStore-=1;
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
	public void print() {
        System.out.println("=========================THE CURRENT CART ====================");
        if (quantityStore == 0)
            System.out.println("The store is empty");
        else {
            System.out.println("Total items: " + quantityStore);
            for (DigitalVideoDisc disc : itemsInStore)
                if (disc != null)
                    System.out.println("- " + disc.toString());
        }
        System.out.println("==============================================================");
    }
}



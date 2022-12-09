package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	//	Total Cost of Card
	public float totalCost() {
		float total = 0;
		for(Media m: itemsOrdered) {
			total += m.getCost();
		}
		return total;
	}
	// Add Media to Cart
	public void addMedia(Media m) {
		int size = itemsOrdered.size();
		if(size != 20) {
			itemsOrdered.add(m);
			System.out.println("The media has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	// Remove Media to Cart	
	public void removeMedia(Media m) {
		for(Media media: itemsOrdered) {
			if(media.getTitle() == m.getTitle()) {
				itemsOrdered.remove(m);
				System.out.println("The disc has been removed");
			}
		}
	}
	// Search by ID	
	public boolean search(int id) {
		for(Media m: itemsOrdered) {
			if(m.getId() == id) {
				return true;
			}
		}
		return false;
	}
	// Search by Title
	public boolean search(String title) {
		for(Media m: itemsOrdered) {
			if(m.getTitle() == title) {
				return true;
			}
		}
		return false;
	}
	// Print Cart
	public void printCart() {
		System.out.println("***********************CART***********************");
		int i = 1;
		for(Media m: itemsOrdered) {
			System.out.println((i) + ".DVD - " + m.getTitle() + " - " + 
					m.getCategory() + " - " + 
					m.getTitle() + " - " + 
//					m.getDirector() + " - " + 
//					m.getLength() + " : " + 
					m.getCost());
			i++;
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	public void printLength() {
		System.out.println(itemsOrdered.size());
	}
}

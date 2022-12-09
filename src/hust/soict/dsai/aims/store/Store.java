package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	public static final int MAX_NUMBERS_DVD = 100;
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
// 	Add Media to Store
	public void addMedia(Media m) {
		int size = itemsInStore.size();
		if(size != 100) {
			itemsInStore.add(m);
			System.out.println("The media has been added");
		}
		else {
			System.out.println("The store is almost full");
		}
	}
//	Remove Media to Store
	public void removeMedia(Media m) {
		for(Media media: itemsInStore) {
			if(media.getTitle() == m.getTitle()) {
				itemsInStore.remove(m);
				System.out.println("The disc has been removed");
			}
		}
	}
	
	public boolean search(int id) {
		for(Media m: itemsInStore) {
			if(m.getId() == id) {
				return true;
			}
		}
		return false;
	}
	// Search by Title
	public boolean search(String title) {
		for(Media m: itemsInStore) {
			if(m.getTitle() == title) {
				return true;
			}
		}
		return false;
	}
	public void printStore() {
		System.out.println("***********************STORE***********************");
		int i = 1;
		for(Media m: itemsInStore) {
			System.out.println((i) + ".DVD - " + m.getTitle() + " - " + 
					m.getCategory() + " - " + 
					m.getTitle() + " - " + 
//					m.getDirector() + " - " + 
//					m.getLength() + " : " + 
					m.getCost());
			i++;
		}
		System.out.println("***************************************************");
	}
}

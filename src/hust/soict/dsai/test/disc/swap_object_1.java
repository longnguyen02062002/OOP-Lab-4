package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class swap_object_1 {
//	Method swap 1
	public static void change_1(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		// Swap title of Disc	
		String title1 = dvd1.getTitle();
		String title2 = dvd2.getTitle();
		dvd1.setTitle(title2);
		dvd2.setTitle(title1);
		
		// Swap category of Disc
		String category1 = dvd1.getCategory();
		String category2 = dvd2.getCategory();
		dvd1.setCategory(category1);
		dvd2.setCategory(category2);
		
		// Swap director of Disc		
		String director1 = dvd1.getDirector();
		String director2 = dvd2.getDirector();
		dvd1.setDirector(director1);
		dvd2.setDirector(director2);
		
		// Swap length of Disc		
		int length1 = dvd1.getLength();
		int length2 = dvd2.getLength();
		dvd1.setLength(length1);
		dvd2.setLength(length2);
		
		// Swap cost of Disc		
		float cost1 = dvd1.getCost();
		float cost2 = dvd2.getCost();
		dvd1.setCost(cost1);
		dvd2.setCost(cost2);
	}
}

package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderalla");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
		
//		Swap 1.
//		swap_object_1 tmp = new swap_object_1();
//		tmp.change_1(jungleDVD, cinderellaDVD);
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
//		Swap 2.
//		swap_object_2 obj1 = new swap_object_2(jungleDVD);
//		swap_object_2 obj2 = new swap_object_2(cinderellaDVD);
//		change_2(obj1, obj2);
//		System.out.println("jungle dvd title: " + obj1.c.getTitle());
//		System.out.println("cinderella dvd title: " + obj2.c.getTitle());
	}
	
//	Method swap object 2
	public static void change_2(swap_object_2 obj1, swap_object_2 obj2) {
		DigitalVideoDisc tmp = obj1.c;
		obj1.c = obj2.c;
		obj2.c = tmp;
	}
	
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}

package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	
	public Disc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Disc(String title) {
		super(title);
	}
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	
	@Override
	public void setArtist(String artist) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getArtist() {
		// TODO Auto-generated method stub
		return null;
	}
}

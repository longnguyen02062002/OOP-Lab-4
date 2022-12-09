package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompactDisc extends Disc implements Playable{
	String artist;
	List<Track> tracks = new ArrayList<Track>();
	public CompactDisc() {
		// TODO Auto-generated constructor stub
		super();
	}
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	// Add Track	
	public void addTrack(Track track) {
		for(Track t: tracks) {
			if(t.getTitle() == track.getTitle()) {
				System.out.println("The track already exists");
				return;
			}
		}
		System.out.println("The track has been added");
		tracks.add(track);
	}
	// Remove Track	
	public void removeTrack(Track track) {
		boolean k = false;
		for(Track t: tracks) {
			if(t.getTitle() == track.getTitle()) {
				k = true;
				break;
			}
		}
		if(k) {
			System.out.println("The track has been removed");
			tracks.remove(track);			
		}
		else {
			System.out.println("The track does not exist");
		}
	}
	
	public int getLength() {
		int total_length = 0;
		for(Track t: tracks) {
			total_length += t.getLength();
		}
		return total_length;
	}
	@Override
	public void play() {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		if(this.getLength()<=0) {
			System.out.println("ERROR: CDlength is 0");
			s.close();
			return;
		}
		System.out.println("List Track: ");
		int i = 1;
		for(Track t: tracks) {
			System.out.println(i + t.getTitle());
			i++;
		}
		System.out.println();
		System.out.print("Choose the Track: ");
		int k = s.nextInt();
		if(k < (i-1)) {
			System.out.println("Playing CD: "+tracks.get(k-1).getTitle());
			System.out.println("CD length: "+tracks.get(k-1).getLength());
			s.close();
			return;
		}
		else {
			System.out.println("Does not exist. Please re-enter");
			k = s.nextInt();
		}
		System.out.println("Playing CD: "+tracks.get(k-1).getTitle());
		System.out.println("CD length: "+tracks.get(k-1).getLength());
		s.close();
	}
}

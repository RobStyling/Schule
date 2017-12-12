package moelrobi.schule;

import java.util.ArrayList;

public class Notizbuch {
	
	public static ArrayList<String> notes = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNote("Testing");
		addNote("TestingTwo");
		addNote("TestingThree");
		getAllNotes();
		getLatestNote();
		getFirstNote();
		deleteAllNotes();
	}
	
	public static void addNote(String newNote) {
		notes.add(newNote);
	}
	
	public static void getAllNotes() {
		for(int i = 0; i < notes.size(); i++) {
			System.out.println(notes.get(i));
		}
	}
	
	public static void getLatestNote() {
		System.out.println(notes.get(notes.size() - 1));
	}
	
	public static void getFirstNote() {
		System.out.println(notes.get(0));
	}
	
	public static void deleteAllNotes() {
		notes.clear();
	}

}

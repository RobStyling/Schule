package moelrobi.schule.notizbuch;

import java.util.ArrayList;
import java.util.Scanner;

public class Notizbuch {
	
	public static ArrayList<Notiz> notes = new ArrayList<Notiz>();
	
	public static void main(String[] args) {
		notizAnlegen();
		neueNotiz(0, "Hallo", "Eine sehr coole Notiz!");
		neueNotiz(11, "Lmao", "Wunderschön");
		neueNotiz(22, "SuperGeil", "Diese Notiz ist Super Geil!");
		neueNotiz(283, "Test für die Suche", "Das ist eine Such Notiz");
		neueNotiz(33, "lol", "lol");
		letzteNotiz();
		ersteNotiz();
		getAllNotes();
		searchNote(283);
		deleteAllNotes();
		searchNote(283);
	}
	
	public static void neueNotiz(int newNum, String titel, String text) {
		notes.add(new Notiz(newNum, titel, text));
	}
	
	public static void letzteNotiz() {
		System.out.println("Nummer:" + notes.get(notes.size() - 1).getNummer());
		System.out.println("Titel:" + notes.get(notes.size() - 1).getTitel());
		System.out.println("Text:" + notes.get(notes.size() - 1).getText());
	}
	
	public static void ersteNotiz() {
		System.out.println("Nummer: " + notes.get(0).getNummer());
		System.out.println("Titel: " + notes.get(0).getTitel());
		System.out.println("Text: " + notes.get(0).getText());
	}
	
	public static void deleteAllNotes() {
		notes.clear();
	}
	
	public static void getAllNotes() {
		for(int i = 0; i < notes.size(); i++) {
			System.out.println("Nummer: " + notes.get(i).getNummer());
			System.out.println("Titel: " + notes.get(i).getTitel());
			System.out.println("Text: " + notes.get(i).getText());
		}
	}
	
	public static void searchNote(int number) {
		boolean s = search(number);
		if(s == false) {
			System.out.println("Keine Resultate gefunden!");
		}
	}
	
	private static boolean search(int num) {
		for(int i = 0; i < notes.size() - 1; i++) {
			if(notes.get(i).getNummer() == num) {
				System.out.println("Nummer: " + notes.get(i).getNummer());
				System.out.println("Titel: " + notes.get(i).getTitel());
				System.out.println("Text: " + notes.get(i).getText());
				return true;
			}
		}
		return false;
	}
	
	public static void notizAnlegen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie die Nummer ein!");
		String x = sc.next();
		int num = Integer.parseInt(x);
		System.out.println("Bitte geben sie einen Titel ein!");
		String titel = sc.next();
		System.out.println("Bitte geben sie den Text ein!");
		String text = sc.next();
		notes.add(new Notiz(num, titel, text));
		sc.close();
	}

}

package moelrobi.schule.notizbuch;

import java.util.ArrayList;
import java.util.Scanner;

public class Notizbuch {
	
	//Die ArrayListe.
	public static ArrayList<Notiz> notes = new ArrayList<Notiz>();
	
	public static void main(String[] args) {
		notizAnlegen();
		editNote();
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
		ArrayList<Notiz> s = search(number);
		if(s.isEmpty()) {
			System.out.println("Keine Resultate gefunden!");
		}
		else {
			for(int i = 0; i < s.size(); i++) {
				System.out.println("Nummer: " + s.get(i).getNummer());
				System.out.println("Titel: " + s.get(i).getTitel());
				System.out.println("Text: " + s.get(i).getText());
			}
		}
	}
	
	public static void editNote() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte gebe die Nummer ein zum editieren!");
		String x = sc.next();
		int num = Integer.parseInt(x);
		ArrayList<Notiz> res = search(num);
		if(res.isEmpty()) {
			System.out.println("Wir konnten keine Resultate finden.");
		}
		else {
			for(int i = 0; i < res.size(); i++) {
				String oldTitel = res.get(i).getTitel();
				System.out.println("Gebe bitte eine neue Nummer für Notiz ein: " + oldTitel);
				String xx = sc.next();
				int nuum = Integer.parseInt(xx);
				res.get(i).setNummer(nuum);
				System.out.println("Gebe bitte einen neuen Titel für Notiz ein: " + oldTitel);
				String newTitel = sc.next();
				res.get(i).setTitel(newTitel);
				System.out.println("Gebe bitte einen neuen Text für Notiz ein: " + oldTitel);
				String newText = sc.next();
				res.get(i).setText(newText);
			}
		}
	}
	
	private static ArrayList<Notiz> search(int num) {
		ArrayList<Notiz> searchNotes = new ArrayList<Notiz>();
		for(int i = 0; i < notes.size(); i++) {
			if(notes.get(i).getNummer() == num) {
				searchNotes.add(notes.get(i));
			}
		}
		return searchNotes;
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
		neueNotiz(num, titel, text);
	}
	
	public static void sucheGenau() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte gebe einen genauen Titel ein.");
		String x = sc.next();
		ArrayList<Notiz> res = sucheNachExatemTitel(x);
		for(int i = 0; i < res.size(); i++) {
			System.out.println("Nummer: " + res.get(i).getNummer());
			System.out.println("Titel: " + res.get(i).getTitel());
			System.out.println("Text: " + res.get(i).getText());
		}
	}
	
	public static void sucheUnGenau() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte gebe einen ungenauen Titel ein.");
		String x = sc.next();
		ArrayList<Notiz> res = sucheNachUngefaehrenTitel(x);
		for(int i = 0; i < res.size(); i++) {
			System.out.println("Nummer: " + res.get(i).getNummer());
			System.out.println("Titel: " + res.get(i).getTitel());
			System.out.println("Text: " + res.get(i).getText());
		}
	}
	
	private static ArrayList<Notiz> sucheNachExatemTitel(String titel) {
		ArrayList<Notiz> results = new ArrayList<Notiz>();
		for(int i = 0; i < notes.size(); i++) {
			if(notes.get(i).getTitel().equals(titel)) {
				results.add(notes.get(i));
			}
		}
		return results;
	}
	
	private static ArrayList<Notiz> sucheNachUngefaehrenTitel(String titel) {
		ArrayList<Notiz> results = new ArrayList<Notiz>();
		for(int i = 0; i < notes.size(); i++) {
			if(notes.get(i).getTitel().equalsIgnoreCase(titel)) {
				results.add(notes.get(i));
			}
		}
		return results;
	}

}

package moelrobi.schule.notizbuch;

import java.util.ArrayList;
import java.util.Scanner;

public class Notizbuch {
	
	public static ArrayList<Notiz> notes = new ArrayList<Notiz>();
	
	public static void main(String[] args) {
		notizAnlegen();
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
	}
	
	public static void sucheGenau() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte gebe einen genauen Titel ein.");
		String x = sc.next();
		ArrayList<Notiz> res = sucheNachExatemTitel(x);
		for(int i = 0; i < res.size(); i++) {
			System.out.println("Nummer: " + notes.get(i).getNummer());
			System.out.println("Titel: " + notes.get(i).getTitel());
			System.out.println("Text: " + notes.get(i).getText());
		}
	}
	
	public static void sucheUnGenau() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte gebe einen ungenauen Titel ein.");
		String x = sc.next();
		ArrayList<Notiz> res = sucheNachUngefaehrenTitel(x);
		for(int i = 0; i < res.size(); i++) {
			System.out.println("Nummer: " + notes.get(i).getNummer());
			System.out.println("Titel: " + notes.get(i).getTitel());
			System.out.println("Text: " + notes.get(i).getText());
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

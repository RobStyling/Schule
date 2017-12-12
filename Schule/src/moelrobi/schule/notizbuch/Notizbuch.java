package moelrobi.schule.notizbuch;

import java.util.ArrayList;

public class Notizbuch {
	
	public static ArrayList<Notiz> notes = new ArrayList<Notiz>();
	
	public static void main(String[] args) {
		notes.add(new Notiz(1, "Test", "Test"));
		letzteNotiz();
	}
	
	public static void letzteNotiz() {
		System.out.println("Nummer:" + notes.get(notes.size() - 1).getNummer());
		System.out.println("Titel:" + notes.get(notes.size() - 1).getTitel());
		System.out.println("Text:" + notes.get(notes.size() - 1).getText());
	}

}

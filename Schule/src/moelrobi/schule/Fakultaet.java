package moelrobi.schule;

/**
 * @author moelrobi
 * Diese Aufgabe ist im Zusammenhang mit der Aufgabe 4. im Thema: "Kontrollstrukturen"
 */
public class Fakultaet {

	public static void main(String[] args) {
		System.out.println(berechneFakultaet(5555));
	}
	
	public static long berechneFakultaet(long n) {
		if (n > 1) {
			return(n * berechneFakultaet(n - 1));
		}
		else {
			return 1;
		}
	}

}

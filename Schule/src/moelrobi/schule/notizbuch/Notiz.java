package moelrobi.schule.notizbuch;

public class Notiz {
	
	public Notiz(int n, String Titel, String Text) {
		this.titel = Titel;
		this.text = Text;
		this.nummer = n;
	}
	
	private String titel;
	private String text;
	private int nummer;
	
	public String getTitel() {
		return titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int getNummer() {
		return nummer;
	}
	
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
}

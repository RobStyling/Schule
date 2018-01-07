package moelrobi.schule;

public class Bundesliga {
	
	public String[] vereine = new String[18];
	private int i = 0;
	
	public Bundesliga(boolean testing) {
		if(testing == true) {
			vereine[0] = "Der erste Verein!";
			vereine[1] = "Der zweite Verein!";
			vereine[2] = "Der dritte Verein!";
			i = 3;
		} 
	}
	
	public void add(String verein) {
		vereine[i] = verein;
		i++;
	}
	
	public String get(int x) {
		return vereine[x];
	}
	
	public int getSize() {
		int l = 0;
		for(int s = 0; s > vereine.length; s++) {
			if(vereine[s] != null) {
				l++;
			}
		}
		return l;
	}
	
	public void clear() {
		vereine = new String[18];
		i = 0;
	}
	
	public static void main(String[] args) {
		Bundesliga bund = new Bundesliga(false);
		System.out.println(bund.vereine.length);
	}

}

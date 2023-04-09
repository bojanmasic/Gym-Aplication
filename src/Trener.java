import java.util.ArrayList;

public class Trener {
	private String ime;
	private String prezime;
	private int broj;
	private int godine;
	private boolean pol;
	private double cena;
	private ArrayList<Trener> t;
	private int brClan = 1;

	public int brojClanova() {
		return brClan++;
	}

	public int sigurniClanovi() {
		return brClan;
	}

	public double zarada() {
		return (brClan - 1) * cena;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public boolean isPol() {
		return pol;
	}

	public void setPol(boolean pol) {
		this.pol = pol;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public ArrayList<Trener> getT() {
		return t;
	}

	public void setT(ArrayList<Trener> t) {
		this.t = t;
	}

	@Override
	public String toString() {
		String p = pol ? "Muski" : "Zenski";
		return "Trener: " + ime + " " + prezime + "\nBroj telefona: " + broj + "\nGodiste: " + godine + "\nPol: " + p
				+ "\nCena treninga (mesecna): " + cena + "\n\n";
	}

	public Trener(String ime, String prezime, int broj, int godine, boolean pol, double cena) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.broj = broj;
		this.godine = godine;
		this.pol = pol;
		this.cena = cena;
	}

	public Trener() {
		super();
	}

}

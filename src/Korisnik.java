import java.util.ArrayList;
import java.util.Arrays;

public class Korisnik {
	private String ime;
	private String prezime;
	private int broj;
	private int godine;
	private int clBr;
	private boolean pol;
	private String tip, tr;
	private Placanje a[];

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

	public String getTr() {
		return tr;
	}

	public void setTr(String tr) {
		this.tr = tr;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getTip() {
		return tip;
	}

	public Placanje[] getA() {
		return a;
	}

	public void setA(Placanje[] a) {
		this.a = a;
	}

	public int getClBr() {
		return clBr;
	}

	public void setClBr(int clBr) {
		this.clBr = clBr;
	}

	public Korisnik(String ime, String prezime, int broj, int godine, int clBr, boolean pol, String tip, String tr,
			Placanje[] a) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.broj = broj;
		this.godine = godine;
		this.clBr = clBr;
		this.pol = pol;
		this.tip = tip;
		this.tr = tr;
		this.a = a;
	}

	public Korisnik() {
		super();
	}

	@Override
	public String toString() {
		String p = pol ? "Muski" : "Zenski";
		return "Korisnik: " + ime + " " + prezime + "\nBroj telefona: " + broj + "\nGodiste: " + godine + "\nPol: " + p
				+ "\nTip: " + tip + "\nTrener: " + tr + "\n\n";
	}

}

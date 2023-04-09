import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tableKorisnik extends AbstractTableModel {

	ArrayList<Korisnik> lista;

	public tableKorisnik(ArrayList<Korisnik> lista) {
		this.lista = lista;
	}

	@Override
	public int getColumnCount() {
		return 7;
	}

	@Override
	public int getRowCount() {
		return lista.size();
	}

	@Override
	public Object getValueAt(int row, int c) {
		Korisnik r = lista.get(row);
		switch (c) {
		case 0:
			return r.getIme();
		case 1:
			return r.getPrezime();
		case 2:
			return r.getBroj();
		case 3:
			return r.getClBr();
		case 4:
			return r.getGodine();
		case 5:
			return r.getTr();
		case 6:
			return r.getTip();
		default:
			return "Greska!";
		}
	}

	@Override
	public String getColumnName(int c) {
		switch (c) {
		case 0:
			return "Ime";
		case 1:
			return "Prezime";
		case 2:
			return "Broj telefona";
		case 3:
			return "Clanski broj";
		case 4:
			return "Godiste";
		case 5:
			return "Trener";
		case 6:
			return "Tip";
		default:
			return "Greska!";
		}
	}

	// ova metoda nije overrideovana
	// sluzi za resetovanje tabele, tj. uklanjanje prikaza u tabeli
	// brise elemente iz liste, a zatim resetuje prikaz sa novim podacima
	// posto su novi podaci null(prazna lista) onda se
//u tabeli nece nista prikazati
//metoda fireTableDataChanged sluzi za osvezavanje tabele
//koristi se kada se promene podaci za prikaz, da bi se 
//promene videle i na tabeli
//ova metoda je ugradjena u model
	public void removeAllElements() {
		lista.clear();
		fireTableDataChanged();
	}

	// overrideovana metoda
	// sluzi za omogucavanje editovanja vrednosti u tabeli
	// po defaultu sve je false odnosno nije omogucen edit celija
	@Override
	public boolean isCellEditable(int r, int c) {
		switch (c) {
		case 0:
			return true;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		default:
			return false;
		}
	}

	// pored prethodne metode, da bi editovanje bilo kompletno
	// potrebno je overrideovati i setValueAt metodu
	// ona sluzi za cuvanje izmena izvrsenih preko tabele u podacima
	// za svaku editable kolonu potrebno je definisati gde se cuva izmenjena
	// vrednost u listi
	// prvi parametar value je vrednost koju je korisnik uneo
	// metoda fireTableRowsUpdated je slicna fireTableDataChanged metodi
	// samosto resetuje samo jednu deo umesto cele tabele
	@Override
	public void setValueAt(Object value, int rowIndex, int colIndex) {
		Korisnik r = lista.get(rowIndex);
		switch (colIndex) {
		case 0:
			r.setIme(value.toString());
			break;
		case 1:
			r.setPrezime(value.toString());
			break;
		case 2:
			r.setBroj(Integer.parseInt(value.toString()));
			break;
		case 3:
			r.setGodine(Integer.parseInt(value.toString()));
			break;
		case 4:
			r.setTr(value.toString());
			break;
		case 5:
			r.setTip(value.toString());
			break;
		}
		fireTableRowsUpdated(rowIndex, colIndex);
	}

	// custom metoda, nije overrideovana
	// sluzi za brisanje selektovanog reda u tabeli
	// selektovan red se izbrise iz liste i zatim se osveze podaci u tabeli
	public void removeRow(int row) {
		lista.remove(row);
		fireTableDataChanged();
	}
}

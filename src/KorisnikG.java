import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class KorisnikG extends JFrame {

	private JPanel contentPane;
	private JTextField textIme;
	private JTextField textGodiste;
	private JTextField textPrezime;
	private JTextField textBroj;
	public static ArrayList<Korisnik> korisnik = new ArrayList<>();
	private JTable tableKorisnik;
	private JTextField textClanski;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KorisnikG frame = new KorisnikG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static int brr = 2;

	public static int brojac() {
		brr = brr + 1;
		return brr;
	}

	public KorisnikG() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(48, 48, 48));
		panel.setForeground(Color.BLUE);
		panel.setBounds(0, 0, 171, 551);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnPlacanje = new JButton("PLACANJE");
		btnPlacanje.setForeground(new Color(217, 217, 217));
		btnPlacanje.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnPlacanje.setBackground(new Color(255, 255, 255));
		btnPlacanje.setBorderPainted(false);
		btnPlacanje.setContentAreaFilled(false);
		btnPlacanje.setFocusPainted(false);
		btnPlacanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlacanjeG pg = new PlacanjeG();
				pg.show();
				dispose();
			}
		});
		btnPlacanje.setIcon(new ImageIcon("Images\\pl.png"));
		btnPlacanje.setBounds(-41, 288, 242, 110);
		panel.add(btnPlacanje);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("Images\\logo.png"));
		lblNewLabel_1.setBounds(-46, 25, 207, 91);
		panel.add(lblNewLabel_1);

		JButton btnTrener = new JButton("TRENER");
		btnTrener.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TrenerG tg = new TrenerG();
				tg.show();
				dispose();
			}
		});
		btnTrener.setIcon(new ImageIcon("Images\\trn.png"));
		btnTrener.setForeground(new Color(217, 217, 217));
		btnTrener.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnTrener.setFocusPainted(false);
		btnTrener.setContentAreaFilled(false);
		btnTrener.setBorderPainted(false);
		btnTrener.setBackground(Color.WHITE);
		btnTrener.setBounds(-41, 172, 242, 110);
		panel.add(btnTrener);

		JButton btnStatistika = new JButton("STATISTIKA");
		btnStatistika.setBounds(-31, 411, 212, 110);
		panel.add(btnStatistika);
		btnStatistika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StatistikaG sg = new StatistikaG();
				sg.show();
				dispose();
			}
		});
		btnStatistika.setIcon(new ImageIcon("Images\\stats.png"));
		btnStatistika.setForeground(new Color(217, 217, 217));
		btnStatistika.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnStatistika.setFocusPainted(false);
		btnStatistika.setContentAreaFilled(false);
		btnStatistika.setBorderPainted(false);
		btnStatistika.setBackground(Color.WHITE);

		JLabel lblNewLabel_2 = new JLabel("IME:");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(229, 31, 60, 26);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("BROJ TELEFONA:");
		lblNewLabel_2_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_1.setBounds(624, 31, 160, 26);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("GODISTE:");
		lblNewLabel_2_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_2.setBounds(229, 127, 119, 26);
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("POL:");
		lblNewLabel_2_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_2_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_3.setBounds(420, 127, 108, 26);
		contentPane.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_4 = new JLabel("TRENER:");
		lblNewLabel_2_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_2_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_4.setBounds(624, 127, 119, 26);
		contentPane.add(lblNewLabel_2_4);

		JLabel lblNewLabel_2_5 = new JLabel("PREZIME:");
		lblNewLabel_2_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_5.setBounds(420, 31, 105, 26);
		contentPane.add(lblNewLabel_2_5);
		String nizt[] = new String[TrenerG.t.size()];
		String a;
		int br = 0;
		for (int i = 0; i < TrenerG.t.size(); i++) {
			a = TrenerG.t.get(i).getIme() + " " + TrenerG.t.get(i).getPrezime();
			nizt[br++] = a;

		}

		JComboBox cmbTrener = new JComboBox(nizt);
		cmbTrener.setBackground(Color.LIGHT_GRAY);
		cmbTrener.setBounds(620, 153, 156, 22);
		contentPane.add(cmbTrener);

		textIme = new JTextField();
		textIme.setBackground(Color.LIGHT_GRAY);
		textIme.setBounds(229, 58, 108, 20);
		contentPane.add(textIme);
		textIme.setColumns(10);

		textGodiste = new JTextField();
		textGodiste.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		textGodiste.setBackground(Color.LIGHT_GRAY);
		textGodiste.setColumns(10);
		textGodiste.setBounds(229, 154, 108, 20);
		contentPane.add(textGodiste);

		textPrezime = new JTextField();
		textPrezime.setBackground(Color.LIGHT_GRAY);
		textPrezime.setColumns(10);
		textPrezime.setBounds(420, 58, 108, 20);
		contentPane.add(textPrezime);

		textBroj = new JTextField();
		textBroj.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		textBroj.setBackground(Color.LIGHT_GRAY);
		textBroj.setColumns(10);
		textBroj.setBounds(624, 58, 108, 20);
		contentPane.add(textBroj);

		textClanski = new JTextField();
		textClanski.setEditable(false);
		textClanski.setText("" + (brr - 1));
		textClanski.setBackground(Color.LIGHT_GRAY);
		textClanski.setBounds(229, 214, 108, 20);
		contentPane.add(textClanski);

		JLabel lblNewLabel_2_3_1 = new JLabel("TIP:");
		lblNewLabel_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_3_1.setBackground(Color.WHITE);
		lblNewLabel_2_3_1.setBounds(417, 186, 108, 26);

		contentPane.add(lblNewLabel_2_3_1);
		JRadioButton rdbtnMusko = new JRadioButton("Muski");
		rdbtnMusko.setForeground(new Color(216, 216, 216));
		rdbtnMusko.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnMusko.setFocusPainted(false);
		rdbtnMusko.setContentAreaFilled(false);
		rdbtnMusko.setBorderPainted(false);
		rdbtnMusko.setBounds(407, 151, 70, 23);
		contentPane.add(rdbtnMusko);

		JRadioButton rdbtnZensko = new JRadioButton("Zenski");
		rdbtnZensko.setForeground(new Color(216, 216, 216));
		rdbtnZensko.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnZensko.setFocusPainted(false);
		rdbtnZensko.setContentAreaFilled(false);
		rdbtnZensko.setBorderPainted(false);
		rdbtnZensko.setBounds(475, 152, 70, 23);
		contentPane.add(rdbtnZensko);

		JCheckBox chckTeretana = new JCheckBox("Teretana");
		chckTeretana.setForeground(new Color(216, 216, 216));
		chckTeretana.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckTeretana.setFocusPainted(false);
		chckTeretana.setContentAreaFilled(false);
		chckTeretana.setBorderPainted(false);
		chckTeretana.setBounds(407, 212, 85, 23);
		contentPane.add(chckTeretana);

		JCheckBox chckFitnes = new JCheckBox("Fitnes");
		chckFitnes.setForeground(new Color(216, 216, 216));
		chckFitnes.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckFitnes.setFocusPainted(false);
		chckFitnes.setContentAreaFilled(false);
		chckFitnes.setBorderPainted(false);
		chckFitnes.setBounds(494, 211, 97, 23);
		contentPane.add(chckFitnes);

		JLabel lblNewLabel_2_4_1 = new JLabel("CLANSKI BROJ:");
		lblNewLabel_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_4_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_1.setBounds(228, 189, 143, 26);
		contentPane.add(lblNewLabel_2_4_1);

		ButtonGroup Pol = new ButtonGroup();
		Pol.add(rdbtnZensko);
		Pol.add(rdbtnMusko);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(193, 293, 567, 203);
		scrollPane_1.getViewport().setBackground(Color.DARK_GRAY);
		contentPane.add(scrollPane_1);
		tableKorisnik = new JTable();
		tableKorisnik.setForeground(Color.LIGHT_GRAY);
		tableKorisnik.setBackground(Color.DARK_GRAY);
		tableKorisnik.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Ime", "Prezime", "Broj telefona", " Clanski broj ", "Godiste", "Trener", "Tip" }));
		scrollPane_1.setViewportView(tableKorisnik);

		JButton btnUnesi = new JButton("Dodaj korisnika");
		btnUnesi.setBackground(Color.LIGHT_GRAY);
		btnUnesi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ime = null, prezime = null, trener;
				int br;
				int god;
				boolean pol;
				int clBr = 0, kk = 0;
				boolean trt = chckTeretana.isSelected();
				boolean fitnes = chckFitnes.isSelected();
				Placanje a[] = new Placanje[13];
				for (int i = 1; i < 13; i++)
					a[i] = new Placanje(i, false);
				try {
					ime = textIme.getText();
					prezime = textPrezime.getText();
					pol = rdbtnZensko.isSelected();
					if (ime.equals("") || prezime.equals(""))
						throw new Exception("Unesite ime i prezime!");
					br = Integer.parseInt(textBroj.getText());
					god = Integer.parseInt(textGodiste.getText());
					String tip = "";
					if (chckTeretana.isSelected())
						tip = "Teretana";
					if (chckFitnes.isSelected())
						tip = "Fitnes";
					if (chckTeretana.isSelected() && chckFitnes.isSelected())
						tip = "Teretana/Fitnes";
					if (fitnes == false && trt == false)
						throw new Exception("Odaberite tip!");
					trener = cmbTrener.getSelectedItem().toString();
					clBr = Integer.parseInt(textClanski.getText().toString());
					Korisnik k = new Korisnik(ime, prezime, br, god, clBr, pol, tip, trener, a);
					korisnik.add(k);
					kk = (brojac() - 1);
					textClanski.setText("" + kk);
					for (Trener r : TrenerG.t)
						if (trener.compareTo(r.getIme() + " " + r.getPrezime()) == 0)
							r.brojClanova();
					throw new Exception("Uspesan unos korisnika!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage());

				}

				if (fitnes == false && trt == false) {
					chckTeretana.setSelected(false);
					chckFitnes.setSelected(false);
				} else if (ime.equals("") || prezime.equals("")) {
					textIme.setText("");
					textPrezime.setText("");
				} else {
					textGodiste.setText("");
					textBroj.setText("");
					textIme.setText("");
					textPrezime.setText("");
					Pol.clearSelection();
					chckTeretana.setSelected(false);
					chckFitnes.setSelected(false);
				}
			}
		});
		btnUnesi.setBounds(396, 256, 160, 26);
		contentPane.add(btnUnesi);
		JButton btnUnesi2 = new JButton("Prikazi");
		btnUnesi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableKorisnik model = new tableKorisnik(korisnik);
				tableKorisnik.setModel(model);
			}
		});
		btnUnesi2.setBackground(Color.LIGHT_GRAY);
		btnUnesi2.setBounds(396, 507, 160, 26);
		contentPane.add(btnUnesi2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(54, 54, 54));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("Images\\pozUnos.jpg"));
		lblNewLabel.setBounds(169, 0, 615, 551);
		contentPane.add(lblNewLabel);
	}
}

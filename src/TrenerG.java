import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.border.MatteBorder;
import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JScrollPane;

public class TrenerG extends JFrame {

	public static ArrayList<Trener> t = new ArrayList<>();
	private JPanel contentPane;
	private JTextField textIme;
	private JTextField textPrezime;
	private JTextField textBroj;
	private JTextField textGodiste;
	private JTextField textCena;
	private JTable tableTrener;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrenerG frame = new TrenerG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrenerG() {

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

		JButton btnKorisnik = new JButton("KORISNIK");
		btnKorisnik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KorisnikG kg = new KorisnikG();
				kg.show();
				dispose();
			}
		});
		btnKorisnik.setIcon(new ImageIcon("Images\\kor.png"));
		btnKorisnik.setForeground(new Color(217, 217, 217));
		btnKorisnik.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnKorisnik.setFocusPainted(false);
		btnKorisnik.setContentAreaFilled(false);
		btnKorisnik.setBorderPainted(false);
		btnKorisnik.setBackground(Color.WHITE);
		btnKorisnik.setBounds(-41, 172, 242, 110);
		panel.add(btnKorisnik);

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
		lblNewLabel_2.setBounds(229, 31, 555, 26);
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

		JLabel lblNewLabel_2_4 = new JLabel("CENA:");
		lblNewLabel_2_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_2_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_4.setBounds(624, 127, 119, 26);
		contentPane.add(lblNewLabel_2_4);

		JLabel lblNewLabel_2_5 = new JLabel("PREZIME:");
		lblNewLabel_2_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_5.setBounds(420, 31, 364, 26);
		contentPane.add(lblNewLabel_2_5);

		textIme = new JTextField();
		textIme.setBackground(Color.LIGHT_GRAY);
		textIme.setBounds(229, 58, 103, 20);
		contentPane.add(textIme);
		textIme.setColumns(10);

		textPrezime = new JTextField();
		textPrezime.setColumns(10);
		textPrezime.setBackground(Color.LIGHT_GRAY);
		textPrezime.setBounds(420, 58, 103, 20);
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
		textBroj.setColumns(10);
		textBroj.setBackground(Color.LIGHT_GRAY);
		textBroj.setBounds(624, 58, 103, 20);
		contentPane.add(textBroj);

		textGodiste = new JTextField();
		textGodiste.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		textGodiste.setColumns(10);
		textGodiste.setBackground(Color.LIGHT_GRAY);
		textGodiste.setBounds(229, 154, 103, 20);
		contentPane.add(textGodiste);

		textCena = new JTextField();
		textCena.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		textCena.setColumns(10);
		textCena.setBackground(Color.LIGHT_GRAY);
		textCena.setBounds(624, 154, 103, 20);
		contentPane.add(textCena);

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
		rdbtnZensko.setBounds(475, 152, 89, 23);
		contentPane.add(rdbtnZensko);

		ButtonGroup Pol = new ButtonGroup();
		Pol.add(rdbtnZensko);
		Pol.add(rdbtnMusko);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(198, 277, 567, 203);
		scrollPane_1.getViewport().setBackground(Color.DARK_GRAY);
		contentPane.add(scrollPane_1);
		tableTrener = new JTable();
		tableTrener.setBackground(Color.DARK_GRAY);
		tableTrener.setForeground(Color.LIGHT_GRAY);
		tableTrener.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Ime", "Prezime", "Broj telefona", "Cena", "Godine" }));
		scrollPane_1.setViewportView(tableTrener);

		JButton btnUnesi = new JButton("Dodaj trenera");
		btnUnesi.setBackground(Color.LIGHT_GRAY);
		btnUnesi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ime = null, prezime = null;
				int br;
				int god;
				boolean pol;
				double cena;
				try {
					ime = textIme.getText();
					prezime = textPrezime.getText();
					pol = rdbtnZensko.isSelected();
					if (ime.equals("") || prezime.equals(""))
						throw new Exception("Unesite ime i prezime!");
					br = Integer.parseInt(textBroj.getText());
					god = Integer.parseInt(textGodiste.getText());
					cena = Double.parseDouble(textCena.getText());
					Trener t1 = new Trener(ime, prezime, br, god, pol, cena);
					t.add(t1);
					throw new Exception("Uspesan unos trenera!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage());
				}

				if (ime.equals("") || prezime.equals("")) {
					textIme.setText("");
					textPrezime.setText("");
				} else {
					textIme.setText("");
					textPrezime.setText("");
					textBroj.setText("");
					textGodiste.setText("");
					textCena.setText("");
					Pol.clearSelection();
				}

			}
		});
		btnUnesi.setBounds(385, 237, 160, 26);
		contentPane.add(btnUnesi);

		JButton btnPrikazi = new JButton("Prikazi");
		btnPrikazi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableTrener model = new tableTrener(t);
				tableTrener.setModel(model);

			}
		});
		btnPrikazi.setBounds(420, 493, 89, 23);
		contentPane.add(btnPrikazi);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(54, 54, 54));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("Images\\pozUnos.jpg"));
		lblNewLabel.setBounds(169, 0, 615, 551);
		contentPane.add(lblNewLabel);

	}

}

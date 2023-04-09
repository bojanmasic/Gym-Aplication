import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class StatistikaG extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatistikaG frame = new StatistikaG();
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
	public StatistikaG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(48, 48, 48));
		panel.setForeground(Color.BLUE);
		panel.setBounds(0, 0, 180, 551);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnPlacanja = new JButton("PLACANJE");
		btnPlacanja.setForeground(new Color(217, 217, 217));
		btnPlacanja.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnPlacanja.setBackground(new Color(255, 255, 255));
		btnPlacanja.setBorderPainted(false);
		btnPlacanja.setContentAreaFilled(false);
		btnPlacanja.setFocusPainted(false);
		btnPlacanja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlacanjeG pg = new PlacanjeG();
				pg.show();
				dispose();
			}
		});
		btnPlacanja.setIcon(new ImageIcon("Images\\pl.png"));
		btnPlacanja.setBounds(-46, 400, 242, 110);
		panel.add(btnPlacanja);

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

		JButton btnKorisnik = new JButton("KORISNIK");
		btnKorisnik.setBounds(-31, 293, 212, 110);
		panel.add(btnKorisnik);
		btnKorisnik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KorisnikG kg = new KorisnikG();
				kg.show();
				dispose();
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(494, 35, 269, 429);
		contentPane.add(scrollPane);

		JTextArea txtIspis = new JTextArea();
		txtIspis.setText("OVDE SE ISPISUJU PODACI");
		txtIspis.setFont(new Font("Cambria Math", Font.BOLD, 13));
		txtIspis.setForeground(Color.WHITE);
		txtIspis.setBackground(Color.DARK_GRAY);
		scrollPane.setViewportView(txtIspis);

		JLabel lblNewLabel_2 = new JLabel(
				"<html><p>Pretraga koliko korisnika <br> ima na fitnesu,a koliko u teretani?</p><html>");
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(190, 60, 200, 27);
		contentPane.add(lblNewLabel_2);

		JButton btnFitTrt = new JButton("");
		btnFitTrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int br = 0, br1 = 0, br2 = 0;
				try {
					for (int i = 0; i < KorisnikG.korisnik.size(); i++) {
						if (KorisnikG.korisnik.get(i).getTip().equals("Teretana"))
							br++;
						if (KorisnikG.korisnik.get(i).getTip().equals("Fitnes"))
							br1++;
						if (KorisnikG.korisnik.get(i).getTip().equals("Teretana/Fitnes"))
							br2++;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Nema unetih");
				}

				txtIspis.setText("U teretani ima : " + br + " \nNa fitnesu ima : " + br1 + " \nNa oboje ide : " + br2);

			}
		});
		btnFitTrt.setIcon(new ImageIcon("Images\\play.png"));
		btnFitTrt.setBorderPainted(false);
		btnFitTrt.setContentAreaFilled(false);
		btnFitTrt.setFocusPainted(false);
		btnFitTrt.setOpaque(false);
		btnFitTrt.setBackground(Color.GRAY);
		btnFitTrt.setForeground(Color.DARK_GRAY);
		btnFitTrt.setBounds(382, 53, 54, 40);
		contentPane.add(btnFitTrt);

		JLabel lblNewLabel_2_6 = new JLabel("<html><p>Pretraga koji trener<br> ima najvecu mesecnu ratu?</p><html>");
		lblNewLabel_2_6.setToolTipText("");
		lblNewLabel_2_6.setForeground(Color.WHITE);
		lblNewLabel_2_6.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2_6.setBounds(190, 130, 200, 27);
		contentPane.add(lblNewLabel_2_6);

		JButton btnNajvRata = new JButton("");
		btnNajvRata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double max = 0;
				int temp = 0;
				try {
					for (int i = 0; i < TrenerG.t.size(); i++) {
						if (TrenerG.t.get(i).getCena() > max)
							max = TrenerG.t.get(i).getCena();
						temp = i;

					}
					txtIspis.setText(TrenerG.t.get(temp).toString());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Nema unetih");
				}

			}
		});
		btnNajvRata.setIcon(new ImageIcon("Images\\play.png"));
		btnNajvRata.setOpaque(false);
		btnNajvRata.setForeground(Color.DARK_GRAY);
		btnNajvRata.setFocusPainted(false);
		btnNajvRata.setContentAreaFilled(false);
		btnNajvRata.setBorderPainted(false);
		btnNajvRata.setBackground(Color.GRAY);
		btnNajvRata.setBounds(382, 123, 54, 40);
		contentPane.add(btnNajvRata);

		JLabel lblNewLabel_2_1 = new JLabel(
				"<html><p>Prikaz sortiranog spiska <br> prema godinama korisnika?</p><html>");
		lblNewLabel_2_1.setToolTipText("");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2_1.setBounds(190, 200, 200, 27);
		contentPane.add(lblNewLabel_2_1);

		JButton btnSortKli = new JButton("");
		btnSortKli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < KorisnikG.korisnik.size(); i++)
					for (int j = i + 1; j < KorisnikG.korisnik.size(); j++)
						if (KorisnikG.korisnik.get(i).getGodine() < KorisnikG.korisnik.get(j).getGodine()) {
							Korisnik pom = KorisnikG.korisnik.get(i);
							Korisnik pom1 = KorisnikG.korisnik.get(j);
							KorisnikG.korisnik.set(j, pom);
							KorisnikG.korisnik.set(i, pom1);
						}
				txtIspis.setText("\n" + KorisnikG.korisnik);

			}
		});
		btnSortKli.setIcon(new ImageIcon("Images\\play.png"));
		btnSortKli.setOpaque(false);
		btnSortKli.setForeground(Color.DARK_GRAY);
		btnSortKli.setFocusPainted(false);
		btnSortKli.setContentAreaFilled(false);
		btnSortKli.setBorderPainted(false);
		btnSortKli.setBackground(Color.GRAY);
		btnSortKli.setBounds(382, 193, 54, 40);
		contentPane.add(btnSortKli);

		JLabel lblNewLabel_2_2 = new JLabel("<html><p>Prikaz prihoda teretane </p><html>");
		lblNewLabel_2_2.setToolTipText("");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2_2.setBounds(190, 258, 200, 27);
		contentPane.add(lblNewLabel_2_2);

		JButton btnPrih = new JButton("");
		btnPrih.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = 0;
				for (int i = 0; i < TrenerG.t.size(); i++)
					s = s + TrenerG.t.get(i).zarada() * 0.6;

				txtIspis.setText("\nMesecni prihodi teretane su: " + s);

			}
		});
		btnPrih.setIcon(new ImageIcon("Images\\play.png"));
		btnPrih.setOpaque(false);
		btnPrih.setForeground(Color.DARK_GRAY);
		btnPrih.setFocusPainted(false);
		btnPrih.setContentAreaFilled(false);
		btnPrih.setBorderPainted(false);
		btnPrih.setBackground(Color.GRAY);
		btnPrih.setBounds(382, 251, 54, 40);
		contentPane.add(btnPrih);

		JButton btnBrisanje = new JButton("");
		btnBrisanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIspis.setText("");
			}
		});
		btnBrisanje.setIcon(new ImageIcon("Images\\ctk.png"));
		btnBrisanje.setOpaque(false);
		btnBrisanje.setForeground(Color.DARK_GRAY);
		btnBrisanje.setFocusPainted(false);
		btnBrisanje.setContentAreaFilled(false);
		btnBrisanje.setBorderPainted(false);
		btnBrisanje.setBackground(Color.GRAY);
		btnBrisanje.setBounds(624, 486, 39, 40);
		contentPane.add(btnBrisanje);

		JLabel lblNewLabel_2_2_1 = new JLabel("Ocisti prozor");
		lblNewLabel_2_2_1.setToolTipText("");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2_2_1.setBounds(603, 462, 78, 27);
		contentPane.add(lblNewLabel_2_2_1);

		btnKorisnik.setIcon(new ImageIcon("Images\\kor.png"));
		btnKorisnik.setForeground(new Color(217, 217, 217));
		btnKorisnik.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnKorisnik.setFocusPainted(false);
		btnKorisnik.setContentAreaFilled(false);
		btnKorisnik.setBorderPainted(false);
		btnKorisnik.setBackground(Color.WHITE);

		JLabel lblNewLabel_2_6_1 = new JLabel("<html><p>Pretraga koji trener<br> ima najvece prihode?</p><html>");
		lblNewLabel_2_6_1.setToolTipText("");
		lblNewLabel_2_6_1.setForeground(Color.WHITE);
		lblNewLabel_2_6_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2_6_1.setBounds(190, 322, 200, 27);
		contentPane.add(lblNewLabel_2_6_1);

		JButton btnPrihodiTr = new JButton("");
		btnPrihodiTr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double max = 0;
				for (Trener a : TrenerG.t)
					if (a.zarada() > max)
						max = a.zarada();
				for (Trener a : TrenerG.t)
					if (a.zarada() == max)
						txtIspis.setText(a + "Njegovi prihodi: " + max);

			}
		});
		btnPrihodiTr.setIcon(new ImageIcon("Images\\play.png"));
		btnPrihodiTr.setOpaque(false);
		btnPrihodiTr.setForeground(Color.DARK_GRAY);
		btnPrihodiTr.setFocusPainted(false);
		btnPrihodiTr.setContentAreaFilled(false);
		btnPrihodiTr.setBorderPainted(false);
		btnPrihodiTr.setBackground(Color.GRAY);
		btnPrihodiTr.setBounds(382, 315, 54, 40);
		contentPane.add(btnPrihodiTr);

		JLabel lblNewLabel_2_6_2 = new JLabel("<html><p>Pretraga koji trener<br> ima najvise klijenata?</p><html>");
		lblNewLabel_2_6_2.setForeground(Color.WHITE);
		lblNewLabel_2_6_2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2_6_2.setBounds(190, 387, 200, 27);
		contentPane.add(lblNewLabel_2_6_2);

		JButton btnKlijentiTr = new JButton("");
		btnKlijentiTr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int max = 0;
				for (Trener t : TrenerG.t)
					if (t.sigurniClanovi() > max)
						max = t.sigurniClanovi();
				for (Trener t : TrenerG.t)
					if (t.sigurniClanovi() == max)
						txtIspis.setText(t + "Broj klijenata: " + (max - 1));
			}

		});
		btnKlijentiTr.setIcon(new ImageIcon("Images\\play.png"));
		btnKlijentiTr.setOpaque(false);
		btnKlijentiTr.setForeground(Color.DARK_GRAY);
		btnKlijentiTr.setFocusPainted(false);
		btnKlijentiTr.setContentAreaFilled(false);
		btnKlijentiTr.setBorderPainted(false);
		btnKlijentiTr.setBackground(Color.GRAY);
		btnKlijentiTr.setBounds(382, 380, 54, 40);
		contentPane.add(btnKlijentiTr);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(54, 54, 54));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("Images\\pozStats.png"));
		lblNewLabel.setBounds(167, 0, 617, 551);
		contentPane.add(lblNewLabel);

	}
}
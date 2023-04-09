import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PlacanjeG extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlacanjeG frame = new PlacanjeG();
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
	public PlacanjeG() {
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
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(208, 97, 14, 0);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("CLANSKI BROJ:");
		lblNewLabel_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_4_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_1.setBounds(218, 74, 143, 26);
		contentPane.add(lblNewLabel_2_4_1);
	
		int nizk[] = new int [KorisnikG.korisnik.size()];
		int br=0;
		for(int i=0;i<KorisnikG.korisnik.size();i++) {
			nizk[br++]=KorisnikG.korisnik.get(i).getClBr();
		}	
		String nizkk[] = new String [KorisnikG.korisnik.size()];
		int brr=0;
	for(int i=0;i<KorisnikG.korisnik.size();i++)
		nizkk[brr++]= Integer.toString(KorisnikG.korisnik.get(i).getClBr());
		JComboBox cmbClBr = new JComboBox(nizkk);
		cmbClBr.setForeground(Color.LIGHT_GRAY);
		cmbClBr.setBackground(Color.DARK_GRAY);
		cmbClBr.setBounds(220, 102, 108, 22);
		contentPane.add(cmbClBr);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("MJESEC");
		lblNewLabel_2_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_4_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_1_1.setBounds(218, 157, 89, 26);
		contentPane.add(lblNewLabel_2_4_1_1);
		
		JComboBox cmbMjesec = new JComboBox();
		cmbMjesec.setForeground(Color.LIGHT_GRAY);
		cmbMjesec.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cmbMjesec.setBackground(Color.DARK_GRAY);
		cmbMjesec.setBounds(220, 185, 108, 22);
		contentPane.add(cmbMjesec);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(492, 114, 269, 57);
		contentPane.add(scrollPane);
		
		JTextArea txtPlati = new JTextArea();
		txtPlati.setText("OVDE SE ISPISUJU PODACI");
		txtPlati.setForeground(Color.LIGHT_GRAY);
		txtPlati.setFont(new Font("Cambria Math", Font.BOLD, 13));
		txtPlati.setBackground(Color.DARK_GRAY);
		scrollPane.setViewportView(txtPlati);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(190, 397, 510, 141);
		contentPane.add(scrollPane_1);
		
		JTextArea txtIspis = new JTextArea();
		txtIspis.setText("OVDE SE ISPISUJU PODACI");
		txtIspis.setForeground(Color.LIGHT_GRAY);
		txtIspis.setFont(new Font("Cambria Math", Font.BOLD, 13));
		txtIspis.setBackground(Color.DARK_GRAY);
		scrollPane_1.setViewportView(txtIspis);
		
		JButton btnIspis = new JButton("Ispis");
		btnIspis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<KorisnikG.korisnik.size();i++)
					if(cmbClBr.getSelectedItem().toString().equals(Integer.toString(KorisnikG.korisnik.get(i).getClBr())))
						txtIspis.setText(KorisnikG.korisnik.get(i).toString());
			}
		});
		btnIspis.setForeground(Color.LIGHT_GRAY);
		btnIspis.setBackground(Color.DARK_GRAY);
		btnIspis.setBounds(403, 367, 89, 23);
		contentPane.add(btnIspis);
		
		JButton btnPlati = new JButton("PLATI");
		btnPlati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int m;
				 int cl;
				 m=Integer.parseInt(cmbMjesec.getSelectedItem().toString());
				 cl=Integer.parseInt(cmbClBr.getSelectedItem().toString());
				if(KorisnikG.korisnik.get(cl-1).getA()[m].isPlatio()==false)
					KorisnikG.korisnik.get(cl-1).getA()[m].setPlatio(true);
				else
					JOptionPane.showMessageDialog(null, "Korisnik je vec platio za " + m + ". mesec!");
				 
			}
		});
		btnPlati.setForeground(Color.LIGHT_GRAY);
		btnPlati.setBackground(Color.DARK_GRAY);
		btnPlati.setBounds(353, 157, 89, 23);
		contentPane.add(btnPlati);
		
		JButton btnProveri = new JButton("PROVERI");
		btnProveri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int m;
				 int cl;
				 m=Integer.parseInt(cmbMjesec.getSelectedItem().toString());
				 cl=Integer.parseInt(cmbClBr.getSelectedItem().toString());
				if(KorisnikG.korisnik.get(cl-1).getA()[m].isPlatio()==true)
					txtPlati.setText("Korisnik je platio za " + m + ". mesec!");
				else
					txtPlati.setText("Korisnik nije platio za " + m + ". mesec!");
				for(Trener t:TrenerG.t)
				{
					  
					if(KorisnikG.korisnik.get(cl-1).getTr().equals(t.getIme()+ " " + t.getPrezime()) && KorisnikG.korisnik.get(cl-1).getA()[m].isPlatio()==false)
						txtPlati.append("\nTreba da plati mesecnu clanarinu u iznosu od " + t.getCena() + " dinara.");
					
			}}
			
		});
		btnProveri.setForeground(Color.LIGHT_GRAY);
		btnProveri.setBackground(Color.DARK_GRAY);
		btnProveri.setBounds(353, 116, 89, 23);
		contentPane.add(btnProveri);
		
		JLabel lblNewLabel_2_4_1_2 = new JLabel("Informacije o korisniku: ");
		lblNewLabel_2_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_4_1_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2_4_1_2.setBackground(Color.WHITE);
		lblNewLabel_2_4_1_2.setBounds(190, 361, 213, 26);
		contentPane.add(lblNewLabel_2_4_1_2);
		
		btnKorisnik.setIcon(new ImageIcon("Images\\kor.png"));
		btnKorisnik.setForeground(new Color(217, 217, 217));
		btnKorisnik.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		btnKorisnik.setFocusPainted(false);
		btnKorisnik.setContentAreaFilled(false);
		btnKorisnik.setBorderPainted(false);
		btnKorisnik.setBackground(Color.WHITE);
		
	
		
		
		JLabel lblNewLabel = new JLabel("");  
		lblNewLabel.setForeground(new Color(54, 54, 54));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setIcon(new ImageIcon("Images\\pozStats.png"));
		lblNewLabel.setBounds(167, 0, 617, 551);
		contentPane.add(lblNewLabel);
		
		
		
	
		
	}
			}


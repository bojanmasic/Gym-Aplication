import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Button;
import java.awt.Font;

public class PocetniG extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PocetniG frame = new PocetniG();
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
	public PocetniG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnKorisnik = new JButton("");
		btnKorisnik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KorisnikG kg = new KorisnikG();
				kg.show();
				dispose();
			}
		});
		btnKorisnik.setBorderPainted(false);
		btnKorisnik.setContentAreaFilled(false);
		btnKorisnik.setFocusPainted(false);
		btnKorisnik.setOpaque(false);
		btnKorisnik.setIcon(new ImageIcon("Images\\korh.png"));
		btnKorisnik.setBounds(347, 102, 100, 100);
		contentPane.add(btnKorisnik);

		JButton btnTrener = new JButton("");
		btnTrener.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TrenerG tg = new TrenerG();
				tg.show();
				dispose();
			}
		});
		btnTrener.setBorderPainted(false);
		btnTrener.setContentAreaFilled(false);
		btnTrener.setFocusPainted(false);
		btnTrener.setOpaque(false);
		btnTrener.setIcon(new ImageIcon("Images\\trnh.PNG"));

		btnTrener.setBounds(86, 102, 100, 100);
		contentPane.add(btnTrener);

		JButton btnPlacanje = new JButton("");
		btnPlacanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlacanjeG pg = new PlacanjeG();
				pg.show();
				dispose();
			}
		});
		btnPlacanje.setBorderPainted(false);
		btnPlacanje.setContentAreaFilled(false);
		btnPlacanje.setFocusPainted(false);
		btnPlacanje.setOpaque(false);
		btnPlacanje.setIcon(new ImageIcon("Images\\plh.png"));
		btnPlacanje.setBounds(347, 282, 100, 100);
		contentPane.add(btnPlacanje);

		JButton btnStatistika = new JButton("");
		btnStatistika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StatistikaG sg = new StatistikaG();
				sg.show();
				dispose();
			}
		});
		btnStatistika.setBorderPainted(false);
		btnStatistika.setContentAreaFilled(false);
		btnStatistika.setFocusPainted(false);
		btnStatistika.setOpaque(false);
		btnStatistika.setIcon(new ImageIcon("Images\\statsh.PNG"));
		btnStatistika.setBounds(83, 282, 103, 100);
		contentPane.add(btnStatistika);

		ImageIcon PZ = new ImageIcon(this.getClass().getResource("/pozPoc.png"));

		JLabel lblNewLabel_1 = new JLabel("VECTORS GYM");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Haettenschweiler", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(114, 11, 350, 61);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("TRENERI");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(86, 213, 113, 32);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("KORISNICI");
		lblNewLabel_2_1.setForeground(Color.GRAY);
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(338, 213, 137, 32);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("STATISTIKA");
		lblNewLabel_2_2.setForeground(Color.GRAY);
		lblNewLabel_2_2.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblNewLabel_2_2.setBounds(69, 393, 154, 26);
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("PLACANJE");
		lblNewLabel_2_3.setForeground(Color.GRAY);
		lblNewLabel_2_3.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(345, 393, 130, 26);
		contentPane.add(lblNewLabel_2_3);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblNewLabel.setIcon(PZ);
		lblNewLabel.setBounds(0, 0, 863, 500);
		contentPane.add(lblNewLabel);

	}
}

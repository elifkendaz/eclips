package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class build extends JFrame {

	private JPanel contentPane;
	private JTextField ad;
	private JTextField soyad;
	private JLabel mesaj;
	private JLabel yazdir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					build frame = new build();
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
	public build() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		ad = new JTextField();
		GridBagConstraints gbc_ad = new GridBagConstraints();
		gbc_ad.insets = new Insets(0, 0, 5, 5);
		gbc_ad.fill = GridBagConstraints.HORIZONTAL;
		gbc_ad.gridx = 5;
		gbc_ad.gridy = 2;
		contentPane.add(ad, gbc_ad);
		ad.setColumns(10);
		
		soyad = new JTextField();
		GridBagConstraints gbc_soyad = new GridBagConstraints();
		gbc_soyad.insets = new Insets(0, 0, 5, 5);
		gbc_soyad.fill = GridBagConstraints.HORIZONTAL;
		gbc_soyad.gridx = 5;
		gbc_soyad.gridy = 3;
		contentPane.add(soyad, gbc_soyad);
		soyad.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				yazdir.setText("dogru");
				
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 5;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		yazdir = new JLabel("");
		GridBagConstraints gbc_yazdir = new GridBagConstraints();
		gbc_yazdir.insets = new Insets(0, 0, 5, 0);
		gbc_yazdir.gridx = 7;
		gbc_yazdir.gridy = 6;
		contentPane.add(yazdir, gbc_yazdir);
		
		mesaj = new JLabel("");
		GridBagConstraints gbc_mesaj = new GridBagConstraints();
		gbc_mesaj.insets = new Insets(0, 0, 0, 5);
		gbc_mesaj.gridx = 5;
		gbc_mesaj.gridy = 7;
		contentPane.add(mesaj, gbc_mesaj);
	}

}

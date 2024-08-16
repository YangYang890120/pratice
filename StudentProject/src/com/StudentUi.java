package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JList;

public class StudentUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField chi;
	private JTextField eng;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentUi frame = new StudentUi();
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
	public StudentUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 24, 247, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("學員成績");
		lblNewLabel.setBounds(57, 10, 64, 15);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(10, 88, 247, 104);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("姓名:");
		lblNewLabel_1.setBounds(10, 10, 60, 15);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("國文:");
		lblNewLabel_1_1.setBounds(10, 38, 60, 15);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("英文:");
		lblNewLabel_1_2.setBounds(10, 63, 60, 15);
		panel_1.add(lblNewLabel_1_2);
		
		name = new JTextField();
		name.setBounds(40, 7, 96, 21);
		panel_1.add(name);
		name.setColumns(10);
		
		chi = new JTextField();
		chi.setColumns(10);
		chi.setBounds(40, 35, 96, 21);
		panel_1.add(chi);
		
		eng = new JTextField();
		eng.setColumns(10);
		eng.setBounds(40, 63, 96, 21);
		panel_1.add(eng);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(10, 202, 247, 141);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea output = new JTextArea();
		output.setBounds(20, 43, 92, 88);
		panel_2.add(output);
		
		JButton ok = new JButton("ok");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name=name.getText();
				String Chi=chi.getText();
				String Eng=eng.getText();
				//Integer C=new Integer(Chi);
				//Integer E=new Integer(Eng);
				
				int C=Integer.parseInt(Chi);
				int E=Integer.parseInt(Eng);
				
				Student s=new Student(Name,C,E);
				
				output.setText("學生成績:"+
								"\n姓名:"+s.getName()+
								"\n國文:"+s.getChi()+
								"\n英文:"+s.getEng()+
								"\n總分:"+s.getSum());
				
			}
		});
		ok.setBounds(10, 10, 87, 23);
		panel_2.add(ok);
		
		JButton clean = new JButton("清除");
		clean.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText("");
				chi.setText("");
				eng.setText("");
				output.setText("");
				
			}
		});
		clean.setBounds(119, 10, 87, 23);
		panel_2.add(clean);
		
	
	}
}

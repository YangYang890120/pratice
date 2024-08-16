package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrderUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField ruler;
	private JTextField pen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUi frame = new OrderUi();
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
	public OrderUi() {
		setTitle("    ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(36, 10, 364, 42);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("購物系統");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(143, 0, 121, 42);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 128));
		panel_1.setBounds(36, 76, 364, 189);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		name = new JTextField();
		name.setBounds(112, 11, 191, 34);
		panel_1.add(name);
		name.setColumns(10);
		
		ruler = new JTextField();
		ruler.setColumns(10);
		ruler.setBounds(112, 69, 191, 34);
		panel_1.add(ruler);
		
		pen = new JTextField();
		pen.setColumns(10);
		pen.setBounds(112, 124, 191, 34);
		panel_1.add(pen);
		
		JLabel lblNewLabel_1 = new JLabel("名:");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(40, 11, 48, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("尺:");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(40, 69, 48, 34);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("筆:");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(40, 124, 48, 34);
		panel_1.add(lblNewLabel_1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		panel_2.setBounds(36, 297, 369, 142);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea output = new JTextArea();
		output.setBounds(60, 43, 244, 82);
		panel_2.add(output);
		
		
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取 name,ruler,pen-->getText
				 * 2.ruler , pen-->轉整數
				 * 3.new Order(name,ruler,pen)
				 * 4.output.顯示
				 */
				String Name=name.getText();
				String Ruler=ruler.getText();
				String Pen = pen.getText();
				Integer R=new Integer(Ruler);
				Integer P=new Integer(Pen);	
				Order o=new Order(Name,R,P);
				Order o1=new Order(Name,R,P);
				output.setText("訂單細目:"+
								"\n姓名:"+o.getName()+
								"\n尺:"+o.getRuler()+
								"\n筆:"+o.getPen()+
								"\n金額:"+o.getSum());
				
			
				
			}
		});
		btnNewButton.setBounds(134, 10, 87, 23);
		panel_2.add(btnNewButton);
		

	}

}

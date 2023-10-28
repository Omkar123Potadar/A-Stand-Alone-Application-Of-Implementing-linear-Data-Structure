package datastrucutre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField LENGTH;
	private JTextField INSERTELEM;
	private JTextField POSITION;
	private JTextField DLETEPOSITION;
	private JTextField Display;
	private int arr[];
  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 490);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(204, 11, 207, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(81, 81, 186, 18);
		contentPane.add(lblNewLabel_1);
		
		LENGTH = new JTextField();
		LENGTH.setBounds(352, 78, 96, 20);
		contentPane.add(LENGTH);
		LENGTH.setColumns(10);
		
		JButton CREATE = new JButton("CREATE ARRAY");
		CREATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for create array
			
			int len=Integer.valueOf(LENGTH.getText());
			arr=new int[len];
			String message="Array of length"+len+"ceated";
			JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		CREATE.setFont(new Font("Constantia", Font.BOLD, 12));
		CREATE.setBounds(243, 130, 123, 23);
		contentPane.add(CREATE);
		
		JLabel lblNewLabel_2 = new JLabel("INSERT INTEGER ELEMENT");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(58, 186, 209, 20);
		contentPane.add(lblNewLabel_2);
		
		INSERTELEM = new JTextField();
		INSERTELEM.setBounds(277, 184, 96, 20);
		contentPane.add(INSERTELEM);
		INSERTELEM.setColumns(10);
		
		JButton INSERT = new JButton("INSERT");
		INSERT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert element
				int elem=Integer.valueOf(INSERTELEM.getText());
				int pos=Integer.valueOf(POSITION.getText());
				arr[pos]=elem;
				String message="Element"+elem+"Insert @ position"+pos;
				JOptionPane.showMessageDialog(contentPane,message);
				INSERTELEM.setText("");
				POSITION.setText("");
			}
		});
		INSERT.setFont(new Font("Constantia", Font.BOLD, 16));
		INSERT.setBounds(640, 185, 89, 23);
		contentPane.add(INSERT);
		
		JLabel lblNewLabel_3 = new JLabel("POSITION");
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_3.setBounds(423, 186, 79, 20);
		contentPane.add(lblNewLabel_3);
		
		POSITION = new JTextField();
		POSITION.setBounds(512, 184, 96, 20);
		contentPane.add(POSITION);
		POSITION.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DELETE POSITION");
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_4.setBounds(81, 240, 143, 20);
		contentPane.add(lblNewLabel_4);
		
		DLETEPOSITION = new JTextField();
		DLETEPOSITION.setBounds(277, 240, 96, 20);
		contentPane.add(DLETEPOSITION);
		DLETEPOSITION.setColumns(10);
		
		JButton DETETE = new JButton("DELETE");
		DETETE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(DLETEPOSITION.getText());
				arr[pos]=0;
				String message="Element deleted @ position"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		DETETE.setFont(new Font("Constantia", Font.BOLD, 16));
		DETETE.setBounds(413, 240, 93, 29);
		contentPane.add(DETETE);
		
		JButton DISPLAY = new JButton("DISPLAY");
		DISPLAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg=msg+" "+arr[i];
				}
				Display.setText(msg);
				
				int pos=Integer.valueOf(DLETEPOSITION.getText());
				arr[pos]=0;
				String messege="Element Deleted at the position"+pos;
				JOptionPane.showMessageDialog(contentPane, messege);
				DLETEPOSITION.setText("");
			}
		});
		DISPLAY.setFont(new Font("Constantia", Font.BOLD, 16));
		DISPLAY.setBounds(284, 322, 99, 29);
		contentPane.add(DISPLAY);
		
		Display = new JTextField();
		Display.setBounds(185, 387, 299, 20);
		contentPane.add(Display);
		Display.setColumns(10);
	}
}


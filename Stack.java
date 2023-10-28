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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setBounds(136, 11, 175, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE : ");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_1.setBounds(28, 61, 143, 15);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(181, 56, 175, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack creation code
				size = Integer.valueOf(sizefield.getText());
				s= new int[size];
				String message = "Stack of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createstack.setForeground(new Color(0, 0, 205));
		createstack.setFont(new Font("Constantia", Font.BOLD, 13));
		createstack.setBounds(158, 99, 129, 25);
		contentPane.add(createstack);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_1_1.setForeground(new Color(165, 42, 42));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(28, 143, 143, 15);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setBounds(181, 138, 86, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code here
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push not Possible");
				}else {
					elem = Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
				}
			}
		});
		push.setForeground(new Color(128, 0, 0));
		push.setFont(new Font("Constantia", Font.BOLD, 12));
		push.setBounds(295, 137, 89, 23);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code here
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Pop not Possible");
				}else {
					String message="Element deleted is:"+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		pop.setForeground(new Color(128, 0, 0));
		pop.setFont(new Font("Constantia", Font.BOLD, 12));
		pop.setBounds(178, 169, 89, 23);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code here
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}else {
					for(int i=top; i>=0; i--) {
						msg=msg +" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(128, 0, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(181, 203, 89, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 235, 205));
		displaybox.setForeground(new Color(0, 255, 127));
		displaybox.setColumns(10);
		displaybox.setBounds(61, 230, 323, 20);
		contentPane.add(displaybox);
	}
}

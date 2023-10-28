package datastrucutre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Home1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home1 frame = new Home1();
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
	public Home1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 464);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATASTRUCTURE");
		lblNewLabel.setBounds(186, 10, 258, 34);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JButton STACK = new JButton("STACK");
		STACK.setBounds(77, 140, 89, 46);
		STACK.setForeground(new Color(128, 0, 128));
		STACK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stack b=new Stack();
				b.setVisible(true);
			}
		});
		STACK.setFont(new Font("Constantia", Font.BOLD, 16));
		STACK.setBackground(new Color(240, 240, 240));
		contentPane.add(STACK);
		
		JButton QUEUE = new JButton("QUEUE");
		QUEUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Queue q=new Queue();
				q.setVisible(true);
			}
		});
		QUEUE.setBounds(444, 143, 109, 40);
		QUEUE.setForeground(new Color(255, 0, 255));
		QUEUE.setFont(new Font("Constantia", Font.BOLD, 16));
		contentPane.add(QUEUE);
		
		JButton CircularQueue = new JButton("CIRCULAR QUEUE");
		CircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cqueue cq=new Cqueue();
				cq.setVisible(true);
			}
		});
		CircularQueue.setBounds(30, 245, 197, 40);
		CircularQueue.setForeground(new Color(255, 128, 0));
		CircularQueue.setFont(new Font("Constantia", Font.BOLD, 16));
		contentPane.add(CircularQueue);
		
		JButton SinglyLinkedList = new JButton("SINGLY LINKED LIST");
		SinglyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SLL s=new SLL();
				s.setVisible(true);
			}
		});
		SinglyLinkedList.setBounds(370, 245, 197, 40);
		SinglyLinkedList.setRolloverEnabled(false);
		SinglyLinkedList.setForeground(new Color(0, 0, 255));
		SinglyLinkedList.setFont(new Font("Constantia", Font.BOLD, 16));
		contentPane.add(SinglyLinkedList);
		
		JButton btnDoublyLinkedList = new JButton("DOUBLY LINKED LIST");
		btnDoublyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLL d=new DLL();
				d.setVisible(true);
			}
		});
		btnDoublyLinkedList.setBounds(208, 341, 212, 40);
		btnDoublyLinkedList.setRolloverEnabled(false);
		btnDoublyLinkedList.setForeground(new Color(0, 0, 64));
		btnDoublyLinkedList.setFont(new Font("Constantia", Font.BOLD, 16));
		contentPane.add(btnDoublyLinkedList);
		
		JButton btnArray = new JButton("ARRAY");
		btnArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place array window code opening here
				Array a=new Array();
				a.setVisible(true);
			}
		});
		btnArray.setForeground(new Color(0, 64, 0));
		btnArray.setFont(new Font("Constantia", Font.BOLD, 16));
		btnArray.setBackground(SystemColor.menu);
		btnArray.setBounds(257, 60, 89, 46);
		contentPane.add(btnArray);
	}
}

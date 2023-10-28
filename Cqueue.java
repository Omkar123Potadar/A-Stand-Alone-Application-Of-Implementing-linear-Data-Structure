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
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cqueue extends JFrame {

private JPanel Cqueue;
private JTextField tf1;
private JTextField tf2;
private JTextField tf3;
private int cq[];
private int size;
private int r=-1;
private int f=0;
private int count=0;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Cqueue frame = new Cqueue();
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
public Cqueue() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 581, 386);
Cqueue = new JPanel();
Cqueue.setBackground(new Color(255, 239, 213));
Cqueue.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(Cqueue);
Cqueue.setLayout(null);

JLabel lbl1 = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
lbl1.setBounds(164, 11, 267, 21);
lbl1.setFont(new Font("Algerian", Font.BOLD, 16));
lbl1.setForeground(new Color(153, 50, 204));
Cqueue.add(lbl1);

JLabel lbl2 = new JLabel("ENTER QUEUE SIZE :");
lbl2.setBounds(56, 53, 148, 18);
lbl2.setFont(new Font("Arial Black", Font.BOLD, 12));
Cqueue.add(lbl2);

tf1 = new JTextField();
tf1.setBounds(210, 54, 144, 19);
Cqueue.add(tf1);
tf1.setColumns(10);

JButton tb1 = new JButton("CREATE QUEUE");
tb1.setBounds(164, 83, 127, 23);
tb1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int len=Integer.valueOf(tf1.getText());
cq=new int[len];
size=cq.length;
String msg="Circular Queue of size "+size+" is Created";
JOptionPane.showMessageDialog(Cqueue,msg);
}
});
tb1.setForeground(new Color(128, 128, 128));
tb1.setFont(new Font("Arial", Font.BOLD, 12));
Cqueue.add(tb1);

JLabel lbl3 = new JLabel("ENTER AN ELEMENT :");
lbl3.setBounds(20, 126, 137, 15);
lbl3.setForeground(new Color(70, 130, 180));
lbl3.setFont(new Font("Gill Sans MT", Font.BOLD, 12));
Cqueue.add(lbl3);

tf2 = new JTextField();
tf2.setBounds(164, 125, 106, 19);
tf2.setColumns(10);
Cqueue.add(tf2);

JButton tb2 = new JButton("INSERT");
tb2.setBounds(280, 124, 73, 25);
tb2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int elem;
if(count==size) {
String msg="Insertion not possible Circular Queue is Full";
JOptionPane.showMessageDialog(Cqueue,msg);
}
else {
elem=Integer.valueOf(tf2.getText());
r=(r+1)%size;
cq[r]=elem;
count++;
String msg="Insertion  Successful";
JOptionPane.showMessageDialog(Cqueue,msg);
}
tf2.setText("");
}
});
tb2.setForeground(new Color(128, 128, 0));
tb2.setFont(new Font("3ds Light", Font.BOLD, 12));
Cqueue.add(tb2);

JButton tb3 = new JButton("DELETE");
tb3.setBounds(174, 154, 81, 25);
tb3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(count==0) {
String msg="Deletion not possible Because Circular Queue is Empty";
JOptionPane.showMessageDialog(Cqueue,msg);
}
else {
f=(f+1)%size;
count--;
String msg="Deletion Successful";
JOptionPane.showMessageDialog(Cqueue,msg);
}
}
});
tb3.setForeground(new Color(178, 34, 34));
tb3.setFont(new Font("3ds Light", Font.BOLD, 12));
Cqueue.add(tb3);

JButton tb4 = new JButton("DISPLAY");
tb4.setBounds(174, 189, 81, 25);
tb4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int f1=f;
if(count==0) {
String msg="Displaying is not possible Because Circular Queue is Empty";
JOptionPane.showMessageDialog(Cqueue,msg);
tf3.setText("");
}
else {
String E="";
for (int i = 1;i<=count; i++) {
E+=" "+cq[f1];
f1=(f1+1)%size;
}
tf3.setText(E);
}
}
});
tb4.setForeground(new Color(255, 165, 0));
tb4.setFont(new Font("3ds Light", Font.BOLD, 12));
Cqueue.add(tb4);

tf3 = new JTextField();
tf3.setBounds(74, 234, 291, 19);
tf3.setForeground(new Color(255, 20, 147));
tf3.setBackground(new Color(0, 255, 255));
Cqueue.add(tf3);
tf3.setColumns(10);
}
}

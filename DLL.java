package datastrucutre;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DLL extends JFrame {

private JPanel dll;
private final JLabel lbl1 = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
private JTextField tf1;
private JTextField tf2;
private JTextField tf3;
class Node{
Node prelink;
int data;
Node nextlink;
}
private Node first;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
DLL frame = new DLL();
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
public DLL() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 451, 311);
dll = new JPanel();
dll.setBackground(Color.DARK_GRAY);
dll.setForeground(new Color(0, 0, 0));
dll.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(dll);
dll.setLayout(null);
lbl1.setFont(new Font("Bodoni MT Black", Font.BOLD, 14));
lbl1.setForeground(Color.ORANGE);
lbl1.setBackground(Color.YELLOW);
lbl1.setBounds(56, 10, 348, 17);
dll.add(lbl1);

JLabel LBL2 = new JLabel("ENTER THE ELEMENT :");
LBL2.setFont(new Font("Arial Black", Font.BOLD, 12));
LBL2.setForeground(Color.RED);
LBL2.setBounds(10, 60, 161, 18);
dll.add(LBL2);

JLabel LBL3 = new JLabel("ENTER THE ELEMENT :");
LBL3.setForeground(Color.ORANGE);
LBL3.setFont(new Font("Arial Black", Font.BOLD, 12));
LBL3.setBounds(10, 101, 161, 18);
dll.add(LBL3);

tf1 = new JTextField();
tf1.setBounds(181, 60, 96, 19);
dll.add(tf1);
tf1.setColumns(10);

tf2 = new JTextField();
tf2.setColumns(10);
tf2.setBounds(181, 102, 96, 19);
dll.add(tf2);

tf3 = new JTextField();
tf3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
tf3.setForeground(new Color(255, 69, 0));
tf3.setBackground(new Color(0, 255, 255));
tf3.setColumns(10);
tf3.setBounds(92, 234, 294, 19);
dll.add(tf3);

JButton btn1 = new JButton("INSERT REAR");
btn1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
int elem=Integer.valueOf(tf1.getText());
Node nn=new Node();
nn.data=elem;
nn.prelink=null;
nn.nextlink=null;
if(first==null) {
first=nn;
}
else {
temp=first;
while(temp.nextlink!=null) {
temp=temp.nextlink;
}
temp.nextlink=nn;
nn.prelink=temp;
}
String msg=elem+" is inserted at rear";
JOptionPane.showMessageDialog(dll,msg);
tf1.setText("");
}
});
btn1.setForeground(new Color(128, 0, 128));
btn1.setFont(new Font("Arial Narrow", Font.BOLD, 12));
btn1.setBackground(new Color(255, 99, 71));
btn1.setBounds(296, 60, 103, 23);
dll.add(btn1);

JButton btn2 = new JButton("INSERT FRONT");
btn2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int elem=Integer.valueOf(tf2.getText());
Node nn=new Node();
nn.data=elem;
nn.prelink=null;
nn.nextlink=null;
if(first==null) {
first=nn;
}
else {
nn.nextlink=first;
first.prelink=nn;
first=nn;
}
String msg=elem+" is inserted at front";
JOptionPane.showMessageDialog(dll,msg);
tf2.setText("");
}
});
btn2.setBackground(new Color(245, 245, 245));
btn2.setForeground(new Color(50, 205, 50));
btn2.setBounds(296, 101, 103, 21);
dll.add(btn2);

JButton btn3 = new JButton("DELETE REAR");
btn3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
if(first==null) {
String msg="Deletion not possible List is empty";
JOptionPane.showMessageDialog(dll,msg);
}
else if(first.nextlink==null) {
String msg=first.data+" is Deleted";
JOptionPane.showMessageDialog(dll,msg);
first=null;
}
else {
temp=first;
while(temp.nextlink.nextlink!=null) {
temp=temp.nextlink;
}
String msg=temp.nextlink.data+" is Deleted";
JOptionPane.showMessageDialog(dll,msg);
temp.nextlink=null;
}
}
});
btn3.setBackground(new Color(144, 238, 144));
btn3.setForeground(new Color(255, 0, 255));
btn3.setFont(new Font("Arial Narrow", Font.BOLD, 12));
btn3.setBounds(179, 141, 109, 23);
dll.add(btn3);

JButton btn4 = new JButton("DELETE FRONT");
btn4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(first==null) {
String msg="Deletion not possible List is empty";
JOptionPane.showMessageDialog(dll,msg);
}
else if(first.nextlink==null) {
String msg=first.data+" is Deleted";
JOptionPane.showMessageDialog(dll,msg);
first=null;
}
else {
String msg=first.data+" is Deleted";
JOptionPane.showMessageDialog(dll,msg);
first=first.nextlink;
first.prelink=null;
}
}
});
btn4.setBackground(new Color(230, 230, 250));
btn4.setForeground(new Color(139, 69, 19));
btn4.setFont(new Font("Arial Narrow", Font.BOLD, 12));
btn4.setBounds(179, 174, 109, 23);
dll.add(btn4);

JButton btn6 = new JButton("DISPLAY REVERSE");
btn6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
String msg="";
if(first==null) {
msg="Display not possible List is empty";
JOptionPane.showMessageDialog(dll,msg);
tf3.setText("");
}
else if(first.nextlink==null) {
msg=""+first.data;
tf3.setText(msg);
}
else {
temp=first;
while(temp.nextlink!=null) {
temp=temp.nextlink;
}
while(temp!=null) {
msg=" "+temp.nextlink;
temp=temp.prelink;
}
tf3.setText(msg);
}
}
});
btn6.setFont(new Font("Arial Narrow", Font.BOLD, 12));
btn6.setForeground(new Color(255, 69, 0));
btn6.setBackground(new Color(240, 255, 255));
btn6.setBounds(296, 201, 123, 23);
dll.add(btn6);

JButton btn5 = new JButton("DISPLAY FORWARD");
btn5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
String msg="";
if(first==null) {
msg="Display not possible List is empty";
JOptionPane.showMessageDialog(dll,msg);
tf3.setText("");
}
else if(first.nextlink==null) {
msg=""+first.data;
tf3.setText(msg);
}
else {
temp=first;
while(temp!=null) {
msg=" "+temp.nextlink;
}
tf3.setText(msg);
}
}
});
btn5.setBackground(new Color(255, 239, 213));
btn5.setForeground(new Color(0, 0, 205));
btn5.setFont(new Font("Arial Narrow", Font.BOLD, 12));
btn5.setBounds(27, 201, 131, 23);
dll.add(btn5);
}
}

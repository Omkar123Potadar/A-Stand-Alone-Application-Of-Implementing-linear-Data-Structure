package datastrucutre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

private JPanel queue;
private JTextField tf1;
private JTextField tf2;
private int q[];
private int size;
private int r=-1;
private int f=0;
private JTextField tf3;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Queue frame = new Queue();
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
public Queue() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);
queue = new JPanel();
queue.setBackground(new Color(144, 238, 144));
queue.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(queue);
queue.setLayout(null);

JLabel lbl1 = new JLabel("QUEUE DATA STRUCTURE");
lbl1.setFont(new Font("Sitka Display", Font.BOLD, 14));
lbl1.setForeground(new Color(178, 34, 34));
lbl1.setBounds(137, 18, 168, 18);
queue.add(lbl1);

JButton tb1 = new JButton("CREATE QUEUE");
tb1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int len=Integer.valueOf(tf1.getText());
q=new int[len];
String msg="Queue  of size "+len+" is created";
JOptionPane.showMessageDialog(queue,msg);
size=q.length;
}
});
tb1.setForeground(new Color(135, 206, 250));
tb1.setBackground(new Color(240, 240, 240));
tb1.setFont(new Font("Swis721 Ex BT", Font.PLAIN, 12));
tb1.setBounds(150, 72, 139, 23);
queue.add(tb1);

JLabel lbl2 = new JLabel("ENTER QUEUE SIZE:");
lbl2.setForeground(new Color(128, 0, 128));
lbl2.setFont(new Font("SansSerif", Font.BOLD, 12));
lbl2.setBounds(85, 46, 120, 16);
queue.add(lbl2);

tf1 = new JTextField();
tf1.setFont(new Font("Tahoma", Font.PLAIN, 12));
tf1.setBounds(209, 43, 96, 19);
queue.add(tf1);
tf1.setColumns(10);

tf2 = new JTextField();
tf2.setBounds(179, 118, 105, 19);
queue.add(tf2);
tf2.setColumns(5);

JLabel lbl3 = new JLabel("ENETR AN ELEMENT:");
lbl3.setFont(new Font("Georgia", Font.BOLD, 12));
lbl3.setForeground(new Color(255, 127, 80));
lbl3.setBounds(26, 120, 143, 14);
queue.add(lbl3);

JButton tb2 = new JButton("INSERT");
tb2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int elem;
if(r==size-1) {
String msg="Insertion not possible beacuse queue is full";
JOptionPane.showMessageDialog(queue,msg);
}
else {
String msg=" Element  Inserted to Queue";
JOptionPane.showMessageDialog(queue,msg);
++r;
elem=Integer.valueOf(tf2.getText());
q[r]=elem;
}
tf2.setText("");
}
});
tb2.setForeground(new Color(0, 191, 255));
tb2.setFont(new Font("Swis721 Ex BT", Font.PLAIN, 12));
tb2.setBounds(302, 115, 81, 23);
queue.add(tb2);

JButton tb3 = new JButton("DELETE");
tb3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(r==-1||f>r) {
String msg="Deletion not possible beacuse queue is Empty";
JOptionPane.showMessageDialog(queue,msg);
}
else {
String msg="Deletion Sucessful";
JOptionPane.showMessageDialog(queue,msg);
++f;
}
}
});
tb3.setForeground(new Color(186, 85, 211));
tb3.setBounds(164, 151, 85, 21);
queue.add(tb3);

JButton tb4 = new JButton("DISPLAY");
tb4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(r==-1||f>r) {
String msg="Display not possible beacuse queue is Empty";
JOptionPane.showMessageDialog(queue,msg);
}
else {
String s="";
for(int i=f; i<=r; i++) {
s+=" "+q[i];
}
tf3.setText(s);
}
}
});
tb4.setForeground(new Color(143, 188, 143));
tb4.setBounds(164, 182, 85, 21);
queue.add(tb4);

tf3 = new JTextField();
tf3.setBackground(new Color(255, 215, 0));
tf3.setFont(new Font("Tahoma", Font.PLAIN, 12));
tf3.setBounds(93, 221, 235, 19);
queue.add(tf3);
tf3.setColumns(10);
}

}


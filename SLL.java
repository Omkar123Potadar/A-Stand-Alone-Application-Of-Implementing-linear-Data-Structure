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
import javax.swing.JTextArea;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SLL extends JFrame {

private JPanel sll;
private JTextField tf1;
private JTextField tf2;
class Node{
int data;
Node link;
}
private Node first;
private JTextField tf3;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
SLL frame = new SLL();
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
public SLL() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 509, 333);
sll = new JPanel();
sll.setBackground(new Color(240, 255, 240));
sll.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(sll);
sll.setLayout(null);

JLabel lbl1 = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
lbl1.setForeground(new Color(30, 144, 255));
lbl1.setFont(new Font("Swis721 Blk BT", Font.PLAIN, 14));
lbl1.setBounds(90, 10, 297, 18);
sll.add(lbl1);

JLabel lbl2 = new JLabel("ENTER THE ELEMENT :");
lbl2.setFont(new Font("Lucida Sans", Font.BOLD, 12));
lbl2.setBounds(47, 55, 134, 15);
sll.add(lbl2);

tf1 = new JTextField();
tf1.setBounds(191, 54, 96, 19);
sll.add(tf1);
tf1.setColumns(10);
JPopupMenu popupMenu = new JPopupMenu();
addPopup(tf1, popupMenu);

JButton tb1 = new JButton("INSERT REAR");
tb1.setForeground(new Color(153, 153, 153));
tb1.setFont(new Font("Sitka Text", Font.BOLD, 12));
tb1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
int elem=Integer.valueOf(tf1.getText());
Node nn= new Node();
nn.data=elem;
nn.link=null;
if(first==null) {
first=nn;
}
else {
temp=first;
while(temp.link!=null) {
temp=temp.link;
}
temp.link=nn;
}
String msg=elem+" inserted at rear";
JOptionPane.showMessageDialog(sll,msg);
tf1.setText("");
}
});
tb1.setBounds(297, 53, 125, 25);
sll.add(tb1);

JLabel lbl3 = new JLabel("ENTER THE ELEMENT :");
lbl3.setFont(new Font("Lucida Sans", Font.BOLD, 12));
lbl3.setBounds(47, 103, 134, 15);
sll.add(lbl3);

tf2 = new JTextField();
tf2.setColumns(10);
tf2.setBounds(191, 102, 96, 19);
sll.add(tf2);

JButton tb2 = new JButton("INSERT FRONT");
tb2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int elem=Integer.valueOf(tf2.getText());
Node nn= new Node();
nn.data=elem;
nn.link=null;
if(first==null) {
first=nn;
}
else {
nn.link=first;
first=nn;
}
String msg=elem+" inserted at front";
JOptionPane.showMessageDialog(sll,msg);
tf2.setText("");
}
});
tb2.setForeground(new Color(0, 204, 153));
tb2.setFont(new Font("Sitka Text", Font.BOLD, 12));
tb2.setBounds(297, 101, 125, 25);
sll.add(tb2);

JButton tb3 = new JButton("DELETE REAR");
tb3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
if(first==null) {
String msg="Deleteion is not Possible beacuse List is empty";
JOptionPane.showMessageDialog(sll,msg);
}
else if(first.link==null){
String msg=first.data+" is deleted ";
JOptionPane.showMessageDialog(sll,msg);
first=null;
}
else {
temp=first;
while (temp.link.link!=null) {
temp = temp.link;
String msg=temp.link.data+" is deleted";
JOptionPane.showMessageDialog(sll,msg);
temp.link=null;
}
}
}
});
tb3.setForeground(new Color(204, 153, 255));
tb3.setFont(new Font("Sitka Text", Font.BOLD, 12));
tb3.setBounds(178, 136, 127, 25);
sll.add(tb3);

JButton tb4 = new JButton("DELETE FRONT");
tb4.setForeground(new Color(204, 153, 102));
tb4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(first==null) {
String msg= "deletion is not possible because lst is empty";
JOptionPane.showMessageDialog(sll,msg);
}
else if(first.link==null) {
String msg= first.data+" is deleted";
JOptionPane.showMessageDialog(sll,msg);
first=null;
}
else {
String msg= first.data+" is deleted";
JOptionPane.showMessageDialog(sll,msg);
first=first.link;
}
}
});
tb4.setFont(new Font("Sitka Text", Font.BOLD, 12));
tb4.setBounds(178, 171, 127, 25);
sll.add(tb4);

JButton tb5 = new JButton("DISPLAY");
tb5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Node temp;
String msg;
if(first==null) {
 msg= "Display not possible because list is empty";
JOptionPane.showMessageDialog(sll,msg);
tf3.setText("");
}
else if(first.link==null) {
msg=""+first.data;
tf3.setText(msg);
}
else {
temp=first;
msg="";
while(temp!=null) {
msg+=" "+temp.data;
temp=temp.link;
}
tf3.setText(msg);
}
}
});
tb5.setForeground(new Color(102, 102, 102));
tb5.setFont(new Font("Sitka Text", Font.BOLD, 12));
tb5.setBounds(178, 206, 125, 25);
sll.add(tb5);

tf3 = new JTextField();
tf3.setForeground(new Color(0, 0, 255));
tf3.setBackground(new Color(210, 180, 140));
tf3.setBounds(62, 252, 360, 19);
sll.add(tf3);
tf3.setColumns(10);
}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

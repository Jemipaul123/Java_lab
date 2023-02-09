import javax.swing.*;

public class basswing {
    public static void main(String args[])
    {
        JFrame  f = new JFrame("Form");
        JLabel g1 =new JLabel("Name:");
         JTextField n1 = new JTextField();
         JLabel g2 =new JLabel("Age:");
         JTextField n2 = new JTextField();
         JLabel g3 =new JLabel("Address:");
         JTextField n3 = new JTextField();
         JLabel g4 =new JLabel("Phone no:");
         JTextField n4 = new JTextField();
         JLabel g5 =new JLabel("Gender");
         JTextField n5 = new JTextField();
         JLabel g6 =new JLabel("Email:");
         JTextField n6 = new JTextField();
         JLabel g7 =new JLabel("Hobbies");
         JTextField n7 = new JTextField();
         JButton c =new JButton("Submit");
        
        g1.setBounds(0,0,80,10);
        n1.setBounds(60, 0, 100, 20);
        g2.setBounds(0,30,80,10);
        n2.setBounds(60, 30, 100, 20);
        g3.setBounds(0,60,80,10);
        n3.setBounds(60, 60, 100, 20);
        g4.setBounds(0,90,80,10);
        n4.setBounds(60, 90, 100, 20);
        g5.setBounds(0,120,80,10);
        n5.setBounds(60, 120, 100, 20);
        g6.setBounds(0,150,80,10);
        n6.setBounds(60, 150, 150, 20);
        g7.setBounds(0,180,80,10);
        n7.setBounds(60, 180, 100, 20);
      
        c.setBounds(150,240,100,50);
       

        
        f.add(g1);
        f.add(n1);
        f.add(g2);
        f.add(n2);
        f.add(g3);
        f.add(n3);
        f.add(g4);
        f.add(n4);
        f.add(g5);
        f.add(n5);
        f.add(g6);
        f.add(n6);
        f.add(g7);
        f.add(n7);
        
        f.add(c);
        
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
    }}

    


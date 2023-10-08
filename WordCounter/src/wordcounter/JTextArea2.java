
package wordcounter;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JTextArea2 implements ActionListener{
    JLabel l1,l2;
    JTextArea area;
    JButton b;
    JTextArea2(){
        JFrame f = new JFrame();
        l1 = new JLabel();
        l1.setBounds(120 , 25, 100, 30);
        l1.setForeground(new Color(255, 255, 118));
        l2 = new JLabel();
        l2.setBounds(250 , 25, 100, 30);
        l2.setForeground(new Color(255, 255, 118));
        
        area = new JTextArea();
        area.setBounds(15, 75, 400, 200);
        area.setBackground(new Color(255, 255, 118));
        Font font = new Font(area.getFont().getName(), Font.BOLD, 16);
        area.setFont(font);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        
        b = new JButton("Calculate");
        b.setBounds(150, 300, 120, 30);
        b.setBackground(new Color(255, 255, 118));
        
        b.addActionListener(this);
        
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);

        f.setSize(450,430);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.getContentPane().setBackground(new Color(66, 3, 169));
        
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });
}
    public static void main(String[] args) {
        new JTextArea2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String words[]= text.split("\\s");
        
        l1.setText("Words: " + words.length);
        l2.setText("Characters: " + text.length());
        
    }
}

    
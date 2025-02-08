package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class fortune_cookie_runner {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	int rand = new Random().nextInt(5);
	public void actionPerformed() {
		JOptionPane.showMessageDialog(null, "WooHoo!");
	}
	public void showButton() {
        frame.setVisible(true);
        frame.add(button);
        frame.pack();
        button.addActionListener(null);
        
   }
}

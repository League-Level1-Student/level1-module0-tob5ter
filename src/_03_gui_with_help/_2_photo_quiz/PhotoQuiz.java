package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )

		// 2. create a variable of type "Component" that will hold your image
			Component image;
		// 3. use the "createImage()" method below to initialize your Component
			image = createImage("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/4ceb5ce2-c855-4cb0-a473-b826f682d378/d3cd2x2-d693cc42-a0a3-4e3e-8822-4194ae11cce3.jpg/v1/fill/w_672,h_475,q_75,strp/two_legged_rhino_by_sorgaan_d3cd2x2-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NDc1IiwicGF0aCI6IlwvZlwvNGNlYjVjZTItYzg1NS00Y2IwLWE0NzMtYjgyNmY2ODJkMzc4XC9kM2NkMngyLWQ2OTNjYzQyLWEwYTMtNGUzZS04ODIyLTQxOTRhZTExY2NlMy5qcGciLCJ3aWR0aCI6Ijw9NjcyIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.DIR6VOkydjmODRF6qQY77F-KRqQu4ARrZNAzss3zq-Q");
		// 4. add the image to the quiz window
			quizWindow.add(image);
		// 5. call the pack() method on the quiz window
			quizWindow.pack();
		// 6. ask a question that relates to the image
			String pregunta = JOptionPane.showInputDialog("How many legs does this rhino have?");
		// 7. print "CORRECT" if the user gave the right answer
			int question = Integer.parseInt(pregunta);
		// 8. print "INCORRECT" if the answer is wrong
			if(question==(2)) {
				JOptionPane.showMessageDialog(quizWindow, "Correct!");
			}
			else {
				JOptionPane.showMessageDialog(quizWindow, "Incorrect!");
			}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
			quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
			Component image2;
			image2 = createImage("https://live-production.wcms.abc-cdn.net.au/7c59768390db9d1e30d5745b0699ebed?impolicy=wcms_crop_resize&cropH=576&cropW=863&xPos=80&yPos=0&width=862&height=575");
			quizWindow.add(image2);
			quizWindow.pack();
			String q = JOptionPane.showInputDialog("how many heads does this snake have?");
			int heads = Integer.parseInt(q);
			if(heads==(2)) {
				JOptionPane.showMessageDialog(quizWindow, "Correct!");
			}
			else {
				JOptionPane.showMessageDialog(quizWindow, "Incorrect!");
			}
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

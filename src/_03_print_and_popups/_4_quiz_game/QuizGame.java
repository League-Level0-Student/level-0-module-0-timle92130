package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		int score = 0;
				
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
		String question = JOptionPane.showInputDialog("How much does the president make?");
			if (question.equalsIgnoreCase("$400,000")){
				score += 1;
			}
		String question1 = JOptionPane.showInputDialog("What time is coding class?");
			if (question1.equalsIgnoreCase("3:30")){
				score += 1;
			}
		String question2 = JOptionPane.showInputDialog("How much sleep does the average person get?");
			if (question2.equalsIgnoreCase("6.8 hours")){
				score += 1;
			}
			JOptionPane.showMessageDialog(null, score);
		
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a poin t from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}

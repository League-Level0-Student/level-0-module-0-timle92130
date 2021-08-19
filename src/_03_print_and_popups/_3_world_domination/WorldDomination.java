package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String name= JOptionPane.showInputDialog("What's your name?");
		String answer= JOptionPane.showInputDialog("Do you know how to code?");
		if (answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You will go on to rule the world and cancle all human beings "+name);
	
		}else {
			JOptionPane.showMessageDialog(null, "you are a looser with no friends and no life. Eeryone hates you "+name+"!");
		}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}


package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
	

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		int random= ran.nextInt(4);
		System.out.println();
		String awsome= JOptionPane.showInputDialog("Enter somehing awsome!");
		if (random == 0) {
			JOptionPane.showMessageDialog(null,""+awsome+" is awsome");
		}
		else if (random==1) {
			JOptionPane.showMessageDialog(null,""+awsome+" is ok");
		}
		else if (random==2) {
			JOptionPane.showMessageDialog(null,""+awsome+" is boring");
		}
		else  {
			JOptionPane.showMessageDialog(null,"you suck!");
		}
			
		
	

}
}

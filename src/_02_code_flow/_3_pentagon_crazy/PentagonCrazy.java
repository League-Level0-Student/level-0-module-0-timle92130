package _02_code_flow._3_pentagon_crazy;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class PentagonCrazy {
	
	public static void main(String[] args) {
		
		Robot bro = new Robot();
		bro.changeRobot("https://i.kym-cdn.com/entries/icons/original/000/028/111/ba9a9c538a1ee1ea8c06cfdce9e03cd0.png");
		bro.penDown();
		bro.setSpeed(1000);
		bro.setPenColor(Color.BLACK);
		int sides = 5;
		int angle = 72;
		int count = 0;
		while (count<200) {
			bro.move(count);
			bro.turn(angle+1);
			count+=1;
		}
		bro.hide();
		
		


		
		
		
		

		//  LOOP. Start a while loop to repeat the DRAW, TURN, and INCREASE COUNT code 200 times. 
		
				//  DRAW.  Make the robot move the amount in your count variable
		
				//  TURN.  Turn the robot the amount in your angle variable + 1

				//  INCREASE COUNT. Increase the count by 1
		
		//  End the while loop here

		//  Now hide the robot so you can see the pattern it has drawn.
		
		//  Run the program. 
		//  Check the pattern against the picture in the recipe. If it matches, you are done!
	

	
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	}
}

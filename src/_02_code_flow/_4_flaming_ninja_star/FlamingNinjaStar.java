package _02_code_flow._4_flaming_ninja_star;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 200;		//the size of the black part of the star
		int flameSize = 130;		//the length of the flaming arms
		Robot bro = new Robot();
		bro.changeRobot("https://www.kindpng.com/picc/m/404-4047683_people-head-funny-heads-funny-heads-hd-png.png");
		bro.setSpeed(1000);
		bro.setWindowSize(800,800);
		int count = 0;
		bro.penDown();
		while (count < 25) {
		bro.setPenColor(Color.BLACK);
	    bro.turn(45);
	    bro.move(64);
	    bro.setPenColor(Color.RED);
		bro.turn(-40);  
		bro.move(flameSize);	
		bro.turn(170);
		bro.move(flameSize);	   
		bro.turn(64);
		bro.setPenColor(Color.BLACK);
		bro.move(baseSize);	
		count=count+1;
		
			
			
				
			
			   
			
				
				
		
		// TEST   Run the program. Check that your shape is the same as the first picture in the recipe. 
		//        This is one arm of the ninja star.
		
		// COLOR  Change the Robot's pen color so that the flame is a different color to the rest of the star.
		//        Run the program again. Check the second picture in the recipe.

		// LOOP   When you have one arm looking right, change your loop to repeat 25 times and run the program.
		
	}
}
}
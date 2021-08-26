package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		Robot bro = new Robot("vic");
		bro.penDown();
		bro.setSpeed(100);
		int count = 0;
		while (count < 500) {
			bro.setRandomPenColor();
			bro.turn(360/7);
			bro.changeRobot("https://tailandfur.com/wp-content/uploads/2014/03/Funny-pictures-of-animals-41.jpg");
			count+=1;
			bro.setPenWidth(count);
			bro.changeRobot("https://i.pinimg.com/474x/7a/20/fb/7a20fb6e96510bcf541d4adb360247ef--hair-removal-funny-things.jpg");
		}
		

	



			

		
	}
}

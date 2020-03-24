//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Siri = new Robot(); 
		//3. Ask the user what color they would like the robot to draw

		//5. Use an if/else statement to set the pen color that the user requested
for (int i = 0; i <4; i++) {
	String color =JOptionPane.showInputDialog("What color do you want?(Green, Red, or Blue)");	

	if (color == "Red") {
		Siri.setPenColor(250,0,0);
	} else {
		if (color == "Green") {
			Siri.setPenColor(0,250,0);
	
		} else {
			if (color == "Blue") {
				Siri.setPenColor(0,0,250);
			} else {
				Siri.setRandomPenColor();
			}
		}
	} 
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		//4. Set the pen width to 10
		Siri.setPenWidth(10);
		Siri.penDown();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Siri.turn(90);
		Siri.move(100);
}
	}
}

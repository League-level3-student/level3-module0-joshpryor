package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
	double g = .5;
	static int f = 5;
	static boolean top = false;
	public static void main(String[] args) {
		Robot[] bob = new Robot[f];
		for (int i = 0; i < f; i++) {
			bob[i] = new Robot("vic");
			bob[i].changeRobot("https://images-na.ssl-images-amazon.com/images/I/419nQMbKkYL._SX425_.jpg");
			bob[i].setX(100+i*100);
			bob[i].setY(500);
			
			bob[i].setSpeed(90);
		
		}
		Random ran = new Random();
	{
			
		while (!top) {
		for (int j = 0; j < bob.length; j++) {
	
			
				
			bob[j].move(ran.nextInt(5)+1);
			
			if (bob[j].getY() <= 0) {
				top = true;
				bob[j].move(-100);
				bob[j].turn(9999);
			}
			
			}
		
	}}
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}}

import java.util.Scanner;

/*
 * ~~~~
 * 
 * Welcome to Day 1 of the Access Baxter Intro to Programming Course!
 * 
 * ~~~~
 * 
 * Instructor: Justin O'Malley
 * Semester: Summer 2018
 * 
 * This course is a general introduction to programming. We will study Java programming in Eclipse
 *  for the first 3 days, and will then transition to C# programming within the Unity3D Game Engine.
 *  
 *  Java has many uses; it is the primary language for building Android applications and is one of the most
 *  common languages that students begin learning programming with. Eclipse helps make programming in Java
 *  easier, by providing project management features, easy program execution, autocomplete, and tons of other
 *  tools.
 *  
 *  Unity3D is a game engine, a software development environment designed for people to build video games.
 *  Some typical functionalities of a game engine includes a renderer (2D or 3D), a physics engine, a collision
 *  detection system, and support for scripting, animation, AI, and more. Unity mainly has two scripting 
 *  languages: C# and an adaptation of JavaScript, called UnityScript. We will be developing in C#. We will talk
 *  more about Unity later in the week!
 *  
 *  
 * ~~~~
 * 
 * Course Goals:
 * 
 * - Learn how to create basic Java programs and projects.
 * 
 * - Learn how to use development tools, like GitHub and Eclipse, to make life easier
 * 
 * - Learn basic game development skills in Unity3D using Unity's C# scripting library
 * 
 * - Learn the basics of object-oriented programming and data structures
 * 
 * - Create a customizable text adventure game in Java
 * 
 * - Create a customizable game in Unity, based off of their Roll-a-Ball tutorial
 * 
 * - And having fun of course! :)
 * 
 * ~~~~
 * 
 * Today we will be covering the following topics:
 * 
 * 1.) Data Types
 * 
 * 2.) Input and Output
 * 
 * 3.) Conditionals
 * 
 * 4.) Loops
 * 
 * 5.) GitHub
 * 
 * Notice how this text is green? That's because this is not code, but a comment (as you might have guessed)!
 * Comments are ignored when your code is executed. This is a multi-line comment!
 * 
 */

 //And this is a single line comment! Use comments to describe what your code does; it's easy to forget!

/* Scroll down to the main method of the DayOne class to begin the course! */

public class DayOne {
	

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		/*
		 * ACTIVITY 1: DATA TYPES
		 *
	     *  Let's start by just printing a message to the console. Copy the line below:
	     *  
	     *  System.out.println("Hello World");
	     *  
	     *  and paste it outside of this comment where it says to put your code.
         *
		 * */
		
		//YOUR CODE GOES RIGHT UNDER HERE
		
		/*
		 * Good job on your first line of code!
		 * 
		 * Change run to true below, and change the value of the String name to your name.
		 * 
		 * 
		 * 
		 * */
		
		boolean run = false;
		
		if(run) {
			String name = "no name :(";
			System.out.println("My name is " + name + ".");
		}
		
		run = false;

		
		/*
		 * Flying along! Strings are variables that store sequences of characters,
		 * so they're very useful! Some other Java primitive data types:
		 * 
		 * - boolean
		 * - int
		 * - double
		 * - void (we'll talk about this later)
		 * 
		 * Change the value of the variable run to 'true', and execute your code.
		 * Observe what happens.
		 * 
		 * */
		
		//a boolean value; 'true' or 'false'
		run = false;
		
		//any negative or positive whole number, or 0
		int number = 10;
		
		//any real number
		double decimal = 3.14;
		
		if(run) {
			System.out.println("The variable number stores the value " + number);
			System.out.println("The variable decimal stores the value " + decimal);
		}
		
		/* Variables are just places in a computer program where you can store values you think
		 * might be useful later on.  Set run to true below and match num0-5 with numA-F in
		 * the correct order.*/
		
		run = false;
		
		if(run) {
			int num0 = 0, 
				num1 = 5, 
				num2 = 3, 
				num3 = 11, 
				num4 = -3, 
				num5 = 2;

			int numA = 0, 
				numB = 0, 
				numC = 0, 
				numD = 0, 
				numE = 0, 
				numF = 0;
			
			System.out.println("Print 5 here: " + numA);
			System.out.println("Print 0 here: " + numB);
			System.out.println("Print 11 here: " + numC);		
			System.out.println("Print -3 here: " + numD);
			System.out.println("Print 3 here: " + numE);
			System.out.println("Print 2 here: " + numF);
			
			gradeOne(numA, numB, numC, numD, numE, numF);
		}
		
		run = false;
		
		/*
		 * ACTIVITY 2: MATH OPERATORS
		 * 
		 * There are operators for doing math in Java:
		 * 
		 * + addition +
		 * - subtraction -
		 * * multiplication *
		 * / division /
		 * % modulus (remainder) %
		 * 
		 * as well as the unary operators:
		 * 
		 * - number++ (adds 1 to number)
		 * - number1 += number2 (shorthand for number1 = number1 + number2), -=, *=, /=
		 * - number1 *= number2 (etc)
		 * 
		 * Java also contains the 'Math' package which allows things like exponents and square roots
		 * 
		 * //Math.pow(3, 2); 3 to the second = 9
		 * //Math.sqrt(9); Square root of 9 = 3
		 * 
		 * Set run equal to true below; use the variables to set num0-5 to the correct values!
		 * Don't just enter the correct number, use the variables and math operators to do it!
		 */
		
		run = false;
		
		if(run) {
			final int three = 3, four = 4, five = 5, sixteen = 16;
			
			double num0 = -1,
				num1 = -1,
				num2 = -1,
				num3 = -1,
				num4 = -1,
				num5 = -1;
			
			System.out.println("Print 25 here: " + num0);
			System.out.println("Print 1 here: " + num1);
			System.out.println("Print 21 here: " + num2);		
			System.out.println("Print -13 here: " + num3);
			System.out.println("Print 256 here: " + num4);
			System.out.println("Print 0 here: " + num5);
			
			gradeTwo(num0, num1, num2, num3, num4, num5);
		}
		
		/*
		 * ACTIVITY 3: INPUT
		 * 
		 * We've already experimented with printing output; let's try taking some user input in our program!
		 * 
		 * Change run to true, follow the prompts in the console and see what happens.
		 *
		 */
		
		run = false;
		
		if(run) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("What is your favorite food? (Press enter when done) ");
			
			String favFood = scan.nextLine();
			System.out.println("Eww, I hate " + favFood + "! I only eat cookies.");
		}
		
		run = false;
		
		/*
		 * Now let's try doing something different. If the user enters "cookies", we
		 * should agree with them, right?!
		 * 
		 * Change run to true, and follow the instructions below.
		 *
		 */
		
        run = false;
		
		if(run) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("What is your favorite food? (Press enter when done) ");
			
			String favFood = scan.nextLine();
			
			//YOUR CODE GOES HERE
			//If the user enters "cookies", write a message to the console agreeing with them!
			//If the user enters anything else, shun them forever!
		}
		
		run = false;
		
		/*
		 * ACTIVITY 4: CONDITIONALS
		 * 
		 * You used a conditional above to answer a question differently when the user entered "cookies"!
		 * 
		 * Conditional statements are what tell a computer program how to interpret input into output;
		 * here is a simple if statement (change run to true):
		 * 
		 * */
		
		/*boolean*/ run = false;
		
		if(run) {
			System.out.println("run equals true");
		}
		
		run = false;
		
		/*
		 * Boolean values go in if statements to tell them when to execute the code inside their brackets.
		 * They can either be explicitly declared booleans, or you can use comparison operators:
		 * 
		 * > greater than >
		 * < less than <
		 * == equal to ==
		 * != not equal to !=
		 * >= greater than or equal to >=
		 * <= less than or equal to <=
		 * 
		 * You can also string together multiple boolean values with these operators:
		 * 
		 * && logical and &&
		 * || logical or ||
		 * ( parentheses for grouping )
		 * 
		 * Also, if you have a boolean variable named dog, and dog = true, then !dog = false. 
		 * ! is the negation operator.
		 * 
		 * Change run to true, and follow the instructions below.
		 * 
		 * */
		
		run = false;
		
		if(run) {
			
			boolean t = true, f = false;
			int one = 1, two = 2, three = 3;
			
			int grade = 0;
			
			
			//CHANGE THE OPERATORS BELOW TO MAKE THE STATEMENTS TRUE
			if(t && one == two) {
				grade++;
			}
			
			if(f && three != three) {
				grade++;
			}
			
			if(f || (three != three && one == two)) {
				grade++;
			}
			
			if(grade == 3) {
				System.out.println("Congrats; you got all three booleans right!");
			}else {
				System.out.println("Your booleans aren't quite right!");
			}
			
		}
		
		run = false;
		
		/*
		 * if-else statements can be used if you need to choose between different options of what
		 * to do for a specific input.
		 * 
		 * Change run to true and follow the instructions below.
		 * 
		 * */
		
		run = false;
		
		if(run) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter a number between 1 and 5: "); //Change 'prompt' to your prompt
			
			int num = in.nextInt();
			
			/*
			 *  Replace the print statement below with if-else statements to inform the user of what number
			 * they entered; if they don't enter a number between 1 and 5, OFF WITH THEIR HEADS! (just kidding,
			 * but print a message)
			 * 
			 * */
			
			System.out.println("You entered " + num);

		}
		
		run = false;
		
		/*Great job! Our final exercise will cover a new topic
		 * 
		 * ACTIVITY 5: Loops
		 * 
		 * Loops are a way of telling the computer to do something over and over again, 
		 * while some condition remains true.
		 * 
		 * Most programs can be thought of as loops in the sense that they idle, wait for user input, respond to that input,
		 * wait for user input, respond to that input, wait for input, etc...
		 * 
		 * 'for' loops and 'while' loops are the most common loop types in Java.
		 * 
		 * Change run to true below and watch what happens.
		 * 
		 * */
		
		run = false;
		
		if(run) {
			
			System.out.println("T-minus");
			
			for(int i = 10; i > 0; i--) {
				System.out.println(i + "...");
				Thread.sleep(1000); //Make the program sleep for 1 second
			}
			
			System.out.println("BLASTOFF!!");
			
			
		}
		
		run = false;
		
		/* While loops are similar. The code below does the same exact thing as the code above!*/
		
		run = false;
		
		if(run) {
			
			int i = 10;
			
			System.out.println("T-minus");
			
			while(i > 0) {
				System.out.println(i + "...");
				Thread.sleep(1000); //Make the program sleep for 1 second
				i--;
			}
			
			System.out.println("BLASTOFF!!");
			
		}
		
		/* Now, let's use the skills we practiced today to the test! Open 'Blackjack.java' */
		
	}
	
	/* GRADING METHODS */
	
	static void gradeOne(int numA, int numB, int numC, int numD, int numE, int numF){
		
		int grade = 0;
		
		if(numA == 5)
			grade++;
		if(numB == 0)
			grade++;
		if(numC == 11)
			grade++;
		if(numD == -3)
			grade++;
		if(numE == 3)
			grade++;
		if(numF == 2)
			grade++;
		
		if(grade == 6) {
			System.out.println("You got 6 out of 6! Great job!");
		}else {
			System.out.println("You got " + grade + " correct! Try again! ;)");
		}
		
	}
	
	private static void gradeTwo(double num0, double num1, double num2, double num3, double num4, double num5) {
		
		int grade = 0;
		
		if(num0 == 25)
			grade++;
		if(num1 == 1)
			grade++;
		if(num2 == 21)
			grade++;
		if(num3 == -13)
			grade++;
		if(num4 == 256)
			grade++;
		if(num5 == 0)
			grade++;
		
		if(grade == 5) {
			System.out.println("You got 5 out of 5! Great job!");
		}else {
			System.out.println("You got " + grade + " correct! Try again! ;)");
		}
	}


}

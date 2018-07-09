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
 * 1.) Input and Output
 * 
 * 2.) Conditionals
 * 
 * 3.) Loops
 * 
 * 4.) GitHub
 * 
 * Notice how this text is green? That's because this is not code, but a comment (as you might have guessed)!
 * Comments are ignored when your code is executed. This is a multi-line comment!
 * 
 */

 //And this is a single line comment! Use comments to describe what your code does; it's easy to forget!

/* Scroll down to the main method of the DayOne class to begin the course! */

public class DayOne {
	

	public static void main(String[] args) {
		
		/*
		 * SECTION 1: INPUT, OUTPUT, AND DATA TYPES
		 * 
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
		 * Uncomment the lines of code below by highlighting them and pressing 'Ctrl + /'.
		 * 
		 * Change the value of the String name to your name.
		 * 
		 * */
		
//		String name = "no name :(";
//		System.out.println("My name is " + name + ".");
		
		/*
		 * Flying along! Strings are variables that store sequences of characters,
		 * so they're very useful! Some other Java primitive data types:
		 * 
		 * - boolean
		 * - int
		 * - double
		 * - void (we'll talk about this later)
		 * 
		 * Uncomment the code below, change the value of the variable bool to 'true', and execute your code.
		 * Observe what happens.
		 * 
		 * */
		
		//'true' or 'false'
		boolean bool = true;
		
		//any negative or positive whole number, or 0
		int number = 10;
		
		//any real number
		double decimal = 3.14;
		
		if(bool) {
			System.out.println("The variable number stores the value " + number);
			System.out.println("The variable decimal stores the value " + decimal);
		}
		
		/*
		 * There are operators for doing math in Java:
		 * 
		 * - addition +
		 * - subtraction -
		 * - multiplication *
		 * - division /
		 * 
		 * as well as the unary operators:
		 * 
		 * - number++ (adds 1 to number)
		 * - number1 += number2 (shorthand for number1 = number1 + number2) 
		 * - number1 *= number2 (etc)
		 * 
		 * Uncomment the code below and try to print the numbers in the correct spots.
		 * 
		 * */
		
		
		int num0 = 0, num1 = 5, num2 = 3, num3 = 11, num4 = -3, num5 = 2;
		
		//Match these variables with the ones above the print the write numbers
		//in the lines below!
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
		
		//UNCOMMENT, BUT DON'T CHANGE THIS
		gradeOne(numA, numB, numC, numD, numE, numF);
		
		
		
		
		
		
	}
	
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


}

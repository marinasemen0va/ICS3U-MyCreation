/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Effects extends Thread // class that creates poof effects for house animals to disapear
{
    // global variable used to access pubblic console in MyCreation.java
    private Console c;

    public void effects ()  // method draws effects
    {
	// VARIABLES
	Color grass = new Color (33, 61, 23);
	Color bodySerpent = new Color (31, 132, 43); // green
	int randXR, randYR, randXG, randYG, randXH, randYH, randXS, randYS;
	int i;  // (in this case i acts as a 'how many times to draw var')
	int r; // radius of oval, used to draw stationary object
	// DRAW
	// delay (time to display)
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	c.setColor (grass);
	for (i = 0 ; i <= 620 ; i++) // erase animals
	{
	    c.drawLine (10 + i, 480, 10 + i, 200);
	}
	for (i = 0 ; i < 200 ; i++) // draw effects
	{
	    // set up random coordinates in general area of eagle
	    randXR = (int) (200 * Math.random () + 20);
	    randYR = (int) (200 * Math.random () + 200);
	    randXG = (int) (200 * Math.random () + 150);
	    randYG = (int) (200 * Math.random () + 200);
	    randXH = (int) (200 * Math.random () + 300);
	    randYH = (int) (200 * Math.random () + 200);
	    randXS = (int) (200 * Math.random () + 420);
	    randYS = (int) (200 * Math.random () + 200);
	    // ravenclaw poof
	    c.setColor (Color.BLUE);
	    for (r = 0 ; r <= 5 ; r++) // nested loop - not technically animation thus must be drawn with loop
	    {
		c.drawOval (randXR + 8 - r, randYR + 3, r * 2 - (i / 10), 10 - (i / 10));
	    }
	    c.drawOval (randXR, randYR, 15 - (i / 10), 15 - (i / 10));
	    // gryffindor poof
	    c.setColor (Color.RED);
	    for (r = 0 ; r <= 5 ; r++) // nested loop - not technically animation thus must be drawn with loop
	    {
		c.drawOval (randXG + 8 - r, randYG + 3, r * 2 - (i / 10), 10 - (i / 10));
	    }
	    c.drawOval (randXG, randYG, 15 - (i / 10), 15 - (i / 10));
	    // hufflepuff poof
	    c.setColor (Color.YELLOW);
	    for (r = 0 ; r <= 5 ; r++) // nested loop - not technically animation thus must be drawn with loop
	    {
		c.drawOval (randXH + 8 - r, randYH + 3, r * 2 - (i / 10), 10 - (i / 10));
	    }
	    c.drawOval (randXH, randYH, 15 - (i / 10), 15 - (i / 10));
	    // slytherin poof
	    c.setColor (bodySerpent);
	    for (r = 0 ; r <= 5 ; r++) // nested loop - not technically animation thus must be drawn with loop
	    {
		c.drawOval (randXS + 8 - r, randYS + 3, r * 2 - (i / 10), 10 - (i / 10));
	    }
	    c.drawOval (randXS, randYS, 15 - (i / 10), 15 - (i / 10));
	    // delay
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	    // erase ravenclaw
	    c.setColor (grass);
	    c.fillOval (randXR, randYR, 16 - (i / 10), 16 - (i / 10));
	    c.drawOval (randXR, randYR, 15 - (i / 10), 15 - (i / 10));
	    // erase gryffindor
	    c.setColor (grass);
	    c.fillOval (randXG, randYG, 16 - (i / 10), 16 - (i / 10));
	    c.drawOval (randXG, randYG, 15 - (i / 10), 15 - (i / 10));
	    // erase hufflepuff
	    c.setColor (grass);
	    c.fillOval (randXH, randYH, 16 - (i / 10), 16 - (i / 10));
	    c.drawOval (randXH, randYH, 15 - (i / 10), 15 - (i / 10));
	    // erase slytherin
	    c.setColor (grass);
	    c.fillOval (randXS, randYS, 16 - (i / 10), 16 - (i / 10));
	    c.drawOval (randXS, randYS, 15 - (i / 10), 15 - (i / 10));
	}
    }


    public Effects (Console con)
    {
	c = con;
    }


    public void run ()
    {
	effects ();
    }
}


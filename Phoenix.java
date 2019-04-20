/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Phoenix extends Thread  // class that draws phoenix at the same time as the owls
{
    // global variable used to access public console in MyCreation.java
    private Console c;

    public void phoenix ()  // draws phoenix and effects that make it poof
    {
	// VARIABLES
	Color orange = new Color (255, 120, 2);
	Color grass = new Color (33, 61, 23);
	int randX, randY;
	Color red = new Color (224, 76, 2);
	int i; // allows animation by changing coordinates
	int r; // radius of oval, used to draw stationary object
	// DRAW
	for (i = 0 ; i < 400 ; i++) // draw phoenix

	    {
		// delay
		try
		{
		    Thread.sleep (10);
		}
		catch (Exception e)
		{
		}
		// erase
		c.setColor (grass);
		c.fillRect (120, 581 - i, 400, 190);
		// draw
		c.setColor (red);
		int bodyX[] = {260, 120, 270, 300, 340, 370, 520, 380, 340, 330, 340, 320, 300, 310, 300};
		int bodyY[] = {690 - i, 670 - i, 610 - i, 630 - i, 630 - i, 610 - i, 670 - i, 690 - i, 670 - i, 710 - i, 770 - i, 750 - i, 770 - i, 710 - i, 670 - i};
		c.fillPolygon (bodyX, bodyY, 15);
		c.setColor (orange);
		c.fillOval (300, 610 - i, 40, 100);
		c.setColor (orange);
		c.drawLine (160, 660 - i, 240, 630 - i);
		c.setColor (orange);
		c.drawLine (260, 630 - i, 220, 670 - i);
		c.setColor (orange);
		c.drawLine (280, 630 - i, 260, 670 - i);
		c.setColor (orange);
		c.drawLine (360, 630 - i, 380, 670 - i);
		c.setColor (orange);
		c.drawLine (380, 630 - i, 420, 670 - i);
		c.setColor (orange);
		c.drawLine (400, 630 - i, 480, 660 - i);
		c.setColor (red);
		int headX[] = {320, 300, 320, 340};
		int headY[] = {650 - i, 590 - i, 580 - i, 590 - i};
		c.fillPolygon (headX, headY, 4);
		c.setColor (red);
		c.fillRect (313, 680 - i, 5, 15);
		c.setColor (red);
		c.fillRect (323, 680 - i, 5, 15);
		c.setColor (red);
		c.setColor (Color.BLACK);
		c.drawArc (312, 693 - i, 10, 10, 45, 180);
		c.setColor (Color.BLACK);
		c.drawArc (322, 693 - i, 10, 10, 45, 180);
		c.setColor (Color.BLACK);
		c.fillOval (310, 600 - i, 7, 7);
		c.setColor (Color.BLACK);
		c.fillOval (325, 600 - i, 7, 7);
		c.setColor (Color.YELLOW);
		int beakX[] = {320, 314, 326};
		int beakY[] = {650 - i, 630 - i, 630 - i};
		c.fillPolygon (beakX, beakY, 3);
	    }
	// delay (time to display)
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	// erase phoenix
	for (i = 0 ; i <= 400 ; i++)
	{
	    c.setColor (grass);
	    c.drawLine (120 + i, 181, 120 + i, 381);
	}
	for (i = 0 ; i < 200 ; i++) // draws effects (in this case i acts as a 'how many times to draw var')
	{
	    // set up random coordinates in general area of phoenix
	    randX = (int) (200 * Math.random () + 220);
	    randY = (int) (200 * Math.random () + 200);
	    // poof
	    for (r = 0 ; r <= 5 ; r++) // nested loop - not technically animation thus must be drawn with loop
	    {
		c.setColor (orange);
		c.drawOval (randX + 8 - r, randY + 3, r * 2 - (i / 10), 10 - (i / 10));
	    }
	    c.setColor (red);
	    c.drawOval (randX, randY, 15 - (i / 10), 15 - (i / 10));
	    //delay
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	    // erase
	    c.setColor (grass);
	    c.fillOval (randX, randY, 16 - (i / 10), 16 - (i / 10));
	    c.setColor (grass);
	    c.drawOval (randX, randY, 15 - (i / 10), 15 - (i / 10));
	}
	// timing to assist with concurrency
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
    }


    public Phoenix (Console con)
    {
	c = con;
    }


    public void run ()
    {
	phoenix ();
    }
}




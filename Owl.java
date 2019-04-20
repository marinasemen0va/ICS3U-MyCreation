/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Owl extends Thread // class that draws 3 owls with overloaded method
{
    // global variable used to access public console in MyCreation.java
    private Console c;
    // VARIABLES
    Color colorMain = new Color (58, 44, 15); // used in overload to change color
    Color colorSecond = new Color (135, 99, 68); // used in overload to change color
    int delay = 20; // used in ovarload to change speed
    int x = 0; // used in overload to change location
    // DRAW
    public void owl ()  // overloaded method draws owl
    {
	// VARIABLES
	Color parchment = new Color (209, 202, 167);
	Color grass = new Color (33, 61, 23);
	Color letterTie = new Color (160, 8, 6);
	int i;  // allows animation by changing coordinates
	// DRAW
	// timing to assist with concurrency
	try
	{
	    Thread.sleep (3000);
	}
	catch (Exception e)
	{
	}
	for (i = 0 ; i < 300 ; i++) // draw owl
	{
	    // delay
	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	    // erase
	    c.setColor (grass);
	    c.fillRect (10 + x, 561 - i, 200, 100);
	    // draw
	    c.setColor (colorMain);
	    int bodyX[] = {10 + x, 70 + x, 95 + x, 125 + x, 150 + x, 210 + x, 150 + x, 130 + x, 115 + x, 125 + x, 110 + x, 95 + x, 105 + x, 90 + x, 70 + x};
	    int bodyY[] = {600 - i, 580 - i, 590 - i, 590 - i, 580 - i, 600 - i, 630 - i, 610 - i, 635 - i, 660 - i, 650 - i, 660 - i, 635 - i, 610 - i, 630 - i};
	    c.fillPolygon (bodyX, bodyY, 15);
	    c.setColor (colorMain);
	    c.fillOval (90 + x, 570 - i, 40, 60);
	    c.setColor (colorMain);
	    c.fillOval (90 + x, 560 - i, 40, 30);
	    c.setColor (colorSecond);
	    c.fillOval (95 + x, 565 - i, 30, 20);
	    c.setColor (colorSecond);
	    c.fillOval (100 + x, 595 - i, 20, 25);
	    c.setColor (colorSecond);
	    c.drawLine (70 + x, 590 - i, 30 + x, 600 - i);
	    c.setColor (colorSecond);
	    c.drawLine (80 + x, 590 - i, 50 + x, 610 - i);
	    c.setColor (colorSecond);
	    c.drawLine (85 + x, 595 - i, 70 + x, 620 - i);
	    c.setColor (colorSecond);
	    c.drawLine (150 + x, 590 - i, 190 + x, 600 - i);
	    c.setColor (colorSecond);
	    c.drawLine (140 + x, 590 - i, 170 + x, 610 - i);
	    c.setColor (colorSecond);
	    c.drawLine (135 + x, 595 - i, 150 + x, 620 - i);
	    c.setColor (colorSecond);
	    c.fillRect (105 + x, 625 - i, 3, 5);
	    c.setColor (colorSecond);
	    c.fillRect (112 + x, 625 - i, 3, 5);
	    c.setColor (Color.BLACK);
	    c.drawArc (114 + x, 630 - i, 5, 5, 45, 180);
	    c.setColor (Color.BLACK);
	    c.drawArc (107 + x, 630 - i, 5, 5, 45, 180);
	    c.setColor (Color.BLACK);
	    c.fillOval (100 + x, 570 - i, 7, 7);
	    c.setColor (Color.BLACK);
	    c.fillOval (113 + x, 570 - i, 7, 7);
	    c.setColor (parchment);
	    c.fillRect (90 + x, 582 - i, 40, 5);
	    c.setColor (letterTie);
	    c.fillRect (105 + x, 582 - i, 10, 5);
	    c.setColor (Color.YELLOW);
	    int beakX[] = {105 + x, 115 + x, 110 + x};
	    int beakY[] = {580 - i, 580 - i, 590 - i};
	    c.fillPolygon (beakX, beakY, 3);
	}

    }


    // default owl
    public Owl (Console con)
    {
	c = con;
    }


    // cloud with different colors, speed, and location
    public Owl (Console con, Color main, Color second, int pos, int delayChange)
    {
	c = con;
	colorMain = main;
	colorSecond = second;
	delay = delayChange;
	x = pos;


    }


    // owl with a different location
    public Owl (Console con, int pos)
    {
	c = con;
	x = pos;
    }


    public void run ()
    {
	owl ();
    }
}



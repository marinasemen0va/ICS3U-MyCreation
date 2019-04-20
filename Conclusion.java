/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Conclusion implements Runnable // class to conlude program
{
    // global variable used to access public console in MyCreation.java
    private Console c;

    public void conclusion ()  // method displays banner and draws curtains
    {
	// VARIABLES
	Color sky = new Color (78, 75, 130);
	Color parchment = new Color (209, 202, 167);
	Color curtains = new Color (130, 10, 9);
	int i; // allows animation by changing coordinates

	// DRAW
	for (i = 0 ; i < 120 ; i++) // draw banner
	{
	    // delay
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    // erase
	    c.setColor (sky);
	    c.fillRect (170, -51 + i, 246, 40);
	    // paper
	    c.setColor (parchment);
	    c.fillRect (170, -50 + i, 245, 40);
	    c.setColor (Color.BLACK);
	    c.drawRect (170, -50 + i, 245, 40);
	    // title
	    c.setFont (new Font ("Times New Roman", Font.BOLD, 18));
	    c.setColour (Color.BLACK);
	    c.drawString ("WELCOME", 240, -33 + i);
	    c.setColour (Color.BLACK);
	    c.drawString ("TO THE ADVENTURE", 200, -15 + i);

	}
	// delay (time to display)
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
	for (i = 0 ; i < 325 ; i++) // draw curtains
	{
	    // delay
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	    // draw
	    c.setColor (curtains);
	    c.drawLine (0 + i, 0, 0 + i, 500);
	    c.setColor (curtains);
	    c.drawLine (640 - i, 0, 640 - i, 500);
	}
	// bye
	c.setFont (new Font ("Times New Roman", Font.BOLD, 12));
	c.setColour (Color.BLACK);
	c.drawString ("thanks for watching! :)", 250, 250);

    }


    public Conclusion (Console con)
    {
	c = con;
    }


    public void run ()
    {
	conclusion ();
    }
}


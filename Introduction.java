/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Introduction extends Thread // class to introduce program
{
    // global variable used to access public console in MyCreation.java
    private Console c;

    public void introduction ()  // method introduces program using text
    {
	// VARIABLES
	Color sky = new Color (78, 75, 130);
	Color parchment = new Color (209, 202, 167);
	int i; // allows animation by changing coordinates
	// DRAW
	// delay (not immediate execution start)
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
	for (i = 0 ; i < 120 ; i++) // moves banner down
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
	    c.setFont (new Font ("Times New Roman", Font.BOLD, 22));
	    c.setColour (Color.BLACK);
	    c.drawString ("HOGWARTS HOUSES", 180, -30 + i);
	    // name
	    c.setFont (new Font ("Times New Roman", Font.BOLD, 12));
	    c.drawString ("Marina Semenova", 240, -15 + i);
	}
	// delay (time to display)
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
	for (i = 0 ; i < 150 ; i++) // closes display
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
	    c.setColor (sky);
	    c.drawLine (170 + i, 69, 170 + i, 119);
	    c.drawLine (415 - i, 69, 415 - i, 119);
	}
    }


    public Introduction (Console con)
    {
	c = con;
    }


    public void run ()
    {
	introduction ();
    }
}


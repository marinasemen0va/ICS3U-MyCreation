/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Slytherin extends Thread // class introduces Slytherin
{
    // global variable used to access public console in MyCreation.java
    private Console c;

    public void slytherin ()  // method draws serpent and banner that introduces house
    {
	// VARIABLES
	Color parchment = new Color (209, 202, 167);
	Color grass = new Color (33, 61, 23);
	Color bodySerpent = new Color (31, 132, 43);
	Color yellow = new Color (255, 238, 0);
	Color tongue = new Color (255, 4, 0);
	int i; // allows animation by changing coordinates
	// DRAW
	for (i = 0 ; i < 100 ; i++) // draw banner
	{
	    // delay
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	    c.setColor (parchment);
	    // open paper
	    c.drawLine (320 - i, 200, 320 - i, 300);
	    c.drawLine (320 + i, 200, 320 + i, 300);
	}
	c.setColor (bodySerpent);
	// draw border
	c.drawRect (230, 210, 180, 80);
	// text
	c.setFont (new Font ("Times New Roman", Font.BOLD, 18));
	c.drawString ("SLYTHERIN", 265, 230);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 11));
	c.drawString ("'Do what is necessary'", 267, 240);
	c.drawString ("This is the house of the cunning, ", 245, 255);
	c.drawString ("prideful, resourceful, ambitious, ", 245, 265);
	c.drawString ("intelligent, and determined.", 245, 275);
	for (i = 0 ; i < 190 ; i++) // draw serpent
	{
	    // delay
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	    // erase
	    c.setColor (grass);
	    c.fillRect (686 - i, 337, 131, 145);
	    // serpent
	    c.setColor (bodySerpent);
	    int bodyX[] = {720 - i, 700 - i, 700 - i, 720 - i, 750 - i, 750 - i, 740 - i, 700 - i, 700 - i, 720 - i, 740 - i, 770 - i, 770 - i, 740 - i, 720 - i, 730 - i, 820 - i};
	    int bodyY[] = {480, 450, 430, 400, 390, 370, 360, 370, 360, 340, 340, 370, 400, 410, 440, 460, 480};
	    c.fillPolygon (bodyX, bodyY, 17);
	    c.fillArc (720 - i, 337, 20, 7, 0, 180);
	    c.fillArc (765 - i, 370, 7, 30, 270, 180);
	    c.setColor (yellow);
	    c.fillArc (697 - i, 430, 7, 20, 90, 180);
	    c.fillOval (725 - i, 345, 7, 7);
	    c.setColor (Color.BLACK);
	    c.drawLine (700 - i, 365, 710 - i, 362);
	    c.setColor (tongue); 
	    c.drawRect (685 - i, 365, 15, 2);
	}
    }


    public Slytherin (Console con)
    {
	c = con;
    }


    public void run ()
    {
	slytherin ();
    }
}



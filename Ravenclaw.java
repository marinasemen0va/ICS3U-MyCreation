/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Ravenclaw extends Thread // class introduces Ravenclaw
{
    // global variable used to access public console in MyCreation.java

    private Console c;

    public void ravenclaw ()  // method draws eagle and banner that introduces house
    {
	// VARIABLES
	Color parchment = new Color (209, 202, 167);
	Color grass = new Color (33, 61, 23);
	Color body = new Color (0, 0, 124);
	Color head = new Color (104, 104, 255);
	int i; // allows animation by changing coordinates

	// DRAW
	for (i = 0 ; i < 100 ; i++)
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
	c.setColor (Color.BLUE);
	// draw border
	c.drawRect (230, 210, 180, 80);
	// text
	c.setFont (new Font ("Times New Roman", Font.BOLD, 18));
	c.drawString ("RAVENCLAW", 260, 230);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 11));
	c.drawString ("'Do what is wise'", 280, 240);
	c.drawString ("The house is known for their ", 245, 255);
	c.drawString ("wisdom, intelligence, creativity,", 245, 265);
	c.drawString ("cleverness and knowledge.", 245, 275);
	for (i = 0 ; i < 200 ; i++) // draw eagle

	    {
		//delay
		try
		{
		    Thread.sleep (20);
		}
		catch (Exception e)
		{
		}
		//erase
		c.setColor (grass);
		c.fillRect (-191 + i, 210, 140, 119);
		//eagle
		c.setColor (body);
		int bodyX[] = { - 170 + i, -190 + i, -140 + i, -170 + i, -190 + i, -140 + i, -120 + i, -110 + i, -100 + i, -100 + i};
		int bodyY[] = {310, 290, 300, 230, 210, 210, 290, 300, 300, 310};
		c.fillPolygon (bodyX, bodyY, 10);
		c.setColor (head);
		int headX[] = { - 110 + i, -100 + i, -100 + i, -80 + i, -70 + i, -60 + i, -50 + i, -70 + i, -100 + i, -100 + i};
		int headY[] = {300, 290, 270, 270, 280, 280, 290, 290, 310, 300};
		c.fillPolygon (headX, headY, 10);
		c.fillArc (-140 + i, 307, 20, 5, 180, 180);
		c.fillRect (-155 + i, 310, 3, 10);
		c.fillRect (-150 + i, 310, 3, 10);
		c.fillArc (-62 + i, 287, 10, 10, 300, 210);
		c.setColor (Color.BLACK);
		c.drawArc (-155 + i, 320, 10, 10, 45, 180);
		c.drawArc (-150 + i, 320, 10, 10, 45, 180);
		c.fillOval (-90 + i, 280, 7, 7);
	    }
    }


    public Ravenclaw (Console con)
    {
	c = con;
    }


    public void run ()
    {
	ravenclaw ();
    }
}


/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Gryffindor extends Thread // class introduces Gryffindor
{
    // global variable used to access public console in MyCreation.java
    private Console c;

    public void gryffindor ()  // method draws lion and banner that introduces house
    {
	// VARIABLES
	Color parchment = new Color (209, 202, 167);
	Color grass = new Color (33, 61, 23);
	Color bodyLion = new Color (255, 218, 124);
	Color mane = new Color (232, 180, 51);
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
	c.setColor (Color.RED);
	// draw border
	c.drawRect (230, 210, 180, 80);
	// text
	c.setFont (new Font ("Times New Roman", Font.BOLD, 18));
	c.drawString ("GRYFFINDOR", 260, 230);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 11));
	c.drawString ("'Do what is right'", 280, 240);
	c.drawString ("The house of the brave, loyal,", 245, 255);
	c.drawString ("courageous, adventurous,", 245, 265);
	c.drawString ("daring and chivalrous.", 245, 275);
	for (i = 0 ; i < 300 ; i++) // draw lion
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
	    c.fillRect (-141 + i, 330, 140, 150);
	    // draw
	    c.setColor (bodyLion);
	    c.fillOval (-140 + i, 390, 50, 50);
	    c.fillOval (-140 + i, 390, 100, 50);
	    c.fillRect (-140 + i, 420, 5, 60);
	    c.fillRect (-80 + i, 380, 40, 40);
	    c.fillArc (-121 + i, 470, 20, 20, 0, 180);
	    c.fillOval (-103 + i, 473, 7, 7);
	    c.fillArc (-60 + i, 470, 20, 20, 0, 180);
	    c.fillOval (-42 + i, 473, 7, 7);
	    c.fillRect (-60 + i, 450, 10, 30);
	    int bodyX[] = { - 140 + i, -120 + i, -130 + i, -120 + i, -120 + i, -110 + i, -90 + i, -70 + i, -60 + i, -50 + i, -40 + i, -40 + i, -10 + i, i, -40 + i, -60 + i, -40 + i};
	    int bodyY[] = {420, 450, 470, 480, 470, 450, 420, 430, 450, 450, 420, 380, 380, 360, 340, 360, 380};
	    c.fillPolygon (bodyX, bodyY, 17);
	    c.setColor (mane);
	    int maneX[] = { - 40 + i, -40 + i, -60 + i, -40 + i, -50 + i, -90 + i, -80 + i, -70 + i, -60 + i, -50 + i};
	    int maneY[] = {410, 380, 360, 340, 330, 350, 390, 380, 390, 380};
	    c.fillPolygon (maneX, maneY, 10);
	    c.setColor (Color.BLACK);
	    c.fillOval (-40 + i, 355, 7, 7);
	    c.drawLine (-20 + i, 370, -10 + i, 370);
	    c.setColor (bodyLion);
	    c.fillArc (-55 + i, 345, 10, 10, 45, 180);
	}
    }


    public Gryffindor (Console con)
    {
	c = con;
    }


    public void run ()
    {
	gryffindor ();
    }
}


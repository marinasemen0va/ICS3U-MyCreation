/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Hufflepuff extends Thread // class introduces Hufflepuff
{
    // global variable used to access public console in MyCreation.java
    private Console c;

    public void hufflepuff ()  // method draws badger and banner that introduces house
    {
	// VARIABLES
	Color parchment = new Color (209, 202, 167);
	Color grass = new Color (33, 61, 23);
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
	c.setColor (Color.YELLOW);
	// draw border
	c.drawRect (230, 210, 180, 80);
	// text
	c.setFont (new Font ("Times New Roman", Font.BOLD, 18));
	c.drawString ("HUFFLEPUFF", 260, 230);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 11));
	c.drawString ("'Do what is nice'", 280, 240);
	c.drawString ("This house values hard work, ", 245, 255);
	c.drawString ("dedication, fair play, ", 245, 265);
	c.drawString ("patience, and loyalty.", 245, 275);
	for (i = 0 ; i < 300 ; i++) // draw badger
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
	    c.fillRect (641 - i, 365, 160, 115);
	    // draw
	    c.setColor (Color.BLACK);
	    c.fillOval (680 - i, 410, 100, 40);
	    c.fillArc (685 - i, 470, 20, 20, 0, 180);
	    c.fillOval (680 - i, 473, 7, 7);
	    c.fillArc (740 - i, 470, 20, 20, 0, 180);
	    c.fillOval (735 - i, 473, 7, 7);
	    int legsX[] = {690 - i, 700 - i, 710 - i, 720 - i, 740 - i, 750 - i, 760 - i, 750 - i, 760 - i, 770 - i, 760 - i, 770 - i};
	    int legsY[] = {440, 460, 460, 440, 440, 460, 470, 480, 480, 470, 460, 440};
	    c.fillPolygon (legsX, legsY, 12);
	    c.fillRect (700 - i, 460, 10, 20);
	    c.setColor (Color.WHITE);
	    int headX[] = {683 - i, 678 - i, 650 - i, 640 - i, 660 - i, 690 - i, 710 - i, 750 - i, 800 - i, 760 - i, 710 - i};
	    int headY[] = {435, 400, 400, 390, 370, 370, 420, 412, 440, 425, 440};
	    c.fillPolygon (headX, headY, 11);
	    c.setColor (Color.BLACK);
	    int stripeX[] = {640 - i, 653 - i, 693 - i, 698 - i};
	    int stripeY[] = {390, 375, 375, 390};
	    c.fillPolygon (stripeX, stripeY, 4);
	    c.drawLine (645 - i, 395, 660 - i, 395);
	    c.fillArc (665 - i, 665, 10, 10, 0, 180);
	    c.fillArc (680 - i, 665, 10, 10, 0, 180);
	    c.setColor (Color.WHITE);
	    c.drawOval (670 - i, 380, 5, 5);
	    c.drawArc (669 - i, 381, 3, 3, 0, 90);
	}
    }


    public Hufflepuff (Console con)
    {
	c = con;
    }


    public void run ()
    {
	hufflepuff ();
    }
}


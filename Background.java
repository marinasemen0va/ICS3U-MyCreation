/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Background // class to make background
{
    // global variable used to access public console in MyCreation.java
    private Console c;


    public void draw ()  // method draws background
    {
	// VARIABLES
	Color grass = new Color (33, 61, 23);
	Color rocks = new Color (58, 58, 58);
	Color sky = new Color (78, 75, 130);
	Color hogwarts = new Color (99, 99, 99);
	Color roofs = new Color (47, 58, 61);
	Color windows = new Color (249, 241, 117);
	int x, y; // variables that allow draw commands to fill by moving
	// DRAW
	// draw sky
	c.setColor (sky); // sky blue
	for (x = 0 ; x <= 640 ; x++)
	{
	    c.drawLine (0 + x, 0, 0 + x, 500);
	}
	// draw rocks
	c.setColor (rocks);
	for (y = 0 ; y <= 60 ; y++)
	{
	    c.drawLine (0, 160 + y, 20, 130 + y);
	    c.drawLine (20, 130 + y, 140, 120 + y);
	    c.drawLine (140, 120 + y, 200, 160 + y);
	    c.drawLine (200, 160 + y, 340, 140 + y);
	    c.drawLine (340, 140 + y, 390, 160 + y);
	    c.drawLine (390, 160 + y, 400, 140 + y);
	    c.drawLine (400, 140 + y, 420, 130 + y);
	    c.drawLine (420, 130 + y, 640, 130 + y);

	}
	// draw grass
	c.setColor (grass);
	for (x = 0 ; x <= 640 ; x++)
	{
	    c.drawLine (0 + x, 180, 0 + x, 500);
	}
	// draw Hogwarts
	c.setColor (hogwarts);
	for (x = 0 ; x <= 60 ; x++)
	{
	    c.drawLine (420 + x, 130, 420 + x, 80);
	    c.drawLine (500 + x, 130, 500 + x, 100);
	}
	for (x = 0 ; x <= 20 ; x++)
	{
	    c.drawLine (480 + x, 130, 480 + x, 40);
	    c.drawLine (550 + x, 130, 550 + x, 60);
	    c.drawLine (570 + x, 130, 570 + x, 100);
	    c.drawLine (590 + x, 130, 590 + x, 60);
	}
	for (x = 0 ; x <= 40 ; x++)
	{
	    c.drawLine (540 + x, 130, 540 + x, 80);
	}
	for (x = 0 ; x <= 30 ; x++)
	{
	    c.drawLine (610 + x, 130, 610 + x, 80);
	}
	for (x = 0 ; x <= 10 ; x++)
	{
	    c.drawLine (430 + x, 80, 430 + x, 60);
	    c.drawLine (450 + x, 80, 450 + x, 60);
	}
	// draw roofs
	c.setColor (roofs);
	for (x = 0 ; x <= 10 ; x++)
	{
	    c.drawLine (435, 40, 430 + x, 60);
	    c.drawLine (455, 40, 450 + x, 60);
	    c.drawLine (545, 70, 540 + x, 80);
	    c.drawLine (575, 70, 570 + x, 80);
	}
	for (x = 0 ; x <= 20 ; x++)
	{
	    c.drawLine (490, 0, 480 + x, 40);
	    c.drawLine (560, 30, 550 + x, 60);
	    c.drawLine (600, 30, 590 + x, 60);
	}
	// draw windows
	c.setColor (windows);
	for (x = 0 ; x < 60 ; x += 20)
	{
	    for (y = 0 ; y <= 10 ; y++) // nested loop: can be arranged with algorithm rather than draw individually
	    {
		c.drawLine (430 + x, 90 + y, 440 + x, 90 + y);
		c.drawLine (430 + x, 110 + y, 440 + x, 110 + y);
		c.drawLine (610 + x, 90 + y, 620 + x, 90 + y);
		c.drawLine (610 + x, 110 + y, 620 + x, 110 + y);
		c.drawLine (495 + x / 2, 110 + y / 2, 500 + x / 2, 110 + y / 2);
		c.drawLine (495 + x / 2, 120 + y / 2, 500 + x / 2, 120 + y / 2);
		c.drawLine (525 + x / 2, 110 + y / 2, 530 + x / 2, 110 + y / 2);
		c.drawLine (525 + x / 2, 120 + y / 2, 530 + x / 2, 120 + y / 2);
		c.drawLine (555 + x / 2, 110 + y / 2, 560 + x / 2, 110 + y / 2);
		c.drawLine (555 + x / 2, 120 + y / 2, 560 + x / 2, 120 + y / 2);
		c.drawLine (545 + x / 2, 90 + y / 2, 550 + x / 2, 90 + y / 2);
		c.drawLine (545 + x / 2, 100 + y / 2, 550 + x / 2, 100 + y / 2);
	    }
	}
	// draw moon
	c.setColor (Color.WHITE);
	for (x = 0 ; x < 15 ; x++)
	{
	    c.drawOval (140 - x, 20, x * 2, 30);
	}
    }


    public Background (Console con)
    {
	c = con;
	draw ();
    }
}



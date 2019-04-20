/*
   Name: Marina Semenova
   Teacher: Valentina Krasteva
   Date: October 22, 2018
   Assignment: MyCreation - a walkthrough of Hogwarts houses with animals
*/


import java.awt.*;
import hsa.Console;


public class MyCreation // MyCreation class
{
    Console c;           // The output console

    // adds the Background thread to MyCreation
    public void background ()
    {
	// not a thread because it's not animated!!!
	Background b = new Background (c);
    }



    // adds the Introduction thread to MyCreation
    public void introduction ()
    {
	// creates the thread
	Introduction i = new Introduction (c);
	// starts the thread
	i.start ();
	// joins with gryffindor thread so that it only executes when introduction thread is done
	try
	{
	    i.join ();
	}
	catch (InterruptedException e)
	{
	}
    }




    // adds the Gryffindor thread to MyCreation
    public void gryffindor ()
    {
	// creates the thread
	Gryffindor g = new Gryffindor (c);
	// starts the thread
	g.start ();

	// joins with hufflepuff thread so that it only executes when gryffindor thread is done
	try
	{
	    g.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Hufflepuff thread to MyCreation
    public void hufflepuff ()
    {
	//creates the thread
	Hufflepuff h = new Hufflepuff (c);
	// starts the thread
	h.start ();

	// joins with ravenclaw thread so that it only executes when hufflepuff thread is done
	try
	{
	    h.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Ravenclaw thread to MyCreation
    public void ravenclaw ()
    {
	// creates the thread
	Ravenclaw r = new Ravenclaw (c);
	// starts the thread
	r.start ();
	// joins with slytherin thread so that it only executes when ravenclaw thread is done
	try
	{
	    r.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Slytherin thread to MyCreation
    public void slytherin ()
    {
	// creates the thread
	Slytherin s = new Slytherin (c);
	// starts the thread
	s.start ();
	// joins with background thread so that it only executes when slytherin thread is done
	try
	{
	    s.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Effects thread to MyCreation
    public void effects ()
    {
	//creates the thread
	Effects f = new Effects (c);
	//starts the thread
	f.start ();
	//joins with owl thread so that it only executes when effects thread is done
	try
	{
	    f.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // adds the Owl thread to MyCreation
    public void owl ()
    {
	// creates the owl thread (1)
	Owl o = new Owl (c);
	// starts the thread (1)
	o.start ();
	// creates the owl thread (2)
	Owl o1 = new Owl (c, Color.WHITE, new Color (135, 119, 106), 210, 30);
	// starts the thread (2)
	o1.start ();
	// creates the owl thread (3)
	Owl o2 = new Owl (c, 420);
	// starts the thread (3)
	o2.start ();
    }


    // adds the Phoenix thread to MyCreation
    public void phoenix ()
    {
	//creates the thread
	Phoenix p = new Phoenix (c);
	//starts the thread
	p.start ();
	//joins with conclusion thread so that it only executes when phoenix thread is done
	try
	{
	    p.join ();
	}
	catch (InterruptedException e)
	{
	}

    }


    // adds the Conclusion thread to MyCreation
    public void conclusion ()
    {
	//creates the thread
	Conclusion n = new Conclusion (c);
	//starts the thread
	n.run ();
    }


    // creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("Hogwarts Houses Introduced");
    }


    public static void main (String[] args)  // main method: putting it all together
    {
	MyCreation MyC = new MyCreation ();
	MyC.background ();
	MyC.introduction ();
	MyC.gryffindor ();
	MyC.hufflepuff ();
	MyC.ravenclaw ();
	MyC.slytherin ();
	MyC.effects ();
	MyC.owl ();
	MyC.phoenix ();
	MyC.conclusion ();
    }
}

/*
 SOURCE FOR INFO:
 What Your Hogwarts House Says About You. (2018, July 10). Retrieved from
	https://www.theodysseyonline.com/hogwarts-house
*/

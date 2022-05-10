import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Snake s = new Snake();
        border b = new border();
        border b2 = new border();
        border b3 = new border();
        border b4 = new border();
        border b5 = new border();
        addObject(s, 300, 200);
        addObject(b, 600, 200);
        addObject(b2, 600, 300);
        addObject(b3, 600, 400);
        addObject(b4, 600, 100);
        addObject(b5, 600, 0);
        spawnInsect();
    }
    
    public void spawnInsect(){
        Insect i = new Insect();
        addObject(i, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
}

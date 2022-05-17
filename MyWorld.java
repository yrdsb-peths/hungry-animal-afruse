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
    private static Label lbl = new Label(0, 70);
    private static Snake s = new Snake();
    private static border b = new border();
    private static border b2 = new border();
    private static border b3 = new border();
    public static border b4 = new border();
    public static border b5 = new border();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        GreenfootImage image = s.getImage();
        image.scale(75, 75);
        addObject(lbl, 50, 50);
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
        GreenfootImage img = i.getImage();
        img .scale (30, 30);
        addObject(i, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
    
    public static Label getLbl(){
        return lbl;
    }
}

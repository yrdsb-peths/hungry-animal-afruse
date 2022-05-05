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
    private int score = 0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Snake s = new Snake();
        addObject(s, 300, 200);
        spawnInsect();
    }
    
    public void spawnInsect(){
        Insect i = new Insect();
        addObject(i, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        score++;
        System.out.println("You got a point!: " + score);
    }
    
    public void checkDie(){
        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eagle extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score;
    public Eagle(){
        score = 3;
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w")){
            move(4);
        }
        if(Greenfoot.isKeyDown("s")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-4);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(4);
        }
        if(isTouching(Insect.class)){
            removeTouching(Insect.class);
            MyWorld world = (MyWorld) getWorld();
            score++;
            Label lbl = MyWorld.getLbl();
            lbl.setValue(score);
            world.spawnInsect();
        }
    }
    
    public static int getScore(){
        return score;
    }
}

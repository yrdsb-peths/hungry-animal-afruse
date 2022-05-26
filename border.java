import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class border extends Actor
{
    /**
     * Act - do whatever the border wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(isTouching(Snake.class)){
            removeTouching(Snake.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnSnake();
            Eagle.score--;
            Label lbl = MyWorld.getLbl();
            lbl.setValue(Eagle.score);
        }
        MyWorld world = (MyWorld) getWorld();
        if(Eagle.score < 0){
            world.gameOver();
        }
    }
}

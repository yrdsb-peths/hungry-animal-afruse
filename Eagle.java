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
    private SimpleTimer timer;
    private GreenfootImage[] eg;
    public Eagle(){
        score = 3;
        eg = new GreenfootImage[4];
        for(int i = 0; i < eg.length; i++){
            eg[i] = new GreenfootImage("images/eg/sprite" + (i + 1) + ".png");
            eg[i].scale(100, 100);
        }
        setImage(eg[0]);
        timer = new SimpleTimer();
        timer.mark();
    }
    
    int curIndex = 0;
    void animate(){
        if(timer.millisElapsed() > 120){
            setImage(eg[curIndex]);
            curIndex++;
            curIndex %= 3;
            timer.mark();
        }
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
        
        animate();
        
        if(isTouching(Snake.class)){
            removeTouching(Snake.class);
            MyWorld world = (MyWorld) getWorld();
            score++;
            Label lbl = MyWorld.getLbl();
            lbl.setValue(score);
            world.spawnSnake();
        }
    }
    
    public static int getScore(){
        return score;
    }
}
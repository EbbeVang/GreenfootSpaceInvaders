import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Actor
{
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean moveLeft = true;;
    SpaceInvaderWorld world;
    
    public Enemy1(SpaceInvaderWorld world){
        this.world = world;
    }
    
    public void act() 
    {
        if (isTouching(Bullet.class)){
            world.kills.incrementInteger();
            world.removeObject(this);
            return;
        }
        
        if (moveLeft == true) move(2);
        else move(-2);
        
        if (getX() > world.getWidth()-50) moveLeft = false;
        if (getX() < 50) moveLeft = true;
            
       
        
    }    
}

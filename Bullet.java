import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 4;
    
    SpaceInvaderWorld world;
    Player player;
    
    public Bullet(SpaceInvaderWorld world, Player player){
        this.player = player;
        turn(-90);
        //setRotation(90);
    }
    
    public void act() 
    {
        move(speed);
        
        if (getY() < 10){
            player.setFiring(false);}    
}
}
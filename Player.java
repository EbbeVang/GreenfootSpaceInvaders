import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.util.ArrayList; // use of lists
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    boolean isFiring = false;
    SpaceInvaderWorld world;
    Bullet bullet;
    //ArrayList<Bullet> bullets = new ArrayList<Bullet>();
    public Player(SpaceInvaderWorld world){
        this.world = world;
        //bullet = new Bullet(world, this);
        setImage("player.png");
       
        //setImage("player.png");
    }
    
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown(" ")){
            fire();}
        if (Greenfoot.isKeyDown("left")){
            move(-4);}
        
        if (Greenfoot.isKeyDown("right")){
            move(4);}
        
        if (bullet != null)
        {
            if (bullet.getY() < 5)
            {
                world.removeObject(bullet);
                isFiring = false;
                bullet = null;
            }
        }
    }
    
    public void fire(){
        if (isFiring == false){
            isFiring = true;
            bullet = new Bullet(world, this);
            bullet.setLocation(getX(), getY()-40);
            world.addObject(bullet, getX(), getY()-40);
            Greenfoot.playSound("shoot.wav");
        }
    }
}
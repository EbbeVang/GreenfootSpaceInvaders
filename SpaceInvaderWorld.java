import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceInvaderWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class SpaceInvaderWorld extends World
{

    /**
     * Constructor for objects of class SpaceInvaderWorld.
     * 
     */
    
    Text kills;
    
    public SpaceInvaderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setBackground("tumblr_static_space-background.jpg");
        Greenfoot.playSound("spaceinvaders1.mp3");
        kills = new Text("Number of kills:", 0);
        
        init();
    }
    
    //initialize world
    public void init(){
    
       this.addObject(new Player(this),400, 550);
        
       this.addObject(new Enemy1(this), 50,50);
       this.addObject(new Enemy1(this), 50,110);
       this.addObject(new Enemy1(this), 110, 50);
       
       this.addObject(kills,80,550);
    }
}

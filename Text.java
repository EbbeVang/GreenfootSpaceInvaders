import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    private String text;
    private int integer;
    
    public Text(String text, int integer)
    {
        updateImage(text, integer);
    }
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public void setText(int integer){
    }
    
    public void incrementInteger(){
        integer++;
        updateImage(text, integer);
    }
    
    private void updateImage(String text, int integer){
        this.text = text;
        this.integer = integer;
        GreenfootImage img = new GreenfootImage( 120, 10 );
        img.clear();
        img.setColor(Color.WHITE);
        img.drawString(text+" "+integer, 5, 10 );
        setImage(img);
    }
}

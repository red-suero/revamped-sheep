import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int speed = GridManager.interval();
    private int cooldown = 0;
    public void act() 
    {
        keyCommands();
    }    
    
    public void keyCommands()
    {
        cooldown++;
        if(Greenfoot.isKeyDown("w") && cooldown >= 20 && GridManager.getGridY(getY()) > 0)
        {
            setLocation(getX(), getY() - speed);
            cooldown = 0;
        }
        else if(Greenfoot.isKeyDown("a") && cooldown >= 20 && GridManager.getGridX(getX()) > 0)
        {
            setLocation(getX() - speed, getY());
            cooldown = 0;
        }
        else if(Greenfoot.isKeyDown("s") && cooldown >= 20 && GridManager.getGridY(getY()) < GridManager.getLowerBound(getWorld()))
        {
            setLocation(getX(), getY() + speed);
            cooldown = 0;
        }
        else if(Greenfoot.isKeyDown("d") && cooldown >= 20 && GridManager.getGridX(getX()) < GridManager.getRightBound(getWorld()))
        {
            setLocation(getX() + speed, getY());
            cooldown = 0;
        }
    }
}

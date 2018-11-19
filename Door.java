import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    private Type type;
    private enum Type
    {
        PREV, NEXT;
    }
    
    public Door(Type type)
    {
        this.type = type;
    }
    
    public void act()
    {
        useDoor();
    }
    
    public void useDoor()
    {
        Room r = (Room) getWorld();
        if(GridManager.sameCoordinates(getX(), getY(), getPlayer().getX(), getPlayer().getY()))
        {
            if(type == Type.NEXT)
            {
                Greenfoot.setWorld(r.nextRoom());
            }
            else if(type == Type.PREV)
            {
                Greenfoot.setWorld(r.prevRoom());
            }
        }
    }
    
    public Player getPlayer()
    {
        List<Player> players = (List<Player>) getWorld().getObjects(Player.class);
        return players.get(0);
    }
}

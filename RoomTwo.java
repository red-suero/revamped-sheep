import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoomTwo extends Room
{
    public RoomTwo(Player p)
    {
        super();
        this.p = p;
        addPlayer();
    }
    
    public Room nextRoom()
    {
        return new RoomOne(p);
    }
    
    public Room prevRoom()
    {
        return new RoomOne(p);
    }
    
    public void addPlayer()
    {
        GridManager.addObject(this, p, 9, 5);
    }
}

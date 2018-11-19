import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Room extends World
{
    protected Player p;
    public Room()
    {
        super(1280, 720, 1);
        GridManager.drawGrid(this);
        GridManager.setInterval(80);
    }
    
    public abstract Room nextRoom();
    public abstract Room prevRoom();
    public abstract void addPlayer();
}

import greenfoot.*;

public class GridManager  
{
    private static int interval = 80;
    public static void addObject(World w, Actor o, int gridX, int gridY)
    {
        w.addObject(o, interval/2 + gridX * interval, interval/2 + gridY* interval);
    }
    
    public static void drawGrid(World w)
    {
        int a = w.getHeight()/interval - 1;
        int c = 0;
        for(int i = 0; i <= a; i++)
        {
            addDots(w, c);
            c++;
        }
    }
    
    public static void addDots(World w, int c)
    {
        int b = w.getWidth()/interval - 1;
        for(int i = 0; i <= b; i++)
        {
            w.addObject(new Dot(i, c), interval/2 + interval * i,  interval/2 + c * interval);
        }
    }
    
    public static int getLeftBound(World w)
    {
        return 0;
    }
    
    public static int getUpperBound(World w)
    {
        return 0;
    }
    
    public static int getRightBound(World w)
    {
        return w.getWidth()/interval - 1;
    }
    
    public static int getLowerBound(World w)
    {
        return w.getHeight()/interval - 1;
    }
    
    public static int getGridX(int x)
    {
        return (interval/2 + x)/interval - 1;
    }
    
    public static int getGridY(int y)
    {
        return (interval/2 + y)/interval - 1;
    }
    
    public static void setInterval(int newInterval)
    {
        interval = newInterval;
    }
    
    public static int interval()
    {
        return interval;
    }
    
    public static boolean sameCoordinates(int aX, int aY, int bX, int bY)
    {
        if(aX == bX && aY == bY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
        public static class Dot extends Actor
        {
            private int gridX;
            private int gridY;
            public Dot(int x, int y)
            {
                getImage().scale(10, 10);
                this.gridX = x;
                this.gridY = y;
            }
    
            public int getGridX()
            {
                return gridX;
            }
            
            public int getGridY()
            {
                return gridY;
            }
        }
}



import info.gridworld.actor.Bug;


public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int turned = 0;
    private boolean act = true;

    public ZBug(int length, int Z)
    {
        steps = 0;
        sideLength = length;
        
    }


    public void act()
    {
        if(act) {
        if(turned == 0 || turned == 2) {
        setDirection(90);
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            turn();
            turn();
            steps = 0;
            if(turned == 0) turned = 1;
            if(turned == 2) act = false;
        }
        } else if(turned == 1){
            if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            setDirection(90);
            steps = 0;
            turned = 2;
        }
        } else if(turned == 2) {
            
        }
        } else {
            setDirection(90);
        }
    }
}

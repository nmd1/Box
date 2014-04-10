

import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int steps;
    private int[] sideLength;
    private boolean act = true;

    public DancingBug(int length[])
    {
        steps = 0;
        sideLength = length;
        
    }

    public void act()
    {

        int turns = sideLength[steps];
            for(int t = turns; t > 0; t--) {
                turn();
            }
        move();
        if(steps < sideLength.length - 1) {
            steps++;
        } else {
            steps = 0;
        }
    }
}

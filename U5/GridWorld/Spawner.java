/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class Spawner extends Bug
{
    private int steps;
    private int[] turns;
    Location loc;
    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public Spawner(int[] arr)
    {
        steps = 0;
        turns = new int[arr.length];
        turns = arr;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        int temp = turns[steps];
        int i = 0;
        Grid<Actor> gr = getGrid();
        
        for (i = 0; i < temp; i++)
        {
            turn();
        }
        
        if (canMove())
        {
            Location loc = getLocation();
            move();
            Spawner spawn = new Spawner(turns);
            spawn.putSelfInGrid(gr, loc);
        }
        steps++;
        if(steps >= turns.length)
        {
            steps = 0;
        }
        
    }
}

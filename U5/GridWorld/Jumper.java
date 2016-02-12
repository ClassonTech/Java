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
public class Jumper extends Bug
{
    Location loc;
    Location twoAway;
    Location next;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public Jumper()
    {
        
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        loc = getLocation();
        twoAway = (loc.getAdjacentLocation(getDirection())).getAdjacentLocation(getDirection());
        next = loc.getAdjacentLocation(getDirection());
        if (canJump())
        {
            moveTo((loc.getAdjacentLocation(getDirection())).getAdjacentLocation(getDirection()));
        }
        else
        {
            turn();
        }
    }
   
    public boolean canJump()
    {
        Grid<Actor> gr = getGrid();
        
        for(Location l:gr.getOccupiedLocations())
        {
            if(twoAway == l)
            return false;

        }
        for(Location p:gr.getValidAdjacentLocations(next))
        {
            if(twoAway == p)
            return true;
            
        }
        return false;
    }
}
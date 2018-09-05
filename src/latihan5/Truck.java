/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author Rizky17
 */
public class Truck {
   public int cadence;
   public int gear ;
   public int speed;
   
   public Truck (int startCandence, int startSpeed, int startGear)
   {
       gear = startGear;
       cadence = startCandence;
       speed = startSpeed;
       
   }
   
   public void setCandence (int newvalue)
   {
       cadence = newvalue ;
   }
   
   public void setGear (int newvalue)
   {
       gear = newvalue ;
   }
   
   public void applybrake (int decrement )
   {
   speed = decrement;
   }
   public void speedUp (int increment)
   {
       speed = increment;
   }
   
   
}

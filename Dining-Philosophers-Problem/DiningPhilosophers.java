/**
 * DiningPhilosophers.java
 *
 * This program starts the dining philosophers problem.
 *
 * @author Gagne, Galvin, Silberschatz
 * Operating System Concepts - Tenth Edition
 * Copyright John Wiley & Sons - 2018.
 */


public class DiningPhilosophers
{  
   public static void main(String args[])
   {
      DiningServer server = new DiningServerImpl();

      Philosopher[] philosopherArray = new Philosopher[DiningServerImpl.NUM_OF_PHILS];
     
     // create the philosopher threads
     for (int i = 0; i < DiningServerImpl.NUM_OF_PHILS; i++)
         philosopherArray[i] = new Philosopher(server,i);
     
     for (int i = 0; i < DiningServerImpl.NUM_OF_PHILS; i++)
         new Thread(philosopherArray[i]).start();
   }
}

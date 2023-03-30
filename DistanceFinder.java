import java.util.*;
import java.io.*;
import java.util.HashSet;
/**
   Class for simulating finding the shortest distance
   from a city to all other cities.
*/
public class DistanceFinder
{
   private String startFrom;
   private Map<String, HashSet<DistanceTo>> directConnections;

   /**
      Construct a Distance finder.
      @param filename the file containing the connections.
   */
   public DistanceFinder(String filename)
   {
      // Read the file and intialize the instance variables


   }

   /**
      Return the city that we start from.
   */
   public String getStartingCity()
   {
      return startFrom;
   }

   /**
      Return the shortest distances.
      @return the shortest distances.
   */
   public Map<String, Integer> shortestDistances()
   {
	return null;
      // Follow the algorithm in the instruction
      // Remember the starting point is the first city in the file.
      






   }
}

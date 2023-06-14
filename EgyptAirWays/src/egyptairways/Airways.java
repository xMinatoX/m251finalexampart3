package egyptairways;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Airways {
    private String Air_ways_name;
    private ArrayList<Flight> flights ;

    public Airways() {
    }

    public Airways(String Air_ways_name) {
        this.Air_ways_name = Air_ways_name;
        flights = new ArrayList();
    }
    public void addFlight(Flight f)
    {
        if(flights.contains(f))
        {
            System.out.println("already here");
        }
        else
        {
            System.out.println("done");
            flights.add(f);
        }
 }
  public int arrivalFrequency(String arrivalCity) {
    int count = 0;
    for (Flight flight : flights) {
        if (flight.getArrival_city().equalsIgnoreCase(arrivalCity)) {
            count++;
        }
    }
    return count;
}
  public void save_Into_file(File f)throws IOException 
  {
   PrintWriter pr   = new PrintWriter(f);
   for(Flight r : flights)
   {
        pr.println(r);
   }
   pr.println(Air_ways_name);
   pr.close();
  }
     
}
//end class
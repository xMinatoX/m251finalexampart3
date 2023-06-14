package egyptairways;
import java.util.Comparator;
public class Flight implements Comparable<Flight> {
    private int flight_number;
    private String deparure_city;
    private String Arrival_city;
public Flight() {
    }
    
    public Flight(int flight_number, String deparure_city, String Arrival_city) {
        this.flight_number = flight_number;
        this.deparure_city = deparure_city;
        this.Arrival_city = Arrival_city;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public void setDeparure_city(String deparure_city) {
        this.deparure_city = deparure_city;
    }

    public void setArrival_city(String Arrival_city) {
        this.Arrival_city = Arrival_city;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public String getDeparure_city() {
        return deparure_city;
    }

    public String getArrival_city() {
        return Arrival_city;
    }

    @Override
    public String toString() {
        return "Flight{" + "flight_number=" + flight_number + ", deparure_city=" + deparure_city + ", Arrival_city=" + Arrival_city + '}';
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flight other = (Flight) obj;
        if (this.flight_number != other.flight_number) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Flight t) {
        if(this.flight_number==t.flight_number){
            return 1;
        }
        else 
            return -1;
    }
}
// End class

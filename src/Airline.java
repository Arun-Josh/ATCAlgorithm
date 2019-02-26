
public class Airline {
    String name = new String();
    int flightscount;
    Flight[] flights;

    public Airline(String name, int count) throws Exception{
        this.name         = name ;
        this.flightscount = count;
        this.flights(name);
    }

    protected Airline flights(String name) throws Exception{

        flights = new Flight[flightscount];

        //Each flight data
        for(int i=0;i<flightscount;i++){
            flights[i] = new FlightInputData().input(name);
        }

        return this;
    }

}

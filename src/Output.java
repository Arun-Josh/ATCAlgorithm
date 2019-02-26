public class Output {
    public Output(){}

    protected void displaySlots(SlotAllocation slot){

        //Slots Alloted for Chennai
        System.out.println("\nFlights in Chennai : ");
        for(int i=0;i<slot.chennai.size();i++){
            Flight flight = (Flight) slot.chennai.get(i);
            System.out.println(flight.getFlightno()+" Source Date : "+flight.getSourcedate()
                    +" Destination Date : "+flight.getDestdate());
//            System.out.pr
        }

        //Slots Alloted for Mumbai
        System.out.println("\nFlights in Mumbai : ");
        for(int i=0;i<slot.mumbai.size();i++){
            Flight flight = (Flight) slot.mumbai.get(i);
            System.out.println(flight.getFlightno());
        }

    }

    protected void details(Airline airline){

    }
}

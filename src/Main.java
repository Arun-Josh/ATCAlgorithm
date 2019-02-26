import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        int AIRLINES = 1;
        System.out.println("Welcome to Automated Slot SlotAllocation");
        Airline[] airline = new Airline[AIRLINES];

        //Inserting Airlines Data
        for(int i=0;i<AIRLINES;i++){
            System.out.print("Enter Airlines name                  : ");
            String name = scan.nextLine();
            System.out.print("Enter the number of flights operated : ");
            int flightcount = scan.nextInt();
            scan.nextLine();
            airline[i] = new Airline(name,flightcount);
        }

        //Slot Allocation
        SlotAllocation slots = new SlotAllocation();
        for(int i=0;i<AIRLINES;i++){
            for(int j=0;j<airline[i].flightscount;j++){
                slots.allocate(airline[i].flights[j]);
            }
        }

        //Displaying Allocated Slots
//        new Output().details(airline[0]);
        new Output().displaySlots(slots);


    }
}

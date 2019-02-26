import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class FlightInputData{

    public FlightInputData(){}

    protected Flight input(String airline) throws Exception{
        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter flight number                                             : ");
//        String flightno = scan.nextLine();
//        System.out.print("Enter flight size  [S/M/L]                                      : ");
//        String flightsize = scan.nextLine();
//        System.out.print("Enter the Date of Arrival at source airport  [DD-MM-YYYY]         : ");
//        String sdate = scan.nextLine();
//        System.out.print("Enter the Time at Arrival at source airport  [HH:MM]  (24 Hour)   : ");
//        String stime = scan.nextLine();
//        stime = stime.concat(":00");
//        System.out.print("Enter the Date of Arrival at destination airport  [DD-MM-YYYY]         : ");
//        String ddate = scan.nextLine();
//        System.out.print("Enter the Time at Arrival at destination airport  [HH:MM]  (24 Hour)   : ");
//        String dtime = scan.nextLine();
//        dtime = dtime.concat(":00");
//        System.out.print("Enter Ground time at source Airport             [HH:MM] (24hour) : ");
//        String gtsource = scan.nextLine();
//        gtsource = gtsource.concat(":00");
//        System.out.print("Enter Ground time at destination Airport        [HH:MM] (24hour) : ");
//        String gtdest = scan.nextLine();
//        gtdest = gtdest.concat(":00");
//        System.out.print("Enter Source Airport                                            : ");
//        String sourceport = scan.nextLine();
//        System.out.print("Enter Destination Airport                                       : ");
//        String destport = scan.nextLine();

        // Will be later changed ( Allocation Status )
        boolean allocationstatus = false;

        //Testing values
        Random rand = new Random();
        String flightno = Integer.toString(rand.nextInt(10000));
        String flightsize = "M";
        String sday = "16-10-2019";
        String stime = "06:30:00";
        String dday = "16-10-2019";
        String dtime = "05:50:00";
        String gtsource = "00:30:00";
        String gtdest   = "00:30:00";
        String sourceport = "chennai";
        String destport = "mumbai";

        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        Date sourcedate = dateformat.parse(sday);
        Date destdate   = dateformat.parse(dday);
        SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss");
        Date sourcetime = timeformat.parse(stime);
        Date desttime   = timeformat.parse(dtime);
        Date gts = timeformat.parse(gtsource);
        Date gtd = timeformat.parse(gtdest);

        return new Flight(airline, flightno,flightsize,sourcedate,destdate, sourcetime, desttime, gts, gtd, sourceport.toLowerCase(),destport.toLowerCase(), allocationstatus);

    }
}

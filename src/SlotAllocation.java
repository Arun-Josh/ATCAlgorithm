import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class SlotAllocation {
    LinkedList mumbai = new LinkedList();
    LinkedList chennai = new LinkedList();

    protected void allocate(Flight flight){

        if(flight.sourceport.equals("mumbai") ){
            if(isfree(flight.getSourcedate(),flight.getDestdate(),flight.getGroundtimesource(),flight.getGroundtimedest())){
                mumbai.add(flight);
                flight.setStatus(true);
                System.out.println("Slot Successfully Allocated ! ");
            }
            else{
                System.out.println("Slot already Allocated for the requested time ! ");
            }
        }
        if(flight.sourceport.equals("chennai") ){
            if(isfree(flight.getSourcedate(),flight.getDestdate(),flight.getGroundtimesource(),flight.getGroundtimedest())){
                chennai.add(flight);
                System.out.println("Slot Successfully Allocated ! ");
            } else{
                System.out.println("Slot already Allocated for the requested time ! ");
            }
        }
    }

    boolean isfree(Date sourcedate, Date destDate, Date sourcegroundtime, Date destgroundtime){
        for(int i=0;i<chennai.size();i++){
            Flight allotedflight = (Flight)chennai.get(i);
            Date allotedsourcedate = allotedflight.getSourcedate();
//            Date alloteddestdate = allotedflight.getDestdate();

            if(sourcedate.compareTo(allotedsourcedate)==0){
                return false;
            }
        }
        return true;
    }
}

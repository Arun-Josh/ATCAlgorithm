import java.util.Date;

public class Flight {
    String airline    ;
    String flightno   ;
    String flightsize ;
    Date   sourcedate ;
    Date   destdate   ;
    Date   sourcetime;
    Date   desttime;
    Date   groundtimesource ;
    Date   groundtimedest   ;
    String sourceport ;
    String destport   ;
    boolean status    ;


    public Flight(String airline, String flightno, String flightsize, Date sourcedate, Date destdate, Date sourcetime, Date desttime, Date gts, Date gtd, String sourceport, String destport, boolean status){
        this.airline    = airline;
        this.flightno   = flightno;
        this.flightsize = flightsize;
        this.sourcedate = sourcedate;
        this.destdate   = destdate;
        this.sourcetime = sourcetime;
        this.desttime   = desttime;
        this.groundtimesource = gts;
        this.groundtimedest   = gtd;
        this.sourceport = sourceport;
        this.destport   = destport;
        this.status     = status;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public String getFlightsize() {
        return flightsize;
    }

    public void setFlightsize(String flightsize) {
        this.flightsize = flightsize;
    }

    public Date getSourcedate() {
        return sourcedate;
    }

    public void setSourcedate(Date sourcedate) {
        this.sourcedate = sourcedate;
    }

    public Date getDestdate() {
        return destdate;
    }

    public void setDestdate(Date destdate) {
        this.destdate = destdate;
    }

    public String getSourceport() {
        return sourceport;
    }

    public void setSourceport(String sourceport) {
        this.sourceport = sourceport;
    }

    public String getDestport() {
        return destport;
    }

    public void setDestport(String destport) {
        this.destport = destport;
    }

    public Date getSourcetime() {
        return sourcetime;
    }

    public void setSourcetime(Date sourcetime) {
        this.sourcetime = sourcetime;
    }

    public Date getDesttime() {
        return desttime;
    }

    public void setDesttime(Date desttime) {
        this.desttime = desttime;
    }

    public Date getGroundtimesource() {
        return groundtimesource;
    }

    public void setGroundtimesource(Date groundtimesource) {
        this.groundtimesource = groundtimesource;
    }

    public Date getGroundtimedest() {
        return groundtimedest;
    }

    public void setGroundtimedest(Date groundtimedest) {
        this.groundtimedest = groundtimedest;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

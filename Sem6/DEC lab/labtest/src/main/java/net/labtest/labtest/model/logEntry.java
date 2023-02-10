package net.labtest.labtest.model;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.Duration;
import java.time.temporal.Temporal;
import java.util.Date;

@Entity
@Table (name="userEntry")

public class logEntry {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "date")
    private Date edate;
    @Column(name = "sleeptime")
    private Time sleepTime;
    @Column(name = "wakeuptime")
    private Time wakeupTime;

    @Column(name = "totalsleeptime")
    private Duration totalTime;

    public void setId(long id) {
        this.id = id;
    }
    public void setEdate(Date edate){
        this.edate = edate;
    }

    public void setWakeupTime(Time sleepTime){
        this.sleepTime=sleepTime;
    }

    public void setSleepTime(Time sleepTime) {
        this.sleepTime = sleepTime;
    }

    public void setTotalTime() {
        this.totalTime = Duration.between((Temporal) sleepTime, (Temporal) wakeupTime);
    }

    public long getId() { return id; }
    public Date getEdate(){
        return edate;
    }

    public Time getSleepTime() { return sleepTime; }

    public Duration getTotalTime() {
        return totalTime;
    }

    public Time getWakeupTime() {
        return wakeupTime;
    }
}



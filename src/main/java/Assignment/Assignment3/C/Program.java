package Assignment.Assignment3.C;

import java.util.Calendar;

public class Program {
    private String name;
    private Calendar startTime=Calendar.getInstance();
    private Calendar endTime=Calendar.getInstance();

    public Program(String name, Calendar startTime, Calendar endTime) {
        this.name = name;
        this.startTime=startTime;
        this.startTime.set(Calendar.MINUTE,0);
        this.startTime.set(Calendar.SECOND,0);
        this.endTime=endTime;
        this.endTime.set(Calendar.MINUTE,0);
        this.startTime.set(Calendar.SECOND,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }
    public long leftTime(Calendar now){
        if (this.startTime.getTimeInMillis()<now.getTimeInMillis()){
            return 0;
        }else{
            return Math.round((float) (this.startTime.getTimeInMillis() - now.getTimeInMillis()) /3600000);
        }
    }
}

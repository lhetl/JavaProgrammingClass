package Assignment.Assignment3.B.Question10_1;

import java.time.LocalTime;

public class Time {
    private long hour;
    private long min;
    private long sec;
    public Time() {
        LocalTime getNow=LocalTime.now();
        this.hour= getNow.getHour();
        this.min=getNow.getMinute();
        this.sec=getNow.getSecond();
    }
    public Time(long millisec){
        setTime(millisec);
    }
    public Time(long hour, long min, long sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public long getHour() {
        return hour;
    }

    public long getMin() {
        return min;
    }

    public long getSec() {
        return sec;
    }
    public void setTime(long elapseTime){
        long tmpTime=elapseTime;
        this.hour=(tmpTime/3600)%24;
        tmpTime%=3600;
        this.min=(tmpTime/60);
        tmpTime%=60;
        this.sec=tmpTime;
    }
}

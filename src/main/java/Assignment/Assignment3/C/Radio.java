package Assignment.Assignment3.C;

import java.util.Calendar;

public class Radio {
    private boolean on=false;
    private RadioStation radioStation;

    public Radio(boolean on, RadioStation radioStation) {
        this.on = on;
        this.radioStation = radioStation;
    }

    public boolean isOn() {
        return on;
    }

    public RadioStation getRadioStation() {
        return radioStation;
    }

    public void setOn() {
        this.on = true;
    }
    public void setOff(){
        this.on=false;
    }

    public void setRadioStation(RadioStation radioStation) {
        this.radioStation = radioStation;
    }
    public String getStatus(Calendar now){
        if (isOn()) {
            return "StationName: " + this.radioStation.getName() +
                    "\nProgramName: " + this.radioStation.getProgram().getName() +
                    "\nStartTime: " + this.radioStation.getProgram().getStartTime().getTime() +
                    "\nleftTime: " + this.radioStation.getProgram().leftTime(now);
        }else{
            return "Radio is off";
        }
    }
}

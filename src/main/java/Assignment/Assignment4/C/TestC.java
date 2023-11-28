package Assignment.Assignment4.C;

import java.util.Calendar;

public class TestC {
    public static void main(String[] args) {
        Calendar s1=Calendar.getInstance();
        Calendar s2=Calendar.getInstance();
        Calendar s3=Calendar.getInstance();
        Calendar e1=Calendar.getInstance();
        Calendar e2=Calendar.getInstance();
        Calendar e3=Calendar.getInstance();
        Calendar now = Calendar.getInstance();
        Calendar setNow=Calendar.getInstance();
        s1.set(now.get(Calendar.YEAR),now.getTime().getMonth()+1,now.getTime().getDate()+5,12,0,0);
        s2.set(now.get(Calendar.YEAR),now.getTime().getMonth()+1,now.getTime().getDate()+6,14,0,0);
        s3.set(now.get(Calendar.YEAR),now.getTime().getMonth()+1,now.getTime().getDate()+10,15,0,0);
        e1.set(now.get(Calendar.YEAR),now.getTime().getMonth()+1,now.getTime().getDate()+5,14,0,0);
        e2.set(now.get(Calendar.YEAR),now.getTime().getMonth()+1,now.getTime().getDate()+6,16,0,0);
        e3.set(now.get(Calendar.YEAR),now.getTime().getMonth()+1,now.getTime().getDate()+10,20,0,0);
        setNow.set(now.get(Calendar.YEAR),now.getTime().getMonth()+1,now.getTime().getDate()+5,11,0,0);
        Program p1=new Program("1번",s1,e1);
        Program p2=new Program("2번",s2,e2);
        Program p3=new Program("3번",s3,e3);
        RadioStation rs1=new RadioStation("1번방송국",p1);
        RadioStation rs2=new RadioStation("2번방송국",p2);
        RadioStation rs3=new RadioStation("3번방송국",p3);
        Radio rd=new Radio(true,rs1);
        System.out.println(rd.getStatus(setNow)+"\n");
        rd.setRadioStation(rs2);
        System.out.println(rd.getStatus(setNow)+"\n");
        rd.setRadioStation(rs3);
        rd.setOff();
        System.out.println(rd.getStatus(setNow)+"\n");
    }
}

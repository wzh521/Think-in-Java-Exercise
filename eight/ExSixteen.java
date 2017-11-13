package com.wzh.thik.in.java.eight;/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * @author:Administrator
 * @date:2017/11/13
 * @description:
 */
class AlertStatus {
    public String getStatus() { return "None"; }
}

class RedAlertStatus extends AlertStatus {
    @Override
    public String getStatus() { return "Red"; };
}

class YellowAlertStatus extends AlertStatus {
    @Override
    public String getStatus() { return "Yellow"; };
}

class GreenAlertStatus extends AlertStatus {
    @Override
    public String getStatus() { return "Green"; };
}
class Starship {
    private AlertStatus status = new GreenAlertStatus();
    public void setStatus(AlertStatus istatus) {
        status = istatus;
    }
    @Override
    public String toString() { return status.getStatus(); }
}
public class ExSixteen {
    public static void main(String[] args) {
        Starship eprise = new Starship();
        System.out.println(eprise);
        eprise.setStatus(new YellowAlertStatus());
        System.out.println(eprise);
        eprise.setStatus(new RedAlertStatus());
        System.out.println(eprise);
    }
}

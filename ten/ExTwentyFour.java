package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */

 abstract class Event{
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){
        this.delayTime=delayTime;
        start();
    }
    public void start(){
        eventTime=System.nanoTime()+delayTime;
    }
    public boolean ready(){
        return System.nanoTime()>=eventTime;
    }
    public abstract void action();
}
class Controller{
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c){eventList.add(c);}
    public void run (){
        while(eventList.size()>0){
            for(Event e: new ArrayList<>(eventList)){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
class GreenhouseControlsWithFan extends Controller{
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) { super(delayTime); }
        public void action() {

       light = true;
        }
        public String toString() { return "Light is on"; }


    }
    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime); } public void action() {

             light = false;
        }
        public String toString() { return "Light is off"; }
    }
    private boolean fan = false; public class FanOn extends Event {
        public FanOn(long delayTime) { super(delayTime); }
        public void action() {
      fan = true;
        }
        public String toString() { return "Fan is on"; }
    }
    public class FanOff extends Event {
        public FanOff(long delayTime) { super(delayTime); }
        public void action() {
 fan = false;
        }
        public String toString() { return "Fan is off"; }
    }
    private boolean water = false; public class WaterOn extends Event {
        public WaterOn(long delayTime) { super(delayTime); } public void action() {
 water = true;
        }
        public String toString() {
            return "Greenhouse water is on";
        }
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) { super(delayTime); } public void action() {
 water = false;
        }
        public String toString() {


            return "Greenhouse water is off";
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event { public ThermostatNight(long delayTime) {
        super(delayTime);
    }
        public void action() {
 thermostat = "Night";
        }
        public String toString() {
            return "Thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event { public ThermostatDay(long delayTime) {
        super(delayTime);
    }
        public void action() {
            thermostat = "Day";
        }
        public String toString() {
            return "Thermostat on day setting";
        }
    }
    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime); } public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() { return "Bing!"; }
    }
    public class Restart extends Event { private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) { super(delayTime);
            this.eventList = eventList; for(Event e : eventList)
                addEvent(e);
        }
        public void action() { for(Event e : eventList) {


            e.start();
        }
            start();
        }
        public String toString() { return "Restarting system";
        }
    }
    public static class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime); } public void action() { System.exit(0); }
        public String toString() { return "Terminating";	}
    }
}
public class ExTwentyFour {
    public static void main(String[] args) {
        GreenhouseControlsWithFan gc  = new GreenhouseControlsWithFan();
               gc.addEvent(gc.new Bell(900));
        Event[] eventList =  { gc.new ThermostatNight(0), gc.new LightOn(200), gc.new FanOn(300),
                gc.new LightOff(400), gc.new FanOff(500), gc.new WaterOn(600), gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList)); if(args.length == 1)
            gc.addEvent(new GreenhouseControlsWithFan
                    .Terminate(new Integer(args[0]))); gc.run();
    }
}

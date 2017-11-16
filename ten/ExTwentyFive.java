package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */
class GreenhouseControlsWithWMG extends GreenhouseControlsWithFan {
    private boolean generator = false;
    public class WatermistGeneratorOn extends Event { public WatermistGeneratorOn(long delayTime) {
        super(delayTime);
    }
        public void action() { generator = true;
        }
        public String toString() {
            return "Water mist generator is on";
        }
    }
    public class WatermistGeneratorOff extends Event { public WatermistGeneratorOff(long delayTime) {
        super(delayTime);
    }
        public void action() { generator = false;
        }
        public String toString() {


            return "Water mist generator is off";
        }
    }
}


public class ExTwentyFive {
    public static void main(String[] args) {
        GreenhouseControlsWithWMG gc = new GreenhouseControlsWithWMG();

        Event[] eventList = {gc.new ThermostatNight(0), gc.new LightOn(200), gc.new LightOff(400), gc.new WaterOn(600), gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new WatermistGeneratorOn(1600), gc.new WatermistGeneratorOff(1800)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControlsWithWMG
                    .Terminate(new Integer(args[0])));
        gc.run();
    }

}


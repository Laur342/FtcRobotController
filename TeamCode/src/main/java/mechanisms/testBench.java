package mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class testBench {
    private DigitalChannel touchSensor;

    public void init(HardwareMap hwMap){
        touchSensor = hwMap.get(DigitalChannel.class,"touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    public boolean getTouchSensorState(){
        return !touchSensor.getState();
    }
    public boolean isTocuhSensorReleased(){
        return touchSensor.getState();
    }
}

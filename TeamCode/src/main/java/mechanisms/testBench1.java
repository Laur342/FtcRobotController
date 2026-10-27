package mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class testBench1 {

    private double ticksPerRev;
    private DcMotor motor;

    public void init(HardwareMap hmWap){

        motor - hmWap.get(DcMotor.class,"motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
    }

    public void setMotorSpeed(double speed){
        return motor.getCurrentPosition()/ ticksPerRev * 2;
    }

}

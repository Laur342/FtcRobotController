package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import mechanisms.testBench;
@TeleOp
public class touchSensor extends OpMode {

    testBench bench = new testBench()

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("touch sensor state",bench.getTouchSensorState());
    }
}

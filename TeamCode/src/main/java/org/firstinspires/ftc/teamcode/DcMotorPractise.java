package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import mechanisms.testBench1;
@TeleOp
public class DcMotorPractise extends OpMode {
    testBench1 bench = new testBench1();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }


    @Override
    public void loop() {
        bench.setMotorSpeed(0.5);
        telemetry.addData("Motor Revs",bench.getMotorRevs());
    }
}

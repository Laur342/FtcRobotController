package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import mechanisms.TestBenchDistance;

public class DistanceTest extends OpMode {
    TestBenchDistance bench = new TestBenchDistance();

    @Override
    public void init() {
        bench.init(hardwareMap);

    }


    @Override
    public void loop() {
        telemetry.addData("distance", bench.getDistance());

    }

}
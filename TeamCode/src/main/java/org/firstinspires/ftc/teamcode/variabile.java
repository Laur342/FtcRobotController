package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class variabile extends OpMode {
    @Override
    public void init() {
        int teamNumber = 120;
        double motorSpeed = 0.75;
        boolean clawClose = true;
        String teamName ="Axiom";
        int motorAngle = 90;

        telemetry.addData("Team Number",teamNumber);
        telemetry.addData("motorSpeed",motorSpeed);
        telemetry.addData("clawClose",clawClose);
        telemetry.addData("name",teamName);
    }


    @Override
    public void loop() {

    }
}

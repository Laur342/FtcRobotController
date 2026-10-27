package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp //teleop si autonomus sunt aceleasi lucruri dar diferite pe
public class robot extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello:","Your name?"); //telemetry=arata un simplu text
    }

    @Override
    public void loop() {

    }
}
}

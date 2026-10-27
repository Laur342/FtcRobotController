package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeamMemberPracrtis extends OpMode {
    boolean initDone;


    @Override
    public void init() {
        telemetry.addData("Init",initDone);
        initDone = true;
    }

    double squareinputWithSign(double input){
        double output = input * input;

        if(input < 0 ){
            output *= -1
        }
        return output

    }

    @Override
    public void loop() {
     telemetry.addData("Init",initDone);

     double yAxis = gamepad1.left_stick_y;

     telemetry.addData("left stick normal",yAxis);
     yAxis = squareinputWithSign(yAxis);
     telemetry.addData("left stick modifed", yAxis);






    }
}



package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class UserRobotLocationOpMode extends OpMode {
    RobotLocation robotLocation = new RobotLocation(0);

    @Override
    public void init() {
    robotLocation.setAngle(0);
    }


    @Override
    public void loop() {
    if (gamepad1.a){
        robotLocation.turnRobot(0.1);
    } else if (gamepad1.b) {
        robotLocation.turnRobot(-0.1);
    }
    telemetry.addData("Heading",robotLocation.getHeading());
    telemetry.addData("Angle",robotLocation.getAngle());

    }
}

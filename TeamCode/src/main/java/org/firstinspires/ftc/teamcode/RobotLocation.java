package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;

@Disabled
public class RobotLocation {

    double angle;


    public RobotLocation(double angle){
        this.angle = angle;
    }

    public double getHeading(){
        double angle = this.angle;
        while (angle > 180){
            angle -= 360;
        }
        while(angle <= -180){
            angle += 360;
        }
        return angle;

    }
    public void  turnRobot(double angleChange){
        angle += angleChange;
    }

    public void setAngle(double angle){
        this.angle = angle;
    }

    public double getAngle() {
        return this.angle;
    }

    public void changeX(double changeAmount){
        x += changeAmount;
    }
    public void setX(double x){
        this.x = x;

    }
    public double getX(){
        return this.()
    }
}

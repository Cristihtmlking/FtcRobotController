package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class variables extends OpMode {
    public void init(){
        String name="Elay";
        int teamNumber=1234;
        int motorAngle=67;
        telemetry.addData("Team Name ", name);
        telemetry.addData("Team Number ", teamNumber);
        telemetry.addData("Motor angle", motorAngle);
    }
    public void loop(){

    }
}

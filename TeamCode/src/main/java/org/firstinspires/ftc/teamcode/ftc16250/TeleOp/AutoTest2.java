package org.firstinspires.ftc.teamcode.ftc16250.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.ftc16250.Hardware.ColorSensorHardwareLeft;
import org.firstinspires.ftc.teamcode.ftc16250.Hardware.ColorSensorHardwareRight;
import org.firstinspires.ftc.teamcode.ftc16250.Hardware.HolonomicDriveAHardware;

@Autonomous
public class AutoTest2 extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();
    HolonomicDriveAHardware drive = new HolonomicDriveAHardware();
    ColorSensorHardwareLeft colorL = new ColorSensorHardwareLeft();
    ColorSensorHardwareRight colorR = new ColorSensorHardwareRight();

    public void runOpMode(){

        drive.init(hardwareMap);

       waitForStart();
            drive.moveForward(0.25,0.25,0.25,0.25,3100);
            if (colorL.getAmountRedL() >= 58){
                drive.moveForward(0.25,-0.25,0.25,-0.25,3100);
                drive.moveForward(-0.25,-0.25,-0.25,-0.25,1000);

            }
            if(colorR.getAmountRedR()>= 78){
                drive.moveForward(-0.25,0.25,-0.25,0.25,3100);
                drive.moveForward(-0.25,-0.25,-0.25,-0.25,1000);
            }

        }




        }



package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.HolonomicDriveHardware;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ColorSensorHardwareLeft;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ColorSensorHardwareRight;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.MotorArmHardware;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ManipulatorHardware;
@Autonomous
public class AutoTest extends OpMode{
    HolonomicDriveHardware drive = new HolonomicDriveHardware();
    ColorSensorHardwareLeft colorL = new ColorSensorHardwareLeft();
    ColorSensorHardwareRight colorR = new ColorSensorHardwareRight();
    MotorArmHardware arm = new MotorArmHardware();
    ManipulatorHardware servo = new ManipulatorHardware();

    @Override
    public void init() {
        drive.init(hardwareMap);
        colorL.init(hardwareMap);
        colorR.init(hardwareMap);
        arm.init(hardwareMap);
        servo.init(hardwareMap);
    }
/*starting at far blue*/
    @Override
    public void loop() {
        drive.setMotorPower(-1, 1, -1, 1);
        if (drive.getMotorRotationsFl() <= -0.64 && drive.getMotorRotationsFr() >= 0.64 && drive.getMotorRotationsBl() <= -0.64 && drive.getMotorRotationsBr() > 0.64) {
            drive.setMotorPower(0, 0, 0, 0);

            if (colorL.getAmountRedL() > 70) { //Check out how big the number is and increase by ten
                drive.setMotorPower(1, 1, 1, 1);


                if (drive.getMotorRotationsFl() >= 0.5 && drive.getMotorRotationsFr() >= 0.5 && drive.getMotorRotationsBl() >= 0.5 && drive.getMotorRotationsBr() >= 0.5) {
                    drive.setMotorPower(0, 0, 0, 0);
                    servo.setPosition(-1);
                    try {
                        // Sleep for 1 second (1000 milliseconds)
                        Thread.sleep(1000);

                        // The code after this line will be executed after the 1-second pause
                    } catch (InterruptedException e) {
                        servo.setPosition(0);
                        drive.setMotorPower(1, 1, 1, 1);
                        if (drive.getMotorRotationsFl() >= 0.5 && drive.getMotorRotationsFr() >= 0.5 && drive.getMotorRotationsBl() <= 0.5 && drive.getMotorRotationsBr() <= 0.5) {
                            drive.setMotorPower(-1, 1, -1, 1);
                            if (drive.getMotorRotationsFl() >= -1 && drive.getMotorRotationsFr() >= 1 && drive.getMotorRotationsBl() >= -1 && drive.getMotorRotationsBr() >= 1) {
                                drive.setMotorPower(-1,-1,-1,-1);
                                if (drive.getMotorRotationsFl() >=-0.5  && drive.getMotorRotationsFr() >= -0.5 && drive.getMotorRotationsBl() >= -0.5 && drive.getMotorRotationsBr() >= -0.5){
                                    drive.setMotorPower(-1,1,-1,1);
                                    if (drive.getMotorRotationsFl() >= -0.7 && drive.getMotorRotationsFr() >= 0.7 && drive.getMotorRotationsBl() >= -0.7 && drive.getMotorRotationsBr() >= 0.7){
                                        drive.setMotorPower(0,0,0,0);
                                        arm.setMotorPower(0.5);
                                        if (arm.getMotorRotationsArm() >= 0.3)/*need to figure out meassurements for linear slide*/{
                                            servo.setPosition(-1);
                                        }
                                    }
                                }


                            }
                        }
                    }
                }

            }
        } else if (colorR.getAmountRedR() > 90) {
            drive.setMotorPower(-1, -1, -1, -1);
            if (drive.getMotorRotationsFl() <= -0.5 && drive.getMotorRotationsFr() <= -0.5 && drive.getMotorRotationsBl() <= -0.5 && drive.getMotorRotationsBr() <= -0.5)/*1?*/ {
                drive.setMotorPower(0, 0, 0, 0);
                servo.setPosition(-1);
                try {
                    // Sleep for 1 second (1000 milliseconds)
                    Thread.sleep(1000);

                    // The code after this line will be executed after the 1-second pause

                } catch (InterruptedException e) {
                    servo.setPosition(0);
                    drive.setMotorPower(-1,-1,1,1);
                    if (drive.getMotorRotationsFl() >= -1 && drive.getMotorRotationsFr() >= -1 && drive.getMotorRotationsBl() <= 1 && drive.getMotorRotationsBr() <= 1){
                        drive.setMotorPower(1, 1, 1, 1);
                        if (drive.getMotorRotationsFl() >= 0.5 && drive.getMotorRotationsFr() >= 0.5 && drive.getMotorRotationsBl() <= 0.5 && drive.getMotorRotationsBr() <= 0.5) {
                            drive.setMotorPower(-1, 1, -1, 1);
                            if (drive.getMotorRotationsFl() >= -1 && drive.getMotorRotationsFr() >= 1 && drive.getMotorRotationsBl() >= -1 && drive.getMotorRotationsBr() >= 1) {
                                drive.setMotorPower(-1,-1,-1,-1);
                                if (drive.getMotorRotationsFl() >=-0.5  && drive.getMotorRotationsFr() >= -0.5 && drive.getMotorRotationsBl() >= -0.5 && drive.getMotorRotationsBr() >= -0.5){
                                    drive.setMotorPower(-1,1,-1,1);
                                    if (drive.getMotorRotationsFl() >= -0.7 && drive.getMotorRotationsFr() >= 0.7 && drive.getMotorRotationsBl() >= -0.7 && drive.getMotorRotationsBr() >= 0.7){
                                        drive.setMotorPower(0,0,0,0);
                                        arm.setMotorPower(0.5);
                                        if (arm.getMotorRotationsArm() >= 0.3)/*need to figure out meassurements for linear slide*/{
                                            servo.setPosition(-1);
                    }

                }
            }

        } else if (colorR.getAmountRedR() < 88 && colorL.getAmountRedL() < 70) {
            servo.setPosition(-1);
            try {
                // Sleep for 1 second (1000 milliseconds)
                Thread.sleep(1000);

                // The code after this line will be executed after the 1-second pause

            } catch (InterruptedException el) {
                servo.setPosition(0);
                drive.setMotorPower(-1,-1,1,1);
                if (drive.getMotorRotationsFl() >= -0.5 && drive.getMotorRotationsFr() >= -0.5 && drive.getMotorRotationsBl() <= 0.5 && drive.getMotorRotationsBr() <= 0.5){
                    drive.setMotorPower(1, 1, 1, 1);
                    if (drive.getMotorRotationsFl() >= 0.5 && drive.getMotorRotationsFr() >= 0.5 && drive.getMotorRotationsBl() <= 0.5 && drive.getMotorRotationsBr() <= 0.5) {
                        drive.setMotorPower(-1, 1, -1, 1);
                        if (drive.getMotorRotationsFl() >= -1 && drive.getMotorRotationsFr() >= 1 && drive.getMotorRotationsBl() >= -1 && drive.getMotorRotationsBr() >= 1) {
                            drive.setMotorPower(-1,-1,-1,-1);
                            if (drive.getMotorRotationsFl() >=-0.5  && drive.getMotorRotationsFr() >= -0.5 && drive.getMotorRotationsBl() >= -0.5 && drive.getMotorRotationsBr() >= -0.5){
                                drive.setMotorPower(-1,1,-1,1);
                                if (drive.getMotorRotationsFl() >= -0.7 && drive.getMotorRotationsFr() >= 0.7 && drive.getMotorRotationsBl() >= -0.7 && drive.getMotorRotationsBr() >= 0.7){
                                    drive.setMotorPower(0,0,0,0);
                                    arm.setMotorPower(0.5);
                                    if (arm.getMotorRotationsArm() >= 0.3)/*need to figure out meassurements for linear slide*/{
                                        servo.setPosition(-1);
                                    }

            }  }    }   }  }   }
        }

    }
}}
}}}}
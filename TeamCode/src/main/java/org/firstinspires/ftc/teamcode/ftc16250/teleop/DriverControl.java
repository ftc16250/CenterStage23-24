package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.DroneHardware;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.HolonomicDriveHardware;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ManipulatorHardware;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.MotorArmHardware;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
@TeleOp
public class DriverControl extends OpMode {
    HolonomicDriveHardware drive = new HolonomicDriveHardware();
    ManipulatorHardware servo = new ManipulatorHardware();
    MotorArmHardware arm = new MotorArmHardware();
    DroneHardware dServo = new DroneHardware();

    @Override
    public void init(){
        drive.init(hardwareMap);
        servo.init(hardwareMap);
        arm.init(hardwareMap);
        dServo.init(hardwareMap);
    }

    @Override
    public void loop(){
        if (gamepad1.left_stick_y>0) {
            drive.setMotorDirection(
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD
            );
            drive.setMotorPower(-1, 1, -1, 1);{

            }
        }

        if (gamepad1.left_stick_y<0) {
            // check what happens when you set negative power
            drive.setMotorPower(1, -1, 1, -1);
        }
        if (gamepad1.right_stick_y>0){

            drive.setMotorPower(1, 1, -1, -1);
        }
        if (gamepad1.right_stick_y<0){

            drive.setMotorPower(-1, -1, 1, 1);
        }
        if (gamepad1.right_bumper){

            drive.setMotorPower(-1, -1, -1, -1);
        }
        if (gamepad1.left_bumper){

            drive.setMotorPower(1, 1, 1, 1);
        }
        if(gamepad2.left_stick_y>0){
            arm.setMotorPower(0.5);
        }
        if (gamepad2.left_stick_y<0){
            arm.setMotorPower(-0.5);
        }
        if (gamepad2.a){
            servo.setPosition(-1);
        }
        if (gamepad2.b){
            servo.setPosition(1);
        }
        if (gamepad2.x){
            dServo.setServoPosition(1);
        }

        // don't spin motor if nothing is pressed
        else drive.setMotorPower(0, 0, 0, 0);
        arm.setMotorPower(0);
        servo.setPosition(0);

        telemetry.addData("Ticks Per Rotation Arm", arm.getMotorRotationsArm());
    }
    }


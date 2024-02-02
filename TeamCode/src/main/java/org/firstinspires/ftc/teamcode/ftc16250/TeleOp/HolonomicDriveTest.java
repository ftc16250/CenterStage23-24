package org.firstinspires.ftc.teamcode.ftc16250.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.ftc16250.Hardware.HolonomicDriveHardware;

import org.firstinspires.ftc.teamcode.ftc16250.Hardware.MotorArmHardware;

@TeleOp
public class HolonomicDriveTest extends OpMode {

    HolonomicDriveHardware drive = new HolonomicDriveHardware();
    MotorArmHardware arm = new MotorArmHardware();

    @Override
    public void init() {
        drive.init(hardwareMap);
        arm.init(hardwareMap);


    }

    @Override
    public void loop() {
        telemetry.addData("Ticks Per Rotation FR", drive.getMotorRotationsFr());
        telemetry.addData("Ticks Per Rotation FL", drive.getMotorRotationsFl());
        telemetry.addData("Ticks Per Rotation BL", drive.getMotorRotationsBl());
        telemetry.addData("Ticks Per Rotation BR", drive.getMotorRotationsBr());

        // test if game-pads work
        if (gamepad1.left_stick_y>0) {

            drive.setMotorPower(1, -1, 1, -1);

        }

        if (gamepad1.left_stick_y<0) {
            // check what happens when you set negative power
            drive.setMotorPower(-1, 1, -1, 1);
        }
if (gamepad1.right_bumper){

    drive.setMotorPower(1, 1, -1, -1);
}
        if (gamepad1.left_bumper){

            drive.setMotorPower(-1, -1, 1, 1);
        }
        if (gamepad1.right_stick_x>0){

            drive.setMotorPower(-1, -1, -1, -1);
        }
        if (gamepad1.right_stick_x<0){

            drive.setMotorPower(1, 1, 1, 1);
        }
        if (gamepad2.dpad_up){
            arm.setMotorPower(-1);
        }
        if (gamepad2.dpad_down){
            arm.setMotorPower(1);
        }
        // don't spin motor if nothing is pressed
        else
            arm.setMotorPower(0);
            drive.setMotorPower(0, 0, 0, 0);

    }
}

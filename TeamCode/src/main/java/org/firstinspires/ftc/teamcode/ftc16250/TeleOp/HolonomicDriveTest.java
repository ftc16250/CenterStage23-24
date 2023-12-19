package org.firstinspires.ftc.teamcode.ftc16250.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import org.firstinspires.ftc.teamcode.ftc16250.Hardware.HolonomicDriveHardware;
@TeleOp
public class HolonomicDriveTest extends OpMode {

    HolonomicDriveHardware drive = new HolonomicDriveHardware();

    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Ticks Per Rotation FrontLeft", drive.getMotorRotationsFl());
        telemetry.addData("Ticks Per Rotation Front Right", drive.getMotorRotationsFr());
        telemetry.addData("Ticks Per Rotation Back Left", drive.getMotorRotationsBl());
        telemetry.addData("Ticks Per Rotation Back Right", drive.getMotorRotationsBr());
        // test if game-pads work
        if (gamepad1.left_stick_y>0) {
            drive.setMotorDirection(
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD
            );
            drive.setMotorPower(-1, 1, -1, 1);
            drive.getMotorRotationsFl();
            drive.getMotorRotationsFr();
            drive.getMotorRotationsBr();
            drive.getMotorRotationsBl();
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
        if (gamepad1.right_stick_x>0){

            drive.setMotorPower(-1, -1, -1, -1);
        }
        if (gamepad1.right_stick_x<0){

            drive.setMotorPower(1, 1, 1, 1);
        }
        // don't spin motor if nothing is pressed
        else drive.setMotorPower(0, 0, 0, 0);
    }
}

package org.firstinspires.ftc.teamcode.ftc16250.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class HolonomicDriveAHardware {
    public DcMotor frontLeft = null;
    public DcMotor frontRight = null;
    public DcMotor backLeft = null;
    public DcMotor backRight = null;




    // get wheel motors from robot hardware config
    public void init(HardwareMap hardwareMap) {
        frontLeft = hardwareMap.dcMotor.get("frontLeftMotor");
        frontRight = hardwareMap.dcMotor.get("frontRightMotor");
        backLeft = hardwareMap.dcMotor.get("backLeftMotor");
        backRight = hardwareMap.dcMotor.get("backRightMotor");

        frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backRight.setDirection(DcMotorSimple.Direction.FORWARD);


    }




    // set the direction of all motors
    public void setMotorDirection(DcMotorSimple.Direction flDirection, DcMotorSimple.Direction frDirection, DcMotorSimple.Direction blDirection, DcMotorSimple.Direction brDirection) {
        frontLeft.setDirection(flDirection);
        frontRight.setDirection(frDirection);
        backLeft.setDirection(blDirection);
        backRight.setDirection(brDirection);
    }
    public void setMotorDirection(DcMotorSimple.Direction direction) {
        frontLeft.setDirection(direction);
        frontRight.setDirection(direction);
        backLeft.setDirection(direction);
        backRight.setDirection(direction);
    }

    // set power of all motors
    public void setMotorPower(double flPower, double frPower, double blPower, double brPower) {
        frontLeft.setPower(flPower);
        frontRight.setPower(frPower);
        backLeft.setPower(blPower);
        backRight.setPower(brPower);
    }
    public void setMotorPower(double power) {
        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);
    }
    public void moveForward(double fLSpeed, double frSpeed, double blSpeed, double brSpeed, long milliseconds){
        frontLeft.setPower(fLSpeed);
        frontRight.setPower(frSpeed);
        backLeft.setPower(blSpeed);
        backRight.setPower(brSpeed);

        try{
            Thread.sleep(milliseconds);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

}

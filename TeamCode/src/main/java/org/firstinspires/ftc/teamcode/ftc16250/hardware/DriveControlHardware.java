package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DriveControlHardware {
    public CRServo servo;
    public DcMotor motor;

    public void init(HardwareMap hardwareMap){
        servo = hardwareMap.get(CRServo.class, "cS");
        motor = hardwareMap.get(DcMotor.class, "m1");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
    public void setServoPower(double power){
        servo.setPower(power);
    }
    public void setMotorSpeed(double speed){
        motor.setPower(speed);
    }
}

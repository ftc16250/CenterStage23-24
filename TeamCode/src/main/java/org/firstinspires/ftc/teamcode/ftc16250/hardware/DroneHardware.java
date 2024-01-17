package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class DroneHardware {
    private Servo dServo;

    public void init(HardwareMap hardwareMap){
        dServo = hardwareMap.get(Servo.class, "dServo");
    }
    public void setServoPosition(double position){
        dServo.setPosition(position);
    }
}

package org.firstinspires.ftc.teamcode.ftc16250.hardware;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ManipulatorHardware {
    public Servo servo;

    public void init(HardwareMap hardwareMap) {

        servo = hardwareMap.get(Servo.class, "rS");
    }
    public void setPosition(double position) {
        servo.setDirection(Servo.Direction.REVERSE);

        servo.setPosition(position);
    }
}

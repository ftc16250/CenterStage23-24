package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.DriveControlHardware;

@TeleOp
public class DriverControl extends OpMode {
    DriveControlHardware motor = new DriveControlHardware();
    DriveControlHardware servo = new DriveControlHardware();

    public void init(){
        motor.init(hardwareMap);
        servo.init(hardwareMap);
    }
    public void loop(){
        if(gamepad2.a){
            motor.setMotorSpeed(0.5);
        }
        else if(gamepad2.b){
            motor.setMotorSpeed(-0.5);
        }
        if(gamepad2.x){
            servo.setServoPower(1);
        }
        else if(gamepad2.y){
            servo.setServoPower(-1);
        }
        else
            servo.setServoPower(0);
    }
}

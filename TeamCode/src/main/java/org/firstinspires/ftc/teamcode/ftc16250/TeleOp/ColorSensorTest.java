package org.firstinspires.ftc.teamcode.ftc16250.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import org.firstinspires.ftc.teamcode.ftc16250.Hardware.ColorSensorHardwareLeft;
import org.firstinspires.ftc.teamcode.ftc16250.Hardware.ColorSensorHardwareRight;

@TeleOp()
public class ColorSensorTest extends OpMode {
    ColorSensorHardwareLeft colorLeft = new ColorSensorHardwareLeft();
    ColorSensorHardwareRight colorRight = new ColorSensorHardwareRight();
MotorArmHardware motorArm = new MotorArmHardware();
    @Override()
    public void init(){
        colorLeft.init(hardwareMap);
        colorRight.init(hardwareMap);
    motorArm.init(hardwareMap);
    }

    @Override()
    public void loop(){
        telemetry.addData("Amount of Color Left", colorLeft.getAmountRedL());
        telemetry.addData("Amount of Color Right", colorRight.getAmountRedR());
        if (colorLeft.getAmountRedL() > 58){
            motorArm.setMotorArmSpeed(1);
        } else if (colorRight.getAmountRedR() > 88){
            motorArm.setMotorArmSpeed(-1);
        } else {
            motorArm.setMotorArmSpeed(0);
        }

    }
}

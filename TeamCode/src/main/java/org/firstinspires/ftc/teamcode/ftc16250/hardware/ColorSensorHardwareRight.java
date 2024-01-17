package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.ColorRangeSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ColorSensorHardwareRight {
    private ColorRangeSensor colorRight;

    public void init(HardwareMap hwMap){
        colorRight = hwMap.get(ColorRangeSensor.class, "colorRight");
    }
    public int getAmountRedR(){
        return colorRight.red();
    }
}

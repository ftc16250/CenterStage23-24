package org.firstinspires.ftc.teamcode.ftc16250.Hardware;

import com.qualcomm.robotcore.hardware.ColorRangeSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ColorSensorHardwareFront {
    private ColorRangeSensor colorFront;

    public void init(HardwareMap hwMap) {
        colorFront = hwMap.get(ColorRangeSensor.class, "colorFront");
    }
    public  int getAmountRedF(){
        return colorFront.red();
    }
}


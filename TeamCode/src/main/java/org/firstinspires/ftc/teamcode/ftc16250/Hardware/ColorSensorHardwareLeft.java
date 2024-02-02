package org.firstinspires.ftc.teamcode.ftc16250.Hardware;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.ColorRangeSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ColorSensorHardwareLeft {
    private ColorRangeSensor colorLeft;

    public void init(@NonNull HardwareMap hwMap) {
        colorLeft = hwMap.get(ColorRangeSensor.class, "colorLeft");
    }
    public  int getAmountRedL(){
        return colorLeft.red();
    }
}


package org.firstinspires.ftc.teamcode.ftc16250.Hardware;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.ColorRangeSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ColorSensorHardwareRight {

    private  ColorRangeSensor colorRight = null;
    public void init(@NonNull HardwareMap hwMap) {
        colorRight = hwMap.get(ColorRangeSensor.class, "colorRight");
    }
    public  int getAmountRedR(){
        return colorRight.red();
    }
}


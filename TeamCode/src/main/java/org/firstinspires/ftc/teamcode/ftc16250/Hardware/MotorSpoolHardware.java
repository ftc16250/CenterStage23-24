package org.firstinspires.ftc.teamcode.ftc16250.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MotorSpoolHardware {

        private DcMotor motorSpool;

        public void init(HardwareMap hardwareMap){
            motorSpool = hardwareMap.dcMotor.get("motorArm");

            motorSpool.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
        public void setMotorDirection(DcMotorSimple.Direction direction){
            motorSpool.setDirection(direction);

        }
        public void setMotorPower(double power){
            motorSpool.setPower(power);
        }

        }

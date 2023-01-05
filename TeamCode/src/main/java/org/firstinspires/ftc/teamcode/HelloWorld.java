package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous() //this determines which category (auto or teleop) that this code falls under
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "Justin");// this string will display on the driver station as "caption: value"
        telemetry.addData("Grade", "9");
    }

    @Override
    public void loop() {


    }
}



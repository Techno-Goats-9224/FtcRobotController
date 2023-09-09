package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class sidewaysClawTest extends OpMode {
    Servo claw;
    @Override
    public void init() {
        claw=hardwareMap.get(Servo.class,"claw");
        telemetry.addData("Status", "Initialized");
        telemetry.update();


        // run until the end of the match (driver presses STOP)

    }
    @Override
    public void init_loop() {
    }
    @Override
    public void start() {
    }
    @Override
    public void loop() {
        if (gamepad1.a){
            claw.setPosition(90);
        }
        claw.setPosition(0);
    }
    @Override
    public void stop() {
    }
}

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;

@TeleOp(name="DriverControlled", group="TeleOp")

public class DriverControlled extends OpMode{

    // define robot
    RobotHardware robot   = new RobotHardware();

    //run once on init()
    @Override
    public void init() {
        telemetry.addData("STATUS", "Beginning Initialization");
        robot.init(hardwareMap);
        telemetry.addData("STATUS", "Initialized");
    }

    // loop on init()
    @Override
    public void init_loop() {
    }

    // code that runs once on start()
    @Override
    public void start() {
    }

    // loops on start(), main opMode
    @Override
    public void loop() {

        double Y = gamepad1.right_stick_y;
        double X = gamepad1.right_stick_x;
        double R = gamepad1.left_stick_x;


        boolean g2_LB = gamepad2.left_bumper;
        boolean g2_RB = gamepad2.right_bumper;
        boolean g2_dpad_up = gamepad2.dpad_up;
        boolean g2_dpad_down = gamepad2.dpad_down;

        //robot movement
        robot.frontLeftMotor.setPower(Y + X - R);
        robot.backLeftMotor.setPower(Y - X - R);
        robot.frontRightMotor.setPower(-Y + X - R);
        robot.backRightMotor.setPower(-Y -X - R);

        //intake motors will
        if(g2_LB){
            robot.intakeRightMotor.setPower(1.0);
            robot.intakeLeftMotor.setPower(-1.0);
        }
        else (g2_LB){
            robot.intakeRightMotor.setPower(0.0);
            robot.intakeLeftMotor.setPower(0.0);
        }

        if (g2_dpad_up){
            robot.frontArmMotor.setPower(1.0);
            robot.backArmMotor.setPower(1.0);

        }
        else if(g2_dpad_down){
            robot.frontArmMotor.setPower(-1.0);
            robot.backArmMotor.setPower(-1.0);
        }
        else {
            robot.frontArmMotor.setPower(0.0);
            robot.backArmMotor.setPower(0.0);
        }



    }

    // runs once
    @Override
    public void stop() {
        //could set servo arm back to zero etc.
    }
}
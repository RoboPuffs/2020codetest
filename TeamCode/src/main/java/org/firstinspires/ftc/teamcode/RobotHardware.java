package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.*;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.CRServo;


public class RobotHardware
{
    // instantiate motors and servos
    public DcMotor frontLeftMotor;
    public DcMotor frontRightMotor;
    public DcMotor backLeftMotor;
    public DcMotor backRightMotor;
    public Servo outtakeServo;
    public DcMotor intakeLeftMotor;
    public DcMotor intakeRightMotor;
    public DcMotor frontArmMotor;
    public DcMotor backArmMotor;

    // creating the hardware map
    HardwareMap hardwareMap;


    // making a method to later call upon in opMode
    // use it to declare everything in our robot
    public void init(HardwareMap hardwareMap) {

        // Defining motors and servos
        frontLeftMotor = hardwareMap.get(DcMotor.class, "flm");
        frontRightMotor = hardwareMap.get(DcMotor.class, "frm");
        backLeftMotor = hardwareMap.get(DcMotor.class, "blm");
        backRightMotor = hardwareMap.get(DcMotor.class, "brm");
        intakeLeftMotor = hardwareMap.get(DcMotor.class, "ilm");
        intakeRightMotor = hardwareMap.get(DcMotor.class, "irm");
        frontArmMotor = hardwareMap.get(DcMotor.class, "fam");
        backArmMotor = hardwareMap.get(DcMotor.class, "bam");


        // set motor power
        frontLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        intakeRightMotor.setPower(0);
        intakeLeftMotor.setPower(0);
        frontArmMotor.setPower(0);
        backArmMotor.setPower(0);

        // set motor mode
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_WITH_ENCODER); //...RunMode.RUN_TO_POSITION - for autonomous when you want to use encoder positions
        frontRightMotor.setMode(DcMotor.RunMode.RUN_WITH_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_WITH_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.RUN_WITH_ENCODER);


        // set motor zeroPowerBehavior
        frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE); //...zeroPowerBehavior.float we want it to stop exactly when set to zero
        frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intakeLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intakeRightMotor.setZeroPowerBehabior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontArmMotor.setZeroPowerBehabior(DcMotor.ZeroPowerBehavior.BRAKE);
        backArmMotor.setZeroPowerBehabior(DcMotor.ZeroPowerBehavior.BRAKE);

    }


}
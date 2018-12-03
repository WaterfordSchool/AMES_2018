/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc.team3245.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap  {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Talon driveTrainLeftFrontMotor, driveTrainLeftRearMotor, driveTrainRightFrontMotor, driveTrainRightRearMotor;
  
    public static DifferentialDrive driveTrainTDrive;

    public static Talon dumpOne;
    public static Talon Shooter;
    public static Talon dumpTwo;

    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        //Drive Train
        driveTrainLeftFrontMotor = new Talon(0);
        driveTrainLeftFrontMotor.setSafetyEnabled(false);
        //LiveWindow.addActuator("DriveTrain", "Left Front Motor", (WPI_TalonSRX) driveTrainLeftFrontMotor);
        //driveTrainLeftFrontMotor.setInverted(false);
        //driveTrainLeftRearMotor = new Talon(1);
        //LiveWindow.addActuator("DriveTrain", "Left Rear Motor", (WPI_TalonSRX) driveTrainLeftRearMotor);
        //driveTrainLeftRearMotor.follow(driveTrainLeftFrontMotor);
        //SpeedControllerGroup m_left = new SpeedControllerGroup(driveTrainLeftFrontMotor, driveTrainLeftRearMotor);
        //m_left.setInverted(false);
        
        driveTrainRightFrontMotor = new Talon(3);
        driveTrainLeftFrontMotor.setSafetyEnabled(false);
        //driveTrainRightRearMotor = new Talon(4);
        //SpeedControllerGroup m_right = new SpeedControllerGroup(driveTrainRightFrontMotor, driveTrainRightRearMotor);
        //m_right.setInverted(true);
        
        driveTrainTDrive = new DifferentialDrive(driveTrainLeftFrontMotor, driveTrainRightFrontMotor);
        
        //
  /**      driveTrainGyro1 = new ADXRS450_Gyro();
        LiveWindow.addSensor("DriveTrain", "Gyro 1", driveTrainGyro1);
        //driveTrainGyro1.setSensitivity(0.007);
        
        //Encoders
        driveTrainLeftEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "Left Encoder", driveTrainLeftEncoder);
        driveTrainLeftEncoder.setDistancePerPulse(1.0);
        driveTrainLeftEncoder.setPIDSourceType(PIDSourceType.kRate);
        driveTrainRightEncoder = new Encoder(3, 4, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "Right Encoder", driveTrainRightEncoder);
        driveTrainRightEncoder.setDistancePerPulse(1.0);
        driveTrainRightEncoder.setPIDSourceType(PIDSourceType.kRate);

        //Intake
        intakeIntakeMotor = new WPI_TalonSRX(5);
        LiveWindow.addActuator("Intake", "Intake Motor", (WPI_TalonSRX) intakeIntakeMotor);
        intakeIntakeMotor.setInverted(false);
        
        //Elevator

        ElevatorMotor = new WPI_TalonSRX(11);
        //LiveWindow.addActuator("Elevator", "Elevator Motor", (WPI_TalonSRX) elevatorMotor);
        //elevatorMotor.setInverted(false);        
        
        elevatorEDrive = new DifferentialDrive(ElevatorMotor, ElevatorMotor);

        
        //Cart
        LeftCartWheel = new WPI_TalonSRX(7);
        RightCartWheel = new WPI_TalonSRX(12);
        LeftCartArm = new WPI_TalonSRX(1);
        RightCartArm = new WPI_TalonSRX(13);
   */

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

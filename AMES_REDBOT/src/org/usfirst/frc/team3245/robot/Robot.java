/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3245.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Servo;

public class Robot extends IterativeRobot {
	Talon leftdrive0 = new Talon(0);
	Talon rightdrive3 = new Talon(3);
	Talon cam6 = new Talon(6);
	Servo servoThing = new Servo(7);
	DifferentialDrive tDrive = new DifferentialDrive(leftdrive0, rightdrive3);
	Joystick driverController = new Joystick (0);
	JoystickButton rightTrigger  = new JoystickButton(driverController, 7);
	JoystickButton leftTrigger = new JoystickButton(driverController, 6);

	private double autoStartTime;
	
	@Override
	public void robotInit() {
		servoThing.set(0);

	}

	@Override
	public void autonomousInit() {

		autoStartTime = Timer.getFPGATimestamp();
		
	}


	@Override
	public void autonomousPeriodic() {

		
		double currTime = Timer.getFPGATimestamp();
		double timeElapsed = currTime - autoStartTime;
		
		//Drive Foward at half speed for 4 seconds
		if (timeElapsed < 4) {
			tDrive.tankDrive(0.5, 0.5);
		}
		
		//Cam Start
		else if (timeElapsed < 6) {
			cam6.set(1);
		}
		
		//Cam Stop
		
		//Back Up
		else if (timeElapsed < 8) {
			tDrive.tankDrive(-0.5,- 0.5);
		}
		
		//Turn Right 1.5 Seconds
		
		else if (timeElapsed < 9.5) {
			tDrive.tankDrive(-0.5, 0.5);
		}
		
	}
		
		
	@Override
	public void teleopPeriodic() {
		double motorSpeed = 1.0;
		tDrive.tankDrive(-driverController.getY()*motorSpeed, -driverController.getAxis(AxisType.kThrottle)*motorSpeed);
	
		if (driverController.getRawButtonPressed(7)) {
			cam6.set(1.0);
			}
		else if(driverController.getRawButtonPressed(6)){
			cam6.set(-1.0);
			}
		
		else if (driverController.getRawButtonPressed(3)) {
			servoThing.setSpeed(0.5); //might need to do angles
		}
		
		else if (driverController.getRawButtonPressed(2)) {
			servoThing.setSpeed(-0.5); //might need to do angles
		}
		
		else {
			cam6.set(0);
			}
		
		
	}

	@Override
	public void testPeriodic() {
	}
}

//Check if motor speed is appropriate for driver
//Test this on robot
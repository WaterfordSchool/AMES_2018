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
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Talon;

public class Robot extends IterativeRobot {
	Talon leftdrive0 = new Talon(0);
	Talon rightdrive3 = new Talon(3);
	Talon cam6 = new Talon(6);
	DifferentialDrive tDrive = new DifferentialDrive(leftdrive0, rightdrive3);
	Joystick driverController = new Joystick (0);
	Joystick operatorController = new Joystick (1);
	


	@Override
	public void robotInit() {

	}

	@Override
	public void autonomousInit() {

	}


	@Override
	public void autonomousPeriodic() {

		}

	@Override
	public void teleopPeriodic() {
		double motorSpeed = 1.0;
		tDrive.tankDrive(-driverController.getY()*motorSpeed, -driverController.getAxis(AxisType.kThrottle)*motorSpeed);
	
		if (operatorController.getY() > 0.05) {
			cam6.set(operatorController.getY());
			}
		else if(operatorController.getY() < -0.05){
			cam6.set(operatorController.getY());
			}
		else {
			cam6.set(0);
			}
	}

	@Override
	public void testPeriodic() {
	}
}

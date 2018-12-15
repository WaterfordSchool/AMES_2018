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
import edu.wpi.first.wpilibj.PWMSpeedController;
import java.sql.Time;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;

public class Robot extends IterativeRobot {
	
	private double autoStartTime;
	
	
	Accelerometer accel = new BuiltInAccelerometer();
	double xVal,maxX,yVal,maxY,zVal,maxZ;
	
	/* 
	 * This is just some gyro code I would like to test in the future if we ever get gyro on one of these fleets
	 * 
	 * AnalogGyro testgyro = new AnalogGyro(0);
	 * 
	 */
	
	int dbValue = -1;
	
	//double fastleft = 1, fastright = 1, slowleft = .5, slowright = .5;

	Joystick driverController = new Joystick (0);
	Joystick operatorController = new Joystick (1);
	
	
	Talon leftdrive0 = new Talon(0) ;
	Talon rightdrive3 = new Talon(3);
	Talon cam6 = new Talon(6);
	DifferentialDrive tDrive = new DifferentialDrive(leftdrive0, rightdrive3);
	
	
	double leftdrive = 3, rightdrive = 3;
	
	/*public void reset() {
		autoStartTime
	}
	*/
	
	@Override
	public void robotInit() {
		
		
		// SmartDashboard.putString("DB/String 0", "Auto Routines;");
		
		
	}
	//
	private void driveStraight(double time){		
		leftdrive0.set(leftdrive/2);
		
		rightdrive3.set(-rightdrive/2);
	
		leftdrive0.setExpiration(time);	
		
		rightdrive3.setExpiration(time);
		
		leftdrive0.set(0);
		
		rightdrive3.set(0);
		
		
		
	}

	@Override
	public void autonomousInit() { 
		autoStartTime = Timer.getFPGATimestamp();
		//driveStraight(5);
	
	}
	/*
	 * drive past auto line, drops off a cube, goes along the track as far as possible. all in auto
	 */
	@Override
	public void autonomousPeriodic() {

		double currTime = Timer.getFPGATimestamp();

		double timeElapsed = currTime - autoStartTime;
		
		//drive straight
		if (timeElapsed < 2.5) {
			tDrive.tankDrive(-1, 1);
			if (timeElapsed>2&&timeElapsed<4) {
				cam6.set(0.5);
			}
		}
		
		//turn left
		else if (timeElapsed < 4) {
			tDrive.tankDrive(-0.3, 0.5);
		}
		
		//go straight
		else if (timeElapsed < 8) {
			tDrive.tankDrive(-1, 1);
		}
		
		//stop
		else if (timeElapsed < 8.5) {
			tDrive.tankDrive(0, 0);
		}
		
		//turn left
		else if (timeElapsed < 10) {
			tDrive.tankDrive(-0.8, 1.0);
		}
		
		//go forward
		else if (timeElapsed < 14) {
			tDrive.tankDrive(-1, 1);
		}
		
		//turn left
		else if (timeElapsed < 15) {
			tDrive.tankDrive(1, 1);
		}
		
	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
	
	private void turn(double time) {
		leftdrive0.set(leftdrive);
		rightdrive3.set(rightdrive);
			
		Timer.delay(2);
			
	}
	
	
	private void stop() {
			
		leftdrive0.set(0);	
							
		rightdrive3.set(0);
					
	}				
	
	
	

				
	//private void driveStraight(double time) {
	//double tF=Timer.getFPGATimestamp();
	//tF+= time;
	//double t=Timer.getFPGATimestamp();
	//while (t<tF)	
	// 	t=Timer.getFPGATimestamp();
		//leftdrive0.set(leftdrive/2);
			
		//rightdrive3.set(-rightdrive/2);
	
		//leftdrive0.setExpiration(time);	
		
		//rightdrive3.setExpiration(time);
		
		//leftdrive0.set(0);
		
		//rightdrive3.set(0);
	
	@Override
	
	public void teleopInit() {
		maxX = 0;
		maxY = 0;
		maxZ = 0;
	}

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

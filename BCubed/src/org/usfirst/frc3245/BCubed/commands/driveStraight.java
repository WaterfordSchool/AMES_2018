package org.usfirst.frc3245.BCubed.commands;

import org.usfirst.frc3245.BCubed.Robot;
import org.usfirst.frc3245.BCubed.RobotMap;
import org.usfirst.frc3245.BCubed.subsystems.*;

import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class driveStraight extends DriveTrain{
	
	double speed;
	
	public driveStraight() {
		
		requires(Robot.driveTrain);
	}
	
	private void requires(DriveTrain driveTrain) {
		// TODO Auto-generated method stub
		
	}

	protected void initialize(){

	}
	protected void execute() {
		
		RobotMap.driveTrainTDrive.tankDrive(0.7, 0.7);
	
	}
	
	protected void interrupted() {
		end();
	}

protected boolean isFinished() {
	return false;
}

	protected void end() {
		
	}
	
}

  
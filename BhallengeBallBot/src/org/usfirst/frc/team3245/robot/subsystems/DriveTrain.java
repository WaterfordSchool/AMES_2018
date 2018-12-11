package org.usfirst.frc.team3245.robot.subsystems;

import org.usfirst.frc.team3245.robot.RobotMap;
import org.usfirst.frc.team3245.robot.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.Talon;
//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class DriveTrain extends Subsystem {
	
	//private final Talon leftFrontMotor = RobotMap.driveTrainLeftFrontMotor;
	//private final Talon leftRearMotor = RobotMap.driveTrainLeftRearMotor;
	//private final Talon rightFrontMotor = RobotMap.driveTrainRightFrontMotor;
	//private final Talon rightRearMotor = RobotMap.driveTrainRightRearMotor;
	private final DifferentialDrive tDrive = RobotMap.driveTrainTDrive;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new TankDrive(0.7));
    }
    
    public void drive(double left, double right) {
    	tDrive.tankDrive(right, left);
    }
    
    public void drive(Joystick joy, double kSpeed) {
    	drive(kSpeed*joy.getY(), kSpeed*joy.getRawAxis(3));
    
    	//SmartDashboard.putNumber("Right Motor Speed", rightFrontMotor.get());
    	//SmartDashboard.putNumber("Left Moter Speed", leftFrontMotor.get());
    }
    
}


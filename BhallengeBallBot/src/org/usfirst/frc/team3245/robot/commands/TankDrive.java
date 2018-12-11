package org.usfirst.frc.team3245.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3245.robot.Robot;
import org.usfirst.frc.team3245.robot.RobotMap;
/**
 *
 */
public class TankDrive extends Command {
	
	double speed;

    public TankDrive(double kSpeed) {
        requires(Robot.driveTrain);
        speed = kSpeed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.drive(Robot.oi.getDriver(), speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.drive(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}

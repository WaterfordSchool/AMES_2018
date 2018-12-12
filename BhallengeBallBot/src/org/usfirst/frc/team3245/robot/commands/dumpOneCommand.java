package org.usfirst.frc.team3245.robot.commands;

import org.usfirst.frc.team3245.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
//import org.usfirst.frc.team3245.robot.subsystems.*;
/**
 *
 */
public class dumpOneCommand extends Command {
	//double speed;
    public dumpOneCommand() {
    	requires(Robot.dumpOneNew);
    }

    protected void execute() {
    	
    	Robot.dumpOneNew.activate(Robot.oi.getOperator());
    	
    	//setTimeout(0.3);
      	//Robot.dumpOneNew.armDump();
    	
    }

    // Called repeatedly when this Command is scheduled to run

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return false;
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.dumpOneNew.stop();
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}

package org.usfirst.frc3245.BCubed.commands;

import org.usfirst.frc3245.BCubed.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Launch extends Command {

    public Launch() {
       
    	requires(Robot.shooter);
    	
    }

    protected void initialize() {
    }

    protected void execute() {
    	setTimeout(0.5);
    	Robot.shooter.launch();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.shooter.stop();
    }

    protected void interrupted() {
    }
}

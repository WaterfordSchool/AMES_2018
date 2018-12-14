package org.usfirst.frc3245.BCubed.commands;

import org.usfirst.frc3245.BCubed.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LaunchStop extends Command {

    public LaunchStop() {
        
    	requires(Robot.shooter);
    	
    }

    protected void initialize() {
    }

    protected void execute() {
    	setTimeout(0.0);
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

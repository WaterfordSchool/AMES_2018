package org.usfirst.frc3245.BCubed.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class commandAutonomous extends CommandGroup {

    public commandAutonomous() {
        
    	addSequential(new Launch());
    	addParallel(new driveStraight(), 0.8);
    }

}

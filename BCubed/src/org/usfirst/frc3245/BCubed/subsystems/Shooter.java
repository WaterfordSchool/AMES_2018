package org.usfirst.frc3245.BCubed.subsystems;

import org.usfirst.frc3245.BCubed.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

   private final SpeedController shot = RobotMap.shooshter;

    public void initDefaultCommand() {
    }
    
    public void launch() {
    	shot.set(1.0);
    }
    
    public void stop() {
    	shot.set(0);
    }
    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
}


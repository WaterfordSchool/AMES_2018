package org.usfirst.frc.team3245.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class dumpOne extends Subsystem {
	private final Talon dumpOne = RobotMap.dumpOne;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void armDump(double dumpSpeed) {
    	dumpOne.set(dumpSpeed);
      	dumpOne.set(-dumpSpeed);
    	
   
    }
    public void stop() {
    	dumpOne.set(0);
    
    }
}


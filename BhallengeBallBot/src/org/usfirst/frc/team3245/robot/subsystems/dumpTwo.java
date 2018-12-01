+package org.usfirst.frc.team3245.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class dumpTwo extends Subsystem {
	private final Talon dumpTwo = RobotMap.dumpTwo;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void armDump(double dumpSpeed) {
    	dumpTwo.set(dumpSpeed);
      	dumpTwo.set(-dumpSpeed);
    	
    	
   
    }
    public void stop() {
    	dumpTwo.set(0);
    
    }
}


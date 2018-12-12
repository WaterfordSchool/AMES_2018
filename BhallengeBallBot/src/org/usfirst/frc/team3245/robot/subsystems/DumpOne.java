package org.usfirst.frc.team3245.robot.subsystems;

import org.usfirst.frc.team3245.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DumpOne extends Subsystem {
private final Talon dumpOneLocal = RobotMap.dumpOneMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
 public void armDump() {
	 dumpOneLocal.set(0.1);
 }
 
 public void stop () {
	 dumpOneLocal.set(0);
 }

}


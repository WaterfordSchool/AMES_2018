package org.usfirst.frc.team3245.robot.subsystems;

import org.usfirst.frc.team3245.robot.RobotMap;
import org.usfirst.frc.team3245.robot.commands.dumpOneCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class JoystickDump1 extends Subsystem {
	
	private final Talon JSDumpOne = RobotMap.dumpOneMotor;

    public void initDefaultCommand() {
    	
    	setDefaultCommand(new dumpOneCommand());
    	
    }
    
    public void activate(double left, double blank) {
     RobotMap.dumpOneJoystickDrive.arcadeDrive(left, blank);
        	
    }
    
    public void activate(Joystick joy) {
    	activate(joy.getY(), 0);
    }
    
    public void armDump() {
    	JSDumpOne.set(.3);
    }
    
    public void reset() {
    	JSDumpOne.set(-.3);
    }
    
    public void stop() {
    	JSDumpOne.set(0);
    }
}


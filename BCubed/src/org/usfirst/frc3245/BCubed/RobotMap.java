// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3245.BCubed;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController dumpOned1;
    public static SpeedController dumpTwod2;
    public static SpeedController driveTrainleftDrive;
    public static SpeedController driveTrainrightDrive;
    public static DifferentialDrive driveTrainTDrive;
    public static SpeedController shooshter;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        
    	
    	//SUBSYSTEMS
        dumpOned1 = new Talon(8);
        LiveWindow.addActuator("DumpOne", "d1", (Talon) dumpOned1);
        dumpOned1.setInverted(false);
        
        dumpTwod2 = new Talon(9);
        LiveWindow.addActuator("DumpTwo", "d2", (Talon) dumpTwod2);
        dumpTwod2.setInverted(false);
        
        shooshter = new Talon(7);
        LiveWindow.addActuator("Shooter", "shooter", (Talon) shooshter);
        shooshter.setInverted(false);
        
        //DriveTrain
        driveTrainleftDrive = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "leftDrive", (Talon) driveTrainleftDrive);
        driveTrainleftDrive.setInverted(false);
        
        driveTrainrightDrive = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "rightDrive", (Talon) driveTrainrightDrive);
        driveTrainrightDrive.setInverted(false);
        
        driveTrainTDrive = new DifferentialDrive(driveTrainleftDrive, driveTrainrightDrive);
        LiveWindow.addActuator("DriveTrain", "TDrive", driveTrainTDrive);
        driveTrainTDrive.setSafetyEnabled(true);
        
        driveTrainTDrive.setExpiration(0.1);
        driveTrainTDrive.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

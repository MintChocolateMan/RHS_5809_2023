/* 
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.robotCode.commands;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotCode.RobotKeybindsAndFunctions.*;
import frc.robot.robotCode.subsystems.*;

public class autoAim extends CommandBase {

    private Swerve m_drivetrain;
    private LimeLight LimeLight;
    
    public autoAim(Swerve drivetrain, LimeLight LimeLight) {
        addRequirements(drivetrain);
        addRequirements(LimeLight);
        m_drivetrain = drivetrain;
    }

    @Override
    public void initialize() {
      //orient the robot such that it faces perpedicular to the scoring wall
    }

    @Override
    public void execute() {
      if (LimeLight.getHasTarget()==true) {
        if (LimeLight.getXOffset() < 0) {
          m_drivetrain.drive(new ChassisSpeeds(-.2, 0, 0));
        }
        else if (LimeLight.getXOffset() > 0) {
          m_drivetrain.drive(new ChassisSpeeds(.2, 0, 0));
        }
        else if (LimeLight.getYOffset() < 0) {
          m_drivetrain.drive(new ChassisSpeeds(0, .2, 0));
        }
        else if (LimeLight.getYOffset() > 0) {
          m_drivetrain.drive(new ChassisSpeeds(0, -.2, 0));
        }
        else{
          m_drivetrain.drive(new ChassisSpeeds(0, 0, 0));
        }
      }
    }

    @Override
    public boolean isFinished() {
        return false;
    }
    
    @Override
    public void end(boolean interrupted) {
      m_drivetrain.drive(new ChassisSpeeds(0, 0, 0));
    }


}
*/
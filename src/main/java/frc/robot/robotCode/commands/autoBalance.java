// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.robotCode.commands;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotCode.RobotKeybindsAndFunctions.*;
import frc.robot.robotCode.subsystems.*;

public class autoBalance extends CommandBase {

    private Swerve m_drivetrain;
    
    public autoBalance(Swerve drivetrain ) {
        addRequirements(drivetrain);
        m_drivetrain = drivetrain;
    }

    @Override
    public void initialize() {
       //m_drivetrain.resetBalance();
       
    }

    @Override
    public void execute() {
      m_drivetrain.balance();
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
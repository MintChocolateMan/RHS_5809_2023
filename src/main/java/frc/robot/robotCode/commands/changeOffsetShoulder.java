// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.robotCode.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.robotCode.RobotKeybindsAndFunctions.RobotContainer;

public class changeOffsetShoulder extends CommandBase {
  /** Creates a new changeOffset. */
  private final double offset;
  boolean x;
  public changeOffsetShoulder(double offset) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.offset = offset;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    x = false;
    RobotContainer.shoulderOffset += offset;
    x = true;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return x;
  }
}

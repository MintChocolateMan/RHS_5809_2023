//nedick addition 3/5

//import supporting packages. Note you need to import the correct subsystem
package frc.robot.robotCode.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
//if your code isn't working make sure the sub below is right
import frc.robot.robotCode.subsystems.ShoulderSub;

public class shoulderUp extends CommandBase {

  //any called variables in your subsytem go in here
  // the way I'm doing this is lazy but functional. SpeedD isn't used here, but fight me.
  private final ShoulderSub shoulderSub;
  private final double speed;
  private final double speedD;
  
//create the command to move
//i'm setting it up to allow for a speed up and down to be passed no matter what.
// that's a bit kludge-y but I also don't particularlly mind it. Note that one of the
// two values (speed, speedD) needs to be zero (0) ANY time you send this command. 
  public shoulderUp(ShoulderSub shoulderSub, double speed, double speedD) {
    this.shoulderSub = shoulderSub;
    this.speed = speed;
    this.speedD = speedD;
    addRequirements(shoulderSub);

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    shoulderSub.initializeCounter();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    shoulderSub.shoulderUP(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    shoulderSub.shoulderUP(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return shoulderSub.isSwitchSet();
  }
}

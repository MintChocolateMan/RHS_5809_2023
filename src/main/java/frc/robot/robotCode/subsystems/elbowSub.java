//Nendick addition 3/5

//these import the key library...things The most important is the vendordep for rev, which is up to date on 3/5
package frc.robot.robotCode.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import frc.robot.robotCode.ConstantsAndConfigs.*;
//imported the whole of the constants because I had issues doing it the "right" way - this works fine, and it's not a huge size penalty
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class elbowSub extends SubsystemBase {
  //this creates the subsystem for the elbow
 
    CANSparkMax elbowA = new CANSparkMax(Constants.armConstants.kelbowmotor, MotorType.kBrushless);
    //critical step that sets the sparkMax to the brushless

    public elbowSub(){

      elbowA.setInverted(false);
    
  }

  public void elUP(double speed){
    //this is the up command

   elbowA.set(speed);
  }

  public void elDOWN(double speedD){
    //this is the down command
    elbowA.set(-1*speedD);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

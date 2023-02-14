package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.*;

public class DriveSubsystem extends SubsystemBase {
	private final VictorSPX leftMotor1 = new VictorSPX(DriveConstants.leftMotor1Port);
	private final VictorSPX leftMotor2 = new VictorSPX(DriveConstants.leftMotor2Port);
	private final VictorSPX rightMotor1 = new VictorSPX(DriveConstants.rightMotor1Port);
	private final VictorSPX rightMotor2 = new VictorSPX(DriveConstants.rightMotor2Port);

	public DriveSubsystem() {
		rightMotor1.setInverted(true);
		rightMotor2.setInverted(true);

		leftMotor1.setNeutralMode(NeutralMode.Brake);
		leftMotor2.setNeutralMode(NeutralMode.Brake);
		rightMotor1.setNeutralMode(NeutralMode.Brake);
		rightMotor2.setNeutralMode(NeutralMode.Brake);
	}

	public void tankDrive(double leftSpeed, double rightSpeed) {

		leftMotor1.set(ControlMode.PercentOutput, leftSpeed);
		leftMotor2.set(ControlMode.PercentOutput, leftSpeed);

		rightMotor1.set(ControlMode.PercentOutput, rightSpeed);
		rightMotor2.set(ControlMode.PercentOutput, rightSpeed);
	}

	@Override
	public void periodic() {

	}
}

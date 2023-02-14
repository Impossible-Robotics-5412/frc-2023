package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

import java.util.function.DoubleSupplier;

public class DefaultDriveCommand extends CommandBase {
	private final DriveSubsystem driveSubsystem;
	private final DoubleSupplier left;
	private final DoubleSupplier right;

	public DefaultDriveCommand(DriveSubsystem subsystem, DoubleSupplier left, DoubleSupplier right) {
		this.driveSubsystem = subsystem;
		this.left = left;
		this.right = right;

		addRequirements(driveSubsystem);
	}

	@Override
	public void execute() {
		driveSubsystem.tankDrive(left.getAsDouble(), right.getAsDouble());
	}
}
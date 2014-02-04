package org.frc4931.zach.drive;

import edu.wpi.first.wpilibj.DigitalInput;

public class LimitedMotor extends Motor{
	public final DigitalInput highLimit;
	public final DigitalInput lowLimit;
	public LimitedMotor(int channel, int type, int highLimit, int lowLimit) {
		super(channel, type);
		this.highLimit = new DigitalInput(highLimit);
		this.lowLimit = new DigitalInput(lowLimit);
	}
	public boolean isHigh(){
		return highLimit.get();
	}
	public boolean isLow(){
		return lowLimit.get();
	}

}
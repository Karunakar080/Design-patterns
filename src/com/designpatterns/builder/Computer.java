package com.designpatterns.builder;

public class Computer {
	//required parameters
   private String RAM;
   private String HDD;
   private String CPU;
   
    //optional parameters required   
    private boolean isGraphicEnabled;
    private boolean isBlueToothEnabled;
    
	private Computer(Builder builder) {
		// TODO Auto-generated constructor stub
		this.RAM=builder.RAM;
    	this.HDD=builder.HDD;
    	this.CPU=builder.CPU;
    	this.isGraphicEnabled = builder.isGraphicEnabled;
    	this.isBlueToothEnabled = builder.isBlueToothEnabled;
	}
	public String getRam() {
		return RAM;
	}
	public void setRam(String ram) {
		RAM = ram;
	}
	public String getHdd() {
		return HDD;
	}
	public void setHdd(String hdd) {
		HDD = hdd;
	}
	public String getCpu() {
		return CPU;
	}
	public void setCpu(String cpu) {
		CPU = cpu;
	}
	
	public static class Builder{
		//required parameters
		   private String RAM;
		   private String HDD;
		   private String CPU;
		   
		    //optional parameters required   
		    private boolean isGraphicEnabled;
		    private boolean isBlueToothEnabled;
		    
		    public Builder(String ram,String hdd,String cpu) {
		    	this.RAM=ram;
		    	this.HDD=hdd;
		    	this.CPU=cpu;
		    }
		    
		   
			public Builder setGraphicEnabled(boolean isGraphicEnabled) {
				this.isGraphicEnabled = isGraphicEnabled;
				return this;
			}
			public Builder setBlueToothEnabled(boolean isBlueToothEnabled) {
				this.isBlueToothEnabled = isBlueToothEnabled;
				return this;
			}
		    
		    public Computer build() {
		    	return new Computer(this);
		    }
		
	}
}

package com.designpatterns.builder;

public class ComputerBuilderDirector {
	
	public Computer getBasicComputer() {
	return new Computer.Builder("2GB","2TB","intel i7").build();
	}
   
	public Computer getGraphicEnabledComputer() {
		return new Computer.Builder("2GB","2TB","intel i7").setGraphicEnabled(true).build();
		}
}

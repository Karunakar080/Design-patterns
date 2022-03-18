package com.designpattern.builderClient;

import com.designpatterns.builder.Computer;

public class ComputerClient {
	public static void main(String[] args) {
		Computer com = new Computer.Builder("2GB","2TB","intel i7").build();
		Computer com1 = new Computer.Builder("2GB","2TB","intel i7").setGraphicEnabled(true).build();
		System.out.println(com1);
	}

}

package com.coderising.dp.command;

public class OrderSteakCommand implements Command {
	private Cook cook;

	public OrderSteakCommand(Cook cook) {
		this.cook = cook;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		cook.cookSteak();
	} 
}

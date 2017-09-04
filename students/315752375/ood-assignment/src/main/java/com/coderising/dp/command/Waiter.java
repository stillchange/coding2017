package com.coderising.dp.command;

import java.util.LinkedList;
import java.util.List;

public class Waiter {
	List<Command> Commands;

	public Waiter() {
		Commands=new LinkedList<>();
	}
	public void addOrder(Command command){
		Commands.add(command);
	}
	public void remove(Command command){
		Commands.remove(command);
	}
	public void sendOrders(){
		for(Command command:Commands){
			command.excute();
		}
	}
}

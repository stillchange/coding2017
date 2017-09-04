package com.coderising.dp.command;

import static org.junit.Assert.*;

import org.junit.Test;

public class WaiterTest {

	@Test
	public void testSendOrders() {
		Cook cook = new Cook();
		Waiter waiter = new Waiter();
		Command command1 = new OrderSteakCommand(cook);
		Command command2 = new OrderPorkCommand(cook);
		
		waiter.addOrder(command1);
		waiter.addOrder(command2);
		
		waiter.sendOrders();
	}

}

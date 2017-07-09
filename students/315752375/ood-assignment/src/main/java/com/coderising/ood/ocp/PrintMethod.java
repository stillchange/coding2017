package com.coderising.ood.ocp;

public class PrintMethod implements Method{

	@Override
	public void send(String logMsg) {
		// TODO Auto-generated method stub
		System.out.println("Print:"+logMsg);
	}

}

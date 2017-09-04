package com.coderising.dp.handlechain;

public interface Logger {
	public static int DEBUG=1;
	public static int NOTICE=2;
	public static int ERR=3;
	public void message(String mes,int op);
	public Logger setNext(Logger nextLogger);

}

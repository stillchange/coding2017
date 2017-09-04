package com.coderising.dp.handlechain;

public class StdoutLogger implements Logger {
	private Logger nextLogger;
	private int level;

	public StdoutLogger(int level) {
		this.level = level;
	}

	@Override
	public void message(String mes, int op) {
		// TODO Auto-generated method stub
		if (level == op)
			System.out.println(mes);
		else {
			System.out.println("StdoutLogger can't handle this message " + mes);
			if (nextLogger != null) {
				System.out.println("give it to next logger");
				nextLogger.message(mes, op);
			} else
				new IllegalArgumentException("there is no logger that can handle this message!").printStackTrace();
		}
	}

	@Override
	public Logger setNext(Logger nextLogger) {
		// TODO Auto-generated method stub
		this.nextLogger = nextLogger;
		return this;
	}

}

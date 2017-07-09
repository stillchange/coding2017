package com.coderising.ood.ocp;

public class Logger {
	
	Type type = null;
	Method method = null;
			
	public Logger(Type logType, Method method){
		this.type = logType;
		this.method = method;		
	}
	public void log(String msg){
		
		String logMsg=type.getMessage(msg);
		
		method.send(logMsg);
	}
}


package com.coderising.ood.ocp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoggerTest {

	RowLog rl=null;
	RowLogWithDate rlwd=null;
	
	MailMethod mm=null;
	SMSMethod sm=null;
	PrintMethod pm=null;
	
	Logger logger=null;
	@Before
	public void setUp() throws Exception {
		rl=new RowLog();
		rlwd=new RowLogWithDate();
		
		mm=new MailMethod();
		sm=new SMSMethod();
		pm=new PrintMethod();
	}

	@Test
	public void test() {
		{
			logger=new Logger(rl, mm);
			logger.log("test1");
		}
		{
			logger=new Logger(rl, sm);
			logger.log("test2");
		}
		{
			logger=new Logger(rl, pm);
			logger.log("test3");
		}
		{
			logger=new Logger(rlwd, mm);
			logger.log("test4");
		}
		{
			logger=new Logger(rlwd, sm);
			logger.log("test5");
		}
		{
			logger=new Logger(rlwd, pm);
			logger.log("test6");
		}
	}

}

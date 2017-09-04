package com.coderising.dp.handlechain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoggerTest {

	@Test
	public void testMessage() {
		Logger logger = new StdoutLogger(Logger.DEBUG).setNext(new EmailLogger(Logger.NOTICE).setNext(new FileLogger(Logger.ERR)));
		logger.message("进入计算函数", Logger.DEBUG);
		logger.message("第一步已经完成", Logger.NOTICE);
		logger.message("一个致命的错误发生了", Logger.ERR);
	}

}

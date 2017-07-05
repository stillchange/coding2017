package com.coderising.ood.srp;

import java.io.IOException;
import java.util.HashMap;

public class MailConfiguration {
	protected String smtpHost = null;
	protected String altSmtpHost = null; 
	protected String fromAddress = null;
	protected String toAddress = null;
	protected String subject = null;
	protected String message = null;
	boolean debug;
	private static Configuration config; 
	
	private static final String NAME_KEY = "NAME";
	private static final String EMAIL_KEY = "EMAIL";
	public MailConfiguration(boolean debug){
		this.debug=debug;
		config=new Configuration();
		setAltSMTPHost();
		setAltSMTPHost();
		setFromAddress();
	}
	protected void setMessage(HashMap userInfo,String productDesc) throws IOException 
	{
		String name = (String) userInfo.get(NAME_KEY);
		subject = "您关注的产品降价了";
		message ="尊敬的 "+name+", 您关注的产品 " + productDesc + " 降价了，欢迎购买!" ;
	}
	protected void setToAddress(HashMap userInfo) throws IOException 
	{
		toAddress = (String) userInfo.get(EMAIL_KEY); 
	}
	protected void setSMTPHost() 
	{
		smtpHost = config.getProperty(ConfigurationKeys.SMTP_SERVER); 
	}

	
	protected void setAltSMTPHost() 
	{
		altSmtpHost = config.getProperty(ConfigurationKeys.ALT_SMTP_SERVER); 

	}
	protected void setFromAddress() 
	{
			fromAddress = config.getProperty(ConfigurationKeys.EMAIL_ADMIN); 
	}
	protected void sendEmail() {
		try 
		{
			if (toAddress.length() > 0)
				MailUtil.sendEmail(toAddress, fromAddress, subject, message, smtpHost, debug);
		} 
		catch (Exception e) 
		{
			
			try {
				MailUtil.sendEmail(toAddress, fromAddress, subject, message, altSmtpHost, debug); 
				
			} catch (Exception e2) 
			{
				System.out.println("通过备用 SMTP服务器发送邮件失败: " + e2.getMessage()); 
			}
		}
	}
	
}

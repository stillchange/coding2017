package com.coderising.dp.decorator;

public class EmailStatement extends EmailDecorator {
	public EmailStatement(Email email) {
		this.email=email;
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return email.getContent()+"\n本邮件仅为个人观点，并不代表本公司立场" ;
	}

}

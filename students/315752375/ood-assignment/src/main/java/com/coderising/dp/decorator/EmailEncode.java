package com.coderising.dp.decorator;

public class EmailEncode extends EmailDecorator {
	public EmailEncode(Email email) {
		this.email=email;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "+++++++++++++++\n"+email.getContent()+"\n+++++++++++++++以上部分已加密!";
	}

}

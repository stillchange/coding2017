package com.coderising.ood.ocp;

public class RowLogWithDate implements Type{

	@Override
	public String getMessage(String Msg) {
		// TODO Auto-generated method stub
		return DateUtil.getCurrentDateAsString()+":"+Msg;
	}

}

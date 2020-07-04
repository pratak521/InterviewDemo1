package com.pat.dao;

import org.springframework.stereotype.Repository;

@Repository
public class SendMsgImpl implements Message {

	@Override
	public String sendMsg() {
		// TODO Auto-generated method stub
		return "This is Pravin saying Hello and will stop when get very good with Spring and all Java";
	}

}

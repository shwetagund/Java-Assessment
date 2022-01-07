package com.example.demo;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class MyServiceSample {

	@Retryable(value = Exception.class, maxAttempts = 20)
//	public String serviceInvoked() {
//		return "This is Sample Service Invoked";
//	}
	public String serviceInvoked() {
		String msg;
		try {
			msg="demo service";
			new Exception();
		}
		catch (Exception e) {
			msg="error occured in demo services";
		}
		return msg;
	}


	@Recover
	public String serviceRecovered() {
		return "This is Sample Service Recovered";
	}

}
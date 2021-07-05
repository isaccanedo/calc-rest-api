package com.isaccanedo.advcal.service;

import com.isaccanedo.advcal.model.Response;

public interface ResponseService {
	
	Response getAdd(int firstNumber, int SecondNumber);
	Response getAdd(Response response);
	Response getSub(int firstNumber, int SecondNumber);
	Response getSub(Response response);
	Response getMultiply(int firstNumber, int SecondNumber);
	Response getMultiply(Response response);
	Response getDevide(int firstNumber, int SecondNumber);
	Response getDevide(Response response);

}

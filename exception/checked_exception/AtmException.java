package com.xworkz.corejava.exception.checked_exception;

public class AtmException extends Exception{
	@Override
	public String toString() {
		return "Invaild amount entered.";
	}
	@Override
	public String getMessage() {
		return "You are crossing a limit";
	}
}

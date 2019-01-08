package com.example.friojspring.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsernameTakenException extends Exception{
	public UsernameTakenException() {
		super("This username already exists.");
	}
}

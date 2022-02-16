package com.joel.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.joel.enums.Categorytype;

@Retention(RUNTIME)
@Target(METHOD)
public @interface FrameworkAnnotations {

	public String[] author();
	public Categorytype[] groups();
}

package com.programming.design.pattern.singleton;

import java.io.Serializable;

public final class SingletonWithDoubleChecking  implements Serializable, Cloneable{


	private static final long serialVersionUID = 1L;

	private static SingletonWithDoubleChecking instance;

	public static SingletonWithDoubleChecking getInstance() {
		
	if(instance==null) {
	  synchronized(SingletonWithDoubleChecking.class) {
		  if(instance==null)
			  return new SingletonWithDoubleChecking();		  
	  }
		}
		
	return new SingletonWithDoubleChecking();
		
	
		
	}
	
	protected SingletonWithDoubleChecking clone() throws CloneNotSupportedException{
		
		throw new CloneNotSupportedException();
	}
	
	private Object readResolve() {
	    return instance;
	}
	
}

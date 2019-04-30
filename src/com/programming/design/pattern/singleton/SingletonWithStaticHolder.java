package com.programming.design.pattern.singleton;
/*
 * 
 * 
 * The JVM defers initializing the InstanceHolder class until it is actually used, 
 * and because the SingletonWithStaticHolder is initialized with a static initializer, no additional synchronization is needed. 
 * The first call to getInstance by any thread causes InstanceHolder to be loaded and initialized, 
 * at which time the initialization of the SingletonWithStaticHolder happens through the static initializer.

Static holder pattern is also considered as the smartest replace for Double-check-locking antipattern.
 * 
 * 
 */
public class SingletonWithStaticHolder {

	private static class InstanceHolder {
		
		private static SingletonWithStaticHolder INSTANCE = new SingletonWithStaticHolder();
	}
	
	private SingletonWithStaticHolder() {
		
	}
	
	public static SingletonWithStaticHolder getInstance() {
		return InstanceHolder.INSTANCE;
	}
}

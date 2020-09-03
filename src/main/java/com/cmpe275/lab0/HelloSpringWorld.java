package com.cmpe275.lab0;
/**
 * HelloSpringWorld Class implementing the Greeter interface
 */
public class HelloSpringWorld implements Greeter {
	/**
	 *  The member attribute for the class 
	 */
	private String name;

	/**
	 *	@param name 
	 *  The setter method for using the setter injection of greeter bean
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return message
	 * The get method to return the required output
	 */
	public String getGreeting() {
		String message = "Hello world from "+ this.name;
		return message;
	}
}

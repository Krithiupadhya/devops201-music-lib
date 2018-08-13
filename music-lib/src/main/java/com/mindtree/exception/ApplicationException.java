/**
 * 
 */
package com.mindtree.exception;

/**
 * @author Krithi
 *
 */
public class ApplicationException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2180348972548317896L;

	/**
	 * 
	 * @param e
	 */
	public ApplicationException(Exception e) {
		super(e);
	}

}

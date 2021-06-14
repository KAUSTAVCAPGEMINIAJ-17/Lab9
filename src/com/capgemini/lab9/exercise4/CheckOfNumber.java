package com.capgemini.lab9.exercise4;

/**
 * 
 * @author Kaustav
 *
 */
public class CheckOfNumber {
	  private int n;
	  
	  public CheckOfNumber() {
		super();
	}
/**
 * 
 * @param n
 */
	public CheckOfNumber(int n) {
		super();
		this.n = n;
	}
/**
 * 
 * @return n
 */
	public int getNum() {
		return n;
	}
/**
 * 
 * @param n
 */
	public void setNum(int n) {
		this.n = n;
	}

    /** 
     * 
     * @param n
     * @return check if n is bigger than the input number
     */
    boolean isBigger(int num) {
        return n > num;
    }
}
package com.bridgelabz.linecomparisionproblem;
import java.text.DecimalFormat;

public class LineComparision {
        //Decimal Formatter
	private static DecimalFormat df=new DecimalFormat("0.00");

	public static void main(String[] args) {
		//Welcome message
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		
		//Variables
		double length;
		int x1=(int) Math.floor(Math.random()*100);
		int x2=(int) Math.floor(Math.random()*100);
	    int y1=(int) Math.floor(Math.random()*100);
	    int y2=(int) Math.floor(Math.random()*100);
	    
	    //Length computation
	    length=Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	    
	    System.out.println("Length of a line is :"+df.format(length));
	}
}

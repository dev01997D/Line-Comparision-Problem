package com.bridgelabz.linecomparisionproblem;
import java.text.DecimalFormat;

public class LineComparision {
        //Decimal Formatter
	private static DecimalFormat df=new DecimalFormat("0.00");

	public static void main(String[] args) {
	    //Welcome message
	    System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		
	    //Variables
	    double length1, length2;
	    int compareValue;
	    int x1=(int) Math.floor(Math.random()*100);
	    int x2=(int) Math.floor(Math.random()*100);
	    int y1=(int) Math.floor(Math.random()*100);
	    int y2=(int) Math.floor(Math.random()*100);
	    int x3=(int) Math.floor(Math.random()*100);
	    int x4=(int) Math.floor(Math.random()*100);
	    int y3=(int) Math.floor(Math.random()*100);
	    int y4=(int) Math.floor(Math.random()*100);
	    
	    //Length computation
	    length1=Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	    length2=Math.sqrt(Math.pow((x4-x3), 2) + Math.pow((y4-y3), 2));
	    
	    //Wrapper class
            Double obj1 = new Double(df.format(length1)); 
            Double obj2 = new Double(df.format(length2));
        
           //Comparision by compareTo method
            compareValue = obj1.compareTo(obj2); 
	    
	    System.out.println("Length of line 1 is : "+df.format(length1) +"\tline 2 is : "+df.format(length2));
	    if(compareValue==0) {
	    	System.out.println("Both the lines are equal");
	    }
	    else if(compareValue<0){
	    	System.out.println("Line 2 is greater than line 1");
	    }
	    else {
	    	System.out.println("Line 1 is greater than line 2");
	    }
	}
}
